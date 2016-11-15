package test.com.modelmanage;

import com.modelmanage.po.ValueStore;
import com.modelmanage.VersionMangeInterfaceImpl;
import org.junit.Before;
import org.junit.Test;

/** 
* VersionMangeInterfaceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>十一月 14, 2016</pre> 
* @version 1.0 
*/ 
public class VersionMangeInterfaceImplTest {
    VersionMangeInterfaceImpl vm;
@Before
public void before() throws Exception {
    String url = "D:\\3n307_experiments\\modelManage2016-10-24_Wang\\modelManage\\modelManage\\data";

    //VersionMangeInterfaceImpl vm = new VersionMangeInterfaceImpl();
    //vm.setConfig(url, "ljn", "项目3");

    vm = new VersionMangeInterfaceImpl(url, "ch", "项目3");
}


/** 
* 
* Method: addOperation(OperationFather operation) 
* 
*/ 
@Test
public void testAddOperation() throws Exception { 
vm.createAddOperation("3", new ValueStore("我是初", "我是末"));
} 

/** 
* 
* Method: back2Version(int lastVersion) 
* 
*/ 
@Test
public void testBack2Version() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: change2Global() 
* 
*/ 
@Test
public void testChange2Global() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: change2Local() 
* 
*/ 
@Test
public void testChange2Local() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: change2Local(String userBy) 
* 
*/ 
@Test
public void testChange2LocalUserBy() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: change2Local(String baseUrl, String userBy, String projectId) 
* 
*/ 
@Test
public void testChange2LocalForBaseUrlUserByProjectId() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: cloneByUrl(String aimUrl) 
* 
*/ 
@Test
public void testCloneByUrlAimUrl() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: cloneByUrl(String sourceUrl, String aimUrl) 
* 
*/ 
@Test
public void testCloneByUrlForSourceUrlAimUrl() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: createAddOperation(String operateOid, Object addObject) 
* 
*/ 
@Test
public void testCreateAddOperation() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: createDeleteOperation(String operateOid, Object deleteObject) 
* 
*/ 
@Test
public void testCreateDeleteOperation() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: createModifyOperation(String operateOid, String attributeName, String oldValue, String newValue) 
* 
*/ 
@Test
public void testCreateModifyOperation() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: createOperation(String operateOid, operatorType type, String oldValue, String newValue) 
* 
*/ 
@Test
public void testCreateOperation() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: deSerialize(String objStr) 
* 
*/ 
@Test
public void testDeSerialize() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getLastVersion() 
* 
*/ 
@Test
public void testGetLastVersion() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getNewGuid() 
* 
*/ 
@Test
public void testGetNewGuid() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getOperationList() 
* 
*/ 
@Test
public void testGetOperationList() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getPhotoList() 
* 
*/ 
@Test
public void testGetPhotoList() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getTiming() 
* 
*/ 
@Test
public void testGetTiming() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getVersionList() 
* 
*/ 
@Test
public void testGetVersionList() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getVersionList(int range_left, int range_right) 
* 
*/ 
@Test
public void testGetVersionListForRange_leftRange_right() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: pullAuto() 
* 
*/ 
@Test
public void testPullAuto() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: pushAuto() 
* 
*/ 
@Test
public void testPushAuto() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: resetPhoto() 
* 
*/ 
@Test
public void testResetPhoto() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: resetPhoto(int lastVersion) 
* 
*/ 
@Test
public void testResetPhotoLastVersion() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: serialize(Object obj) 
* 
*/ 
@Test
public void testSerialize() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setConfig(String baseUrl, String projectId) 
* 
*/ 
@Test
public void testSetConfigForBaseUrlProjectId() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setConfig(String baseUrl, String userBy, String projectId) 
* 
*/ 
@Test
public void testSetConfigForBaseUrlUserByProjectId() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: submitVersion(String description, String userby, String email, priorityType priority) 
* 
*/ 
@Test
public void testSubmitVersionForDescriptionUserbyEmailPriority() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: conflictResByAdmin(Object obj) 
* 
*/ 
@Test
public void testConflictResByAdmin() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setConflictResAutoMethod(Object obj) 
* 
*/ 
@Test
public void testSetConflictResAutoMethod() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getAllConflictResAutoMethod() 
* 
*/ 
@Test
public void testGetAllConflictResAutoMethod() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getAllConflicts() 
* 
*/ 
@Test
public void testGetAllConflicts() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getGlobalPath() 
* 
*/ 
@Test
public void testGetGlobalPath() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getProjectPath() 
* 
*/ 
@Test
public void testGetProjectPath() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getUserPath(String user) 
* 
*/ 
@Test
public void testGetUserPath() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: submitVersion(String description, String userby, String email) 
* 
*/ 
@Test
public void testSubmitVersionForDescriptionUserbyEmail() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setUser(String userBy) 
* 
*/ 
@Test
public void testSetUser() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setProjectId(String projectId) 
* 
*/ 
@Test
public void testSetProjectId() throws Exception { 
//TODO: Test goes here... 
} 


} 
