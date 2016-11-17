package com.modelmanage;

import java.util.List;
import java.util.UUID;

import com.modelmanage.enumtype.operatorType;
import com.modelmanage.enumtype.pathType;
import com.modelmanage.enumtype.priorityType;
import com.modelmanage.enumtype.xmlType;
import com.modelmanage.po.OVersion;
import com.modelmanage.po.OperationFather;
import com.modelmanage.po.PhotoFather;

public class VersionMangeInterfaceImpl implements VersionManageInterface {

    DAL dal = new DAL();

    /// <summary>
    /// 创建local version manage 对象
    /// </summary>
    /// <param name="baseUrl">版本数据库路径</param>
    /// <param name="userBy">作者</param>
    /// <param name="projectId">项目id</param>
    public VersionMangeInterfaceImpl(String baseUrl,String userBy, String projectId) throws Exception
    {
        this.setConfig(baseUrl, userBy, projectId);
    }

    /// <summary>
    /// 创建 global version mange对象
    /// </summary>
    /// <param name="baseUrl">版本数据库路径</param>
    /// <param name="projectId">项目id</param>
    public VersionMangeInterfaceImpl(String baseUrl, String projectId) throws Exception
    {
        this.setConfig(baseUrl, projectId);
    }
    public void VersionMangeInterfaceImpl() {}

    /// <summary>
    /// 添加操作到操作库中
    /// </summary>
    /// <param name="operation">操作对象</param>
    public void addOperation(OperationFather operation) throws Exception
    {
        try{
            try{
                if (dal.getPathType() != pathType.local){
                    throw new Exception("can not add operation because the pathType only can be local");
                }
            }
            catch (Exception e){
                throw new Exception("can not  add operation because the pathType only can be local," + e.getMessage());
            }
            dal.setObject2xml(xmlType.operation,operation);
        }catch (Exception e){
            throw new Exception("can not add operation into operation.xml," + e.getMessage());
        }
    }

    /// <summary>
    /// 回溯版本
    /// </summary>
    /// <param name="lastVersion">版本位置</param>
    public void back2Version(int lastVersion) throws Exception
    {
        try {
            try {
                if (dal.getPathType() != pathType.local) {
                    throw new Exception("just can reversion the photo on local environment");
                }
            }
            catch(Exception e) {
                throw new Exception("just can reversion the photo on local environment");
            }
            dal.back2Version(lastVersion);
        }
        catch (Exception e){
            throw new Exception("can not reset the photo," + e.getMessage());
        }
    }

    /// <summary>
    /// 转换成全局模式
    /// </summary>
    public void change2Global() throws Exception
    {
        dal.setPathType(pathType.global);
        try
        {
            dal.initGlobalPath();
        }
        catch (Exception e){
            throw new Exception(e.toString());
        }
    }

    /// <summary>
    /// 转换成本地模式
    /// </summary>
    public void change2Local() throws Exception
    {
        dal.setPathType(pathType.local);
        try
        {
            dal.initLocalPath();
        }
        catch (Exception e){
            throw new Exception(e.toString());
        }
    }

    /// <summary>
    /// 转换成本地模式
    /// </summary>
    /// <param name="userBy">作者</param>
    public void change2Local(String userBy) throws Exception
    {
        dal.setPathType(pathType.local);
        dal.setUserBy(userBy);
        try
        {
            dal.initLocalPath();
        }
        catch (Exception e){
            throw new Exception(e.toString());
        }
    }

    /// <summary>
    /// 转换成本地模式
    /// </summary>
    /// <param name="baseUrl">库路径</param>
    /// <param name="userBy">作者</param>
    /// <param name="projectId">项目id</param>
    public void change2Local(String baseUrl, String userBy, String projectId) throws Exception
    {
        dal.setPathType(pathType.local);
        dal.setBaseUrl(baseUrl);
        dal.setUserBy(userBy);
        dal.setUserBy(projectId);
        try
        {
            dal.initLocalPath();
        }
        catch (Exception e)
        {
            throw new Exception(e.toString());
        }
    }

    /// <summary>
    /// 根据当前config中的global url克隆项目到目标url
    /// </summary>
    /// <param name="aimUrl">目标url</param>
    public void cloneByUrl(String aimUrl) throws Exception
    {
        try
        {
            dal.cloneByUrl(dal.getGlobalPath(),aimUrl);
        }
        catch (Exception e)
        {
            throw new Exception("can not clone by this url, please check your url or the path type isn't local," + e.getMessage());
        }
    }

