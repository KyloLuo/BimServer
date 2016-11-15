package org.bimserver.webservices.impl;

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

import org.bimserver.database.DatabaseSession;
import org.bimserver.database.Query;
import org.bimserver.database.actions.BimDatabaseAction;
import org.bimserver.database.actions.ChangePasswordDatabaseAction;
import org.bimserver.database.actions.RequestPasswordChangeDatabaseAction;
import org.bimserver.database.actions.ValidateUserDatabaseAction;
import org.bimserver.interfaces.objects.SUser;
import org.bimserver.models.store.User;
import org.bimserver.shared.exceptions.ServerException;
import org.bimserver.shared.exceptions.UserException;
import org.bimserver.shared.interfaces.AuthInterface;
import org.bimserver.shared.interfaces.ServiceInterface;
import org.bimserver.webservices.ServiceMap;

public class AuthServiceImpl extends GenericServiceImpl implements AuthInterface {

	public AuthServiceImpl(ServiceMap serviceMap) {
		super(serviceMap);
	}

	@Override
	public SUser getLoggedInUser() throws ServerException, UserException {
		requireAuthenticationAndRunningServer();
		return getServiceMap().get(ServiceInterface.class).getUserByUoid(getAuthorization().getUoid());
	}

	@Override
	public Boolean changePassword(Long uoid, String oldPassword, String newPassword) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			BimDatabaseAction<Boolean> action = new ChangePasswordDatabaseAction(getBimServer(), session, getInternalAccessMethod(), uoid, oldPassword, newPassword, getAuthorization());
			return session.executeAndCommitAction(action);
		} catch (Exception e) {
			return handleException(e);
		} finally {
			session.close();
		}
	}
	
	@Override
	public void requestPasswordChange(String username, String resetUrl) throws ServerException, UserException {
		// No authentication required because you should be able to do this wihout logging in...
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			BimDatabaseAction<Void> action = new RequestPasswordChangeDatabaseAction(session, getInternalAccessMethod(), getBimServer(), username, resetUrl);
			session.executeAndCommitAction(action);
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public SUser validateAccount(Long uoid, String token, String password) throws ServerException, UserException {
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			BimDatabaseAction<User> action = new ValidateUserDatabaseAction(session, getInternalAccessMethod(), uoid, token, password);
			return getBimServer().getSConverter().convertToSObject(session.executeAndCommitAction(action));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public void setHash(Long uoid, byte[] hash, byte[] salt) throws ServerException, UserException {
		requireAdminAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			User user = session.get(uoid, Query.getDefault());
			user.setPasswordHash(hash);
			user.setPasswordSalt(salt);
			session.commit();
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}
	
//
//	@Override
//	public String createToken(Integer validitySeconds) throws UserException, ServerException {
//		Authorization authorization = null;
//		SUser currentUser = getCurrentUser();
//		if (currentUser.getUserType() == SUserType.ADMIN) {
//			authorization = new AdminAuthorization(validitySeconds, TimeUnit.SECONDS);
//		} else {
//			authorization = new UserAuthorization(validitySeconds, TimeUnit.SECONDS);
//		}
//		authorization.setUoid(currentUser.getOid());
//		String asHexToken = authorization.asHexToken(getBimServer().getEncryptionKey());
//		return asHexToken;
//	}
}