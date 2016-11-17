package com.modelmanage;

import java.util.List;
import java.util.UUID;

import com.modelmanage.enumtype.operatorType;
import com.modelmanage.enumtype.priorityType;
import com.modelmanage.po.OVersion;
import com.modelmanage.po.OperationFather;
import com.modelmanage.po.PhotoFather;

public interface VersionManageInterface {
    // ------ 配置项
    void setConfig(String baseUrl, String userBy, String projectId) throws Exception;
    void setConfig(String baseUrl, String projectId) throws Exception;
    void setUser(String userBy);
    void setProjectId(String projectId);
    void change2Global() throws Exception;
    void change2Local() throws Exception;
    void change2Local(String userBy) throws Exception;
    void change2Local(String baseUrl, String userBy, String projectId) throws Exception;
    // ----- end
    long getTiming();
    UUID getNewGuid();
    String getGlobalPath();
    String getProjectPath();
    String getUserPath(String user);
    String serialize(Object obj) throws Exception;
    Object deSerialize(String objStr) throws Exception;
    OperationFather createOperation(String operateOid, operatorType type, String oldValue, String newValue) throws Exception;
    OperationFather createModifyOperation(String operateOid, String attributeName, String oldValue, String newValue) throws Exception;
    OperationFather createAddOperation(String operateOid, Object addObject) throws Exception;
    OperationFather createDeleteOperation(String operateOid, Object deleteObject) throws Exception;
    List<OperationFather> getOperationList() throws Exception;
    List<PhotoFather> getPhotoList() throws Exception;
    List<OVersion> getVersionList() throws Exception;
    List<OVersion> getVersionList(int range_left, int range_right) throws Exception;
    void addOperation(OperationFather operation) throws Exception;
    void submitVersion(String description, String userby, String email, priorityType priority) throws Exception;
    void submitVersion(String description,String userby, String email) throws Exception;
    void resetPhoto() throws Exception;
    void resetPhoto(int lastVersion) throws Exception;
    void back2Version(int lastVersion) throws Exception;
    int getLastVersion() throws Exception;
    void cloneByUrl(String aimUrl) throws Exception;
    void cloneByUrl(String sourceUrl, String aimUrl) throws Exception;
    boolean pushAuto() throws Exception;
    boolean pullAuto() throws Exception;

    void setConflictResAutoMethod(Object obj) throws Exception;
    Object getAllConflictResAutoMethod() throws Exception;

    Object getAllConflicts() throws Exception;
    void conflictResByAdmin(Object obj) throws Exception;
}