    /// <summary>
    /// 根据sourceUrl克隆项目到目标url
    /// </summary>
    /// <param name="sourceUrl">源库路径</param>
    /// <param name="aimUrl">目标路径</param>
    public void cloneByUrl(String sourceUrl, String aimUrl) throws Exception
    {
        try
        {
            dal.cloneByUrl(sourceUrl, aimUrl);
        }
        catch (Exception e)
        {
            throw new Exception("can not clone by this url, please check your url or the path type isn't local," + e.getMessage());
        }
    }

    /// <summary>
    /// 创建添加操作对象
    /// </summary>
    /// <param name="operateOid">被操作实体id</param>
    /// <param name="addObject">添加的object</param>
    /// <returns>添加操作对象</returns>
    public OperationFather createAddOperation(String operateOid, Object addObject) throws Exception
    {
        try{
            return new OperationFather(operateOid, operatorType.Add, this.getTiming(), "", this.serialize(addObject), this.getNewGuid().toString());
        }
        catch (Exception e){
            throw new Exception("can not create add operation," + e.getMessage());
        }
    }

    /// <summary>
    /// 创建删除操作对象
    /// </summary>
    /// <param name="operateOid">被删除实体id</param>
    /// <param name="deleteObject">删除的实体对象</param>
    /// <returns>删除操作对象</returns>
    public OperationFather createDeleteOperation(String operateOid, Object deleteObject) throws Exception
    {
        try
        {
            return new OperationFather(operateOid, operatorType.Delete, this.getTiming(), this.serialize(deleteObject),"", this.getNewGuid().toString());
        }
        catch (Exception e)
        {
            throw new Exception("can not create delete operation," + e.getMessage());
        }
    }

    /// <summary>
    /// 创建修改操作对象
    /// </summary>
    /// <param name="operateOid">被操作的实体id</param>
    /// <param name="attributeName">属性名</param>
    /// <param name="oldValue">修改前值</param>
    /// <param name="newValue">修改后值</param>
    /// <returns>修改操作对象</returns>deSeri
    public OperationFather createModifyOperation(String operateOid, String attributeName, String oldValue, String newValue) throws Exception
    {
        try
        {
            return new OperationFather(operateOid+":"+attributeName, operatorType.Modify, this.getTiming(), oldValue, newValue, this.getNewGuid().toString());
        }
        catch (Exception e)
        {
            throw new Exception("can not create modify operation,"+e.getMessage());
        }
    }

    /// <summary>
    /// 创建操作对象
    /// </summary>
    /// <param name="operateOid">操作实体ID</param>
    /// <param name="type">类型</param>
    /// <param name="oldValue">初始值</param>
    /// <param name="newValue">末位值</param>
    /// <returns></returns>
    public OperationFather createOperation(String operateOid, operatorType type, String oldValue, String newValue) throws Exception
    {
        try {
            return new OperationFather(operateOid, type, this.getTiming(), oldValue, newValue, this.getNewGuid().toString());
        }
        catch(Exception e)
        {
            throw new Exception("can not create operation," + e.getMessage());
        }
    }

    /// <summary>
    /// 反序列化对象
    /// </summary>
    /// <param name="objStr">被序列化的对象（string类型）</param>
    /// <returns>对象</returns>
    public Object deSerialize(String objStr) throws Exception
    {
        Object obj = new Object();
        try
        {
            obj = dal.deSerialize(objStr);
        }
        catch (Exception ex)
        {
            throw new Exception("can not deSerialize this objStr, please check the str is right?" + ex.getMessage());
        }
        return obj;
    }

    /// <summary>
    /// 获取当前版本位置
    /// </summary>
    /// <returns>版本位置</returns>
    public int getLastVersion() throws Exception
    {
        try
        {
            return dal.getLastVersion(xmlType.version);
        }
        catch (Exception e)
        {
            throw new Exception("can not get the last version," + e.getMessage());
        }
    }

    /// <summary>
    /// 生成一个guid
    /// </summary>
    /// <returns>新的guid</returns>
    public UUID getNewGuid()
    {
        return UUID.randomUUID();
    }

    /// <summary>
    /// 获取操作对象序列（未提交版本的操作）
    /// </summary>
    /// <returns></returns>
    public List<OperationFather> getOperationList() throws Exception
    {
        try
        {
            return dal.getOperationList();
        }
        catch (Exception e)
        {

            throw new Exception("can not get operation list by operation.xml," + e.getMessage());
        }
    }

