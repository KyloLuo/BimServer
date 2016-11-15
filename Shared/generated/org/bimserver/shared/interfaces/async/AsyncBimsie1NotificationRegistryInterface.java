package org.bimserver.shared.interfaces.async;

/******************************************************************************
 * Copyright (C) 2009-2014  BIMserver.org
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
import java.util.concurrent.ExecutorService;

import org.bimserver.shared.interfaces.bimsie1.Bimsie1NotificationRegistryInterface;

public class AsyncBimsie1NotificationRegistryInterface {

	private final ExecutorService executorService;
	private final Bimsie1NotificationRegistryInterface syncService;

	public AsyncBimsie1NotificationRegistryInterface(Bimsie1NotificationRegistryInterface syncService, ExecutorService executorService) {
		this.executorService = executorService;
		this.syncService = syncService;
	}
	//@ch
	//�ȴ�����ص�
	public interface GetProgressCallback {
		void success(org.bimserver.interfaces.objects.SLongActionState result);
		void error(Throwable e);
	}
	//@ch
	//�ȴ�project���̻ص�
	public interface GetProgressTopicsOnProjectCallback {
		void success(java.util.List<java.lang.Long> result);
		void error(Throwable e);
	}
	
	public interface GetProgressTopicsOnRevisionCallback {
		void success(java.util.List<java.lang.Long> result);
		void error(Throwable e);
	}
	
	public interface GetProgressTopicsOnServerCallback {
		void success(java.util.List<java.lang.Long> result);
		void error(Throwable e);
	}
	
	public interface RegisterChangeProgressOnProjectCallback {
		void success();
		void error(Throwable e);
	}
	
	public interface RegisterChangeProgressOnRevisionCallback {
		void success();
		void error(Throwable e);
	}
	
	public interface RegisterChangeProgressOnServerCallback {
		void success();
		void error(Throwable e);
	}
	
	public interface RegisterNewExtendedDataOnRevisionHandlerCallback {
		void success();
		void error(Throwable e);
	}
	
	public interface RegisterNewProjectHandlerCallback {
		void success();
		void error(Throwable e);
	}
	
	public interface RegisterNewRevisionHandlerCallback {
		void success();
		void error(Throwable e);
	}
	
	public interface RegisterNewRevisionOnSpecificProjectHandlerCallback {
		void success();
		void error(Throwable e);
	}
	
	public interface RegisterNewUserHandlerCallback {
		void success();
		void error(Throwable e);
	}
	
	public interface RegisterProgressHandlerCallback {
		void success();
		void error(Throwable e);
	}
	
	public interface RegisterProgressOnProjectTopicCallback {
		void success(java.lang.Long result);
		void error(Throwable e);
	}
	
	public interface RegisterProgressOnRevisionTopicCallback {
		void success(java.lang.Long result);
		void error(Throwable e);
	}
	
	public interface RegisterProgressTopicCallback {
		void success(java.lang.Long result);
		void error(Throwable e);
	}
	
	public interface UnregisterChangeProgressOnProjectCallback {
		void success();
		void error(Throwable e);
	}
	
	public interface UnregisterChangeProgressOnRevisionCallback {
		void success();
		void error(Throwable e);
	}
	
	public interface UnregisterChangeProgressOnServerCallback {
		void success();
		void error(Throwable e);
	}
	
	public interface UnregisterNewExtendedDataOnRevisionHandlerCallback {
		void success();
		void error(Throwable e);
	}
	
	public interface UnregisterNewProjectHandlerCallback {
		void success();
		void error(Throwable e);
	}
	
	public interface UnregisterNewRevisionHandlerCallback {
		void success();
		void error(Throwable e);
	}
	
	public interface UnregisterNewRevisionOnSpecificProjectHandlerCallback {
		void success();
		void error(Throwable e);
	}
	
	public interface UnregisterNewUserHandlerCallback {
		void success();
		void error(Throwable e);
	}
	
	public interface UnregisterProgressHandlerCallback {
		void success();
		void error(Throwable e);
	}
	
	public interface UnregisterProgressTopicCallback {
		void success();
		void error(Throwable e);
	}
	
	public interface UpdateProgressTopicCallback {
		void success();
		void error(Throwable e);
	}
	


	public void getProgress(final java.lang.Long topicId, final GetProgressCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getProgress(topicId));
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getProgressTopicsOnProject(final java.lang.Long poid, final GetProgressTopicsOnProjectCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getProgressTopicsOnProject(poid));
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getProgressTopicsOnRevision(final java.lang.Long poid, final java.lang.Long roid, final GetProgressTopicsOnRevisionCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getProgressTopicsOnRevision(poid, roid));
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getProgressTopicsOnServer(final GetProgressTopicsOnServerCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getProgressTopicsOnServer());
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void registerChangeProgressOnProject(final java.lang.Long endPointId, final java.lang.Long poid, final RegisterChangeProgressOnProjectCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.registerChangeProgressOnProject(endPointId, poid);
					callback.success();
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void registerChangeProgressOnRevision(final java.lang.Long endPointId, final java.lang.Long roid, final java.lang.Long poid, final RegisterChangeProgressOnRevisionCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.registerChangeProgressOnRevision(endPointId, roid, poid);
					callback.success();
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void registerChangeProgressOnServer(final java.lang.Long endPointId, final RegisterChangeProgressOnServerCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.registerChangeProgressOnServer(endPointId);
					callback.success();
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void registerNewExtendedDataOnRevisionHandler(final java.lang.Long endPointId, final java.lang.Long roid, final RegisterNewExtendedDataOnRevisionHandlerCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.registerNewExtendedDataOnRevisionHandler(endPointId, roid);
					callback.success();
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void registerNewProjectHandler(final java.lang.Long endPointId, final RegisterNewProjectHandlerCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.registerNewProjectHandler(endPointId);
					callback.success();
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void registerNewRevisionHandler(final java.lang.Long endPointId, final RegisterNewRevisionHandlerCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.registerNewRevisionHandler(endPointId);
					callback.success();
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void registerNewRevisionOnSpecificProjectHandler(final java.lang.Long endPointId, final java.lang.Long poid, final RegisterNewRevisionOnSpecificProjectHandlerCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.registerNewRevisionOnSpecificProjectHandler(endPointId, poid);
					callback.success();
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void registerNewUserHandler(final java.lang.Long endPointId, final RegisterNewUserHandlerCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.registerNewUserHandler(endPointId);
					callback.success();
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void registerProgressHandler(final java.lang.Long topicId, final java.lang.Long endPointId, final RegisterProgressHandlerCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.registerProgressHandler(topicId, endPointId);
					callback.success();
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void registerProgressOnProjectTopic(final org.bimserver.interfaces.objects.SProgressTopicType type, final java.lang.Long poid, final java.lang.String description, final RegisterProgressOnProjectTopicCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.registerProgressOnProjectTopic(type, poid, description));
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void registerProgressOnRevisionTopic(final org.bimserver.interfaces.objects.SProgressTopicType type, final java.lang.Long poid, final java.lang.Long roid, final java.lang.String description, final RegisterProgressOnRevisionTopicCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.registerProgressOnRevisionTopic(type, poid, roid, description));
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void registerProgressTopic(final org.bimserver.interfaces.objects.SProgressTopicType type, final java.lang.String description, final RegisterProgressTopicCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.registerProgressTopic(type, description));
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void unregisterChangeProgressOnProject(final java.lang.Long endPointId, final java.lang.Long poid, final UnregisterChangeProgressOnProjectCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.unregisterChangeProgressOnProject(endPointId, poid);
					callback.success();
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void unregisterChangeProgressOnRevision(final java.lang.Long endPointId, final java.lang.Long roid, final java.lang.Long poid, final UnregisterChangeProgressOnRevisionCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.unregisterChangeProgressOnRevision(endPointId, roid, poid);
					callback.success();
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void unregisterChangeProgressOnServer(final java.lang.Long endPointId, final UnregisterChangeProgressOnServerCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.unregisterChangeProgressOnServer(endPointId);
					callback.success();
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void unregisterNewExtendedDataOnRevisionHandler(final java.lang.Long endPointId, final java.lang.Long roid, final UnregisterNewExtendedDataOnRevisionHandlerCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.unregisterNewExtendedDataOnRevisionHandler(endPointId, roid);
					callback.success();
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void unregisterNewProjectHandler(final java.lang.Long endPointId, final UnregisterNewProjectHandlerCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.unregisterNewProjectHandler(endPointId);
					callback.success();
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void unregisterNewRevisionHandler(final java.lang.Long endPointId, final UnregisterNewRevisionHandlerCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.unregisterNewRevisionHandler(endPointId);
					callback.success();
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void unregisterNewRevisionOnSpecificProjectHandler(final java.lang.Long endPointId, final java.lang.Long poid, final UnregisterNewRevisionOnSpecificProjectHandlerCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.unregisterNewRevisionOnSpecificProjectHandler(endPointId, poid);
					callback.success();
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void unregisterNewUserHandler(final java.lang.Long endPointId, final UnregisterNewUserHandlerCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.unregisterNewUserHandler(endPointId);
					callback.success();
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void unregisterProgressHandler(final java.lang.Long topicId, final java.lang.Long endPointId, final UnregisterProgressHandlerCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.unregisterProgressHandler(topicId, endPointId);
					callback.success();
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void unregisterProgressTopic(final java.lang.Long topicId, final UnregisterProgressTopicCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.unregisterProgressTopic(topicId);
					callback.success();
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void updateProgressTopic(final java.lang.Long topicId, final org.bimserver.interfaces.objects.SLongActionState state, final UpdateProgressTopicCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.updateProgressTopic(topicId, state);
					callback.success();
				} catch (Throwable e) {
					callback.error(e);
				}
			}
		});
	}
	
}