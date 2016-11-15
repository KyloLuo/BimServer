package org.bimserver.longaction;

/******************************************************************************
 * Copyright (C) 2009-2015  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import java.util.GregorianCalendar;
import java.util.Iterator;

import org.bimserver.models.store.ActionState;
import org.bimserver.shared.exceptions.UserException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class LongActionManager {

	private static final Logger LOGGER = LoggerFactory.getLogger(LongActionManager.class);
	private static final int FIVE_MINUTES_IN_MS = 5000 * 60; // 5 minutes
	private final BiMap<Long, LongAction<?>> actions = HashBiMap.create();
	private volatile boolean running = true;

	public synchronized void start(final LongAction<?> longAction) throws CannotBeScheduledException {
		if (running) {
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					longAction.execute();
				}
			}, "LongAction Runner");
			longAction.init(thread);
			thread.setDaemon(true);
			thread.setName(longAction.getDescription());
			actions.put(longAction.getProgressTopic().getKey().getId(), longAction);
			thread.start();
		} else {
			throw new CannotBeScheduledException();
		}
	}

	public synchronized void shutdown() {
		running = false;
	}

	public synchronized LongAction<?> getLongAction(long id) {
		return actions.get(id);
	}

	public synchronized void cleanup() {
		Iterator<Long> iterator = actions.keySet().iterator();
		GregorianCalendar now = new GregorianCalendar();
		while (iterator.hasNext()) {
			long id = iterator.next();
			LongAction<?> longAction = actions.get(id);
			if (longAction.getActionState() == ActionState.FINISHED) {
				GregorianCalendar stop = longAction.getStop();
				if (now.getTimeInMillis() - stop.getTimeInMillis() > FIVE_MINUTES_IN_MS) {
					LOGGER.info("Cleaning up long running action: " + longAction.getDescription() + " - " + longAction.getClass().getSimpleName());
					iterator.remove();
				}
			}
		}
	}

	/*
	 * Untested method
	 */
	public synchronized void shutdownGracefully() {
		running = false;
		Iterator<LongAction<?>> iterator = actions.values().iterator();
		while (iterator.hasNext()) {
			LongAction<?> longAction = iterator.next();
			longAction.waitForCompletion();
		}
	}

	public synchronized void remove(long topicId) throws UserException {
		LongAction<?> longAction = actions.get(topicId);
		if (longAction != null) {
			LOGGER.debug("Cleaning up long running action: " + longAction.getDescription() + " (" + longAction.getProgressTopic().getKey().getId() + ")");
			longAction.stop();
			actions.remove(topicId);
		} else {
			throw new UserException("No long action with id " + topicId + " found");
		}
	}

	public synchronized void remove(LongAction<?> action) {
		LOGGER.info("Cleaning up long running action: " + action.getDescription());
		action.stop();
		actions.inverse().remove(action);
	}
}