    /// <summary>
    /// 获取快照对象序列
    /// </summary>
    /// <returns>快照对象序列</returns>
    public List<PhotoFather> getPhotoList() throws Exception
    {
        try
        {
            return dal.getPhotoList();
        }
        catch (Exception e)
        {

            throw new Exception("can not get photo list by photo.xml," + e.getMessage());
        }
    }

    /// <summary>
    /// 生成当前时间戳
    /// </summary>
    /// <returns>时间戳</returns>
    public long getTiming()
    {
        return System.currentTimeMillis();
    }

    /// <summary>
    /// 获取版本对象序列
    /// </summary>
    /// <returns>版本对象序列</returns>
    public List<OVersion> getVersionList() throws Exception
    {
        try
        {
            return dal.getVersionList();
        }
        catch (Exception e)
        {

            throw new Exception("can not get version list by version.xml," + e.getMessage());
        }
    }

    /// <summary>
    /// 获取版本对象序列
    /// 该方法内部会对版本的范围溢出做简单验证，如逻辑混乱可继承后修改
    /// </summary>
    /// <param name="range_left">版本起始位置</param>
    /// <param name="range_right">版本结束位置</param>
    /// <returns>版本对象序列</returns>
    public List<OVersion> getVersionList(int range_left, int range_right)throws Exception
    {
        try
        {
            return dal.getVersionList(range_left,range_right);
        }
        catch (Exception e)
        {
            throw new Exception("can not get version list by version.xml," + e.getMessage());
        }
    }

    /// <summary>
    /// 根据源库路径自动拉取
    /// </summary>
    /// <returns>拉取结果</returns>
    public boolean pullAuto() throws Exception
    {
        try
        {
            return dal.pullFromOrigin();
        }
        catch (Exception e)
        {
            throw new Exception("can not pull by this situation, please check your config or the last version is lower than global last version?" + e.getMessage());
        }
    }

    /// <summary>
    /// 根据源库路径自动push
    /// </summary>
    /// <returns>push的结果，true为成功，false为失败</returns>
    public boolean pushAuto() throws Exception
    {
        try{
            return dal.pushBySetting();
        }
        catch (Exception e){
            throw new Exception("can not excute auto push, please check your config," + e.getMessage());
        }
    }

    /// <summary>
    /// 按照当前版本位置重新生成版本快照
    /// </summary>
    public void resetPhoto() throws Exception
    {
        try{
            try{
                if (dal.getPathType() != pathType.local){
                    throw new Exception("just can reversion the photo on local environment");
                }
            }
            catch(Exception e){
                throw new Exception("just can reversion the photo on local environment");
            }
            dal.setPhotoByLastVersion();
        }
        catch (Exception e){
            throw new Exception("can not reset the photo," + e.getMessage());
        }
    }

    /// <summary>
    /// 重新生成版本快照
    /// </summary>
    /// <param name="lastVersion">需要的版本位置</param>
    public void resetPhoto(int lastVersion)throws Exception
    {
        try
        {
            try
            {
                if (dal.getPathType() != pathType.local)
                {
                    throw new Exception("just can reversion the photo on local environment");
                }
            }
            catch(Exception e)
            {
                throw new Exception("just can reversion the photo on local environment");
            }
            dal.back2Version(lastVersion);
        }
        catch (Exception e)
        {
            throw new Exception("can not reset the photo," + e.getMessage());
        }
    }

    /// <summary>
    /// 序列化对象
    /// </summary>
    /// <param name="obj">需序列化的对象</param>
    /// <returns>被序列化的字符串</returns>
    public String serialize(Object obj)throws Exception
    {
        try{
            return dal.serialize(obj);
        }
        catch (Exception e){
            throw new Exception("can not serialize this object, please check the object can support  serializer,:" + e.getMessage());
        }
    }

    /// <summary>
    /// 设置库配置项（全局模式）
    /// </summary>
    /// <param name="baseUrl">库路径</param>
    /// <param name="projectId">项目id</param>
    public void setConfig(String baseUrl, String projectId) throws Exception
    {
        try
        {
            dal.setBaseUrl(baseUrl);
            dal.setProjectId(projectId);
            dal.setPathType(pathType.global);
            dal.initGlobalPath();
        }
        catch(Exception e)
        {
            dal.setBaseUrl("");
            dal.setUserBy("");
            dal.setProjectId("");
            dal.setPathType(pathType.local);
            throw new Exception("config is wrong or  path is illegal");
        }
    }

    /// <summary>
    /// 设置库配置项（本地模式）
    /// </summary>
    /// <param name="baseUrl">库路径</param>
    /// <param name="userBy">项目操作人</param>
    /// <param name="projectId">项目id</param>
    public void setConfig(String baseUrl, String userBy, String projectId)throws Exception
    {
        try {
            dal.setBaseUrl(baseUrl);
            dal.setUserBy(userBy);
            dal.setProjectId(projectId);
            dal.setPathType(pathType.local);
            dal.initPath();
        }catch(Exception e){
            dal.setBaseUrl("");
            dal.setUserBy("");
            dal.setProjectId("");
            dal.setPathType(pathType.local);
            throw new Exception("config is wrong or path is illegal");
        }
    }

    /// <summary>
    /// 提交版本（用户权限不能为highest）
    /// </summary>
    /// <param name="description">版本描述</param>
    /// <param name="userby">作者</param>
    /// <param name="email">邮箱</param>
    /// <param name="priority">版本优先级（用户优先级）</param>
    public void submitVersion(String description, String userby, String email, priorityType priority)throws Exception
    {
        try
        {
            try
            {
                if (dal.getPathType() != pathType.local) {
                    throw new Exception("can not submit because the pathType only can be local");
                }
            }
            catch (Exception e)
            {
                throw new Exception("can not submit because the pathType only can be local," + e.getMessage());
            }
            if (priority == priorityType.highest) {
                priority = priorityType.higher;
                System.out.println("can not set the highest by "+userby+", we change it to higher");
            }
            dal.setObject2xml(xmlType.version,new OVersion(this.getOperationList(),this.getTiming(),description,userby,email, priority));
            dal.clearOperation();
            dal.setPhotoByLastVersion();
        }
        catch (Exception e)
        {
            throw new Exception("can not submit the version," + e.getMessage());
        }
    }

    public void conflictResByAdmin(Object obj) throws Exception
    {
        throw new Exception("NotImplemented");
    }

    public void setConflictResAutoMethod(Object obj) throws Exception
    {
        throw new Exception("NotImplemented");
    }

    public Object getAllConflictResAutoMethod() throws Exception
    {
        throw new Exception("NotImplemented");
    }

    public Object getAllConflicts() throws Exception
    {
        throw new Exception("NotImplemented");
    }

    /// <summary>
    /// 获取项目global库路径
    /// </summary>
    /// <returns></returns>
    public String getGlobalPath()
    {
        return dal.getGlobalPath();
    }

    /// <summary>
    /// 获取项目库路径
    /// </summary>
    /// <returns></returns>
    public String getProjectPath()
    {
        return dal.getProjectUrl();
    }

    /// <summary>
    /// 获取项目库中某作者的Url
    /// </summary>
    /// <param name="user">作者</param>
    /// <returns>作者路径</returns>
    public String getUserPath(String user)
    {
        return dal.getProjectUrl() + "\\" + user;
    }

    /// <summary>
    /// 默认的提交方法（用户权限为normal）
    /// </summary>
    /// <param name="description">描述</param>
    /// <param name="userby">作者</param>
    /// <param name="email">邮箱</param>
    public void submitVersion(String description, String userby, String email) throws Exception
    {
        try
        {
            try
            {
                if (dal.getPathType() != pathType.local)
                {
                    throw new Exception("can not submit because the pathType only can be local");
                }
            }
            catch (Exception e)
            {
                throw new Exception("can not submit because the pathType only can be local," + e.getMessage());
            }
            dal.setObject2xml(xmlType.version, new OVersion(this.getOperationList(), this.getTiming(), description, userby, email, priorityType.normal));
            dal.clearOperation();
            dal.setPhotoByLastVersion();
        }
        catch (Exception e)
        {
            throw new Exception("can not submit the version," + e.getMessage());
        }
    }

    /// <summary>
    /// 根据作者名切换使用的版本库
    /// </summary>
    /// <param name="userBy"></param>
    public void setUser(String userBy)
    {
        dal.setUserBy(userBy);
    }

    /// <summary>
    /// 根据项目名切换使用的版本库
    /// </summary>
    /// <param name="projectId"></param>
    public void setProjectId(String projectId)
    {
        dal.setProjectId(projectId);
    }


}
