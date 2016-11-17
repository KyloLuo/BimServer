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
    /// ����local version manage ����
    /// </summary>
    /// <param name="baseUrl">�汾���ݿ�·��</param>
    /// <param name="userBy">����</param>
    /// <param name="projectId">��Ŀid</param>
    public VersionMangeInterfaceImpl(String baseUrl,String userBy, String projectId) throws Exception
    {
        this.setConfig(baseUrl, userBy, projectId);
    }

    /// <summary>
    /// ���� global version mange����
    /// </summary>
    /// <param name="baseUrl">�汾���ݿ�·��</param>
    /// <param name="projectId">��Ŀid</param>
    public VersionMangeInterfaceImpl(String baseUrl, String projectId) throws Exception
    {
        this.setConfig(baseUrl, projectId);
    }
    public void VersionMangeInterfaceImpl() {}

    /// <summary>
    /// ��Ӳ�������������
    /// </summary>
    /// <param name="operation">��������</param>
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
    /// ���ݰ汾
    /// </summary>
    /// <param name="lastVersion">�汾λ��</param>
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
    /// ת����ȫ��ģʽ
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
    /// ת���ɱ���ģʽ
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
    /// ת���ɱ���ģʽ
    /// </summary>
    /// <param name="userBy">����</param>
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
    /// ת���ɱ���ģʽ
    /// </summary>
    /// <param name="baseUrl">��·��</param>
    /// <param name="userBy">����</param>
    /// <param name="projectId">��Ŀid</param>
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
    /// ���ݵ�ǰconfig�е�global url��¡��Ŀ��Ŀ��url
    /// </summary>
    /// <param name="aimUrl">Ŀ��url</param>
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
    /// ����sourceUrl��¡��Ŀ��Ŀ��url
    /// </summary>
    /// <param name="sourceUrl">Դ��·��</param>
    /// <param name="aimUrl">Ŀ��·��</param>
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
    /// ������Ӳ�������
    /// </summary>
    /// <param name="operateOid">������ʵ��id</param>
    /// <param name="addObject">��ӵ�object</param>
    /// <returns>��Ӳ�������</returns>
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
    /// ����ɾ����������
    /// </summary>
    /// <param name="operateOid">��ɾ��ʵ��id</param>
    /// <param name="deleteObject">ɾ����ʵ�����</param>
    /// <returns>ɾ����������</returns>
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
    /// �����޸Ĳ�������
    /// </summary>
    /// <param name="operateOid">��������ʵ��id</param>
    /// <param name="attributeName">������</param>
    /// <param name="oldValue">�޸�ǰֵ</param>
    /// <param name="newValue">�޸ĺ�ֵ</param>
    /// <returns>�޸Ĳ�������</returns>deSeri
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
    /// ������������
    /// </summary>
    /// <param name="operateOid">����ʵ��ID</param>
    /// <param name="type">����</param>
    /// <param name="oldValue">��ʼֵ</param>
    /// <param name="newValue">ĩλֵ</param>
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
    /// �����л�����
    /// </summary>
    /// <param name="objStr">�����л��Ķ���string���ͣ�</param>
    /// <returns>����</returns>
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
    /// ��ȡ��ǰ�汾λ��
    /// </summary>
    /// <returns>�汾λ��</returns>
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
    /// ����һ��guid
    /// </summary>
    /// <returns>�µ�guid</returns>
    public UUID getNewGuid()
    {
        return UUID.randomUUID();
    }

    /// <summary>
    /// ��ȡ�����������У�δ�ύ�汾�Ĳ�����
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
    /// ��ȡ���ն�������
    /// </summary>
    /// <returns>���ն�������</returns>
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
    /// ���ɵ�ǰʱ���
    /// </summary>
    /// <returns>ʱ���</returns>
    public long getTiming()
    {
        return System.currentTimeMillis();
    }

    /// <summary>
    /// ��ȡ�汾��������
    /// </summary>
    /// <returns>�汾��������</returns>
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
    /// ��ȡ�汾��������
    /// �÷����ڲ���԰汾�ķ�Χ���������֤�����߼����ҿɼ̳к��޸�
    /// </summary>
    /// <param name="range_left">�汾��ʼλ��</param>
    /// <param name="range_right">�汾����λ��</param>
    /// <returns>�汾��������</returns>
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
    /// ����Դ��·���Զ���ȡ
    /// </summary>
    /// <returns>��ȡ���</returns>
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
    /// ����Դ��·���Զ�push
    /// </summary>
    /// <returns>push�Ľ����trueΪ�ɹ���falseΪʧ��</returns>
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
    /// ���յ�ǰ�汾λ���������ɰ汾����
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
    /// �������ɰ汾����
    /// </summary>
    /// <param name="lastVersion">��Ҫ�İ汾λ��</param>
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
    /// ���л�����
    /// </summary>
    /// <param name="obj">�����л��Ķ���</param>
    /// <returns>�����л����ַ���</returns>
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
    /// ���ÿ������ȫ��ģʽ��
    /// </summary>
    /// <param name="baseUrl">��·��</param>
    /// <param name="projectId">��Ŀid</param>
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
    /// ���ÿ����������ģʽ��
    /// </summary>
    /// <param name="baseUrl">��·��</param>
    /// <param name="userBy">��Ŀ������</param>
    /// <param name="projectId">��Ŀid</param>
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
    /// �ύ�汾���û�Ȩ�޲���Ϊhighest��
    /// </summary>
    /// <param name="description">�汾����</param>
    /// <param name="userby">����</param>
    /// <param name="email">����</param>
    /// <param name="priority">�汾���ȼ����û����ȼ���</param>
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
    /// ��ȡ��Ŀglobal��·��
    /// </summary>
    /// <returns></returns>
    public String getGlobalPath()
    {
        return dal.getGlobalPath();
    }

    /// <summary>
    /// ��ȡ��Ŀ��·��
    /// </summary>
    /// <returns></returns>
    public String getProjectPath()
    {
        return dal.getProjectUrl();
    }

    /// <summary>
    /// ��ȡ��Ŀ����ĳ���ߵ�Url
    /// </summary>
    /// <param name="user">����</param>
    /// <returns>����·��</returns>
    public String getUserPath(String user)
    {
        return dal.getProjectUrl() + "\\" + user;
    }

    /// <summary>
    /// Ĭ�ϵ��ύ�������û�Ȩ��Ϊnormal��
    /// </summary>
    /// <param name="description">����</param>
    /// <param name="userby">����</param>
    /// <param name="email">����</param>
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
    /// �����������л�ʹ�õİ汾��
    /// </summary>
    /// <param name="userBy"></param>
    public void setUser(String userBy)
    {
        dal.setUserBy(userBy);
    }

    /// <summary>
    /// ������Ŀ���л�ʹ�õİ汾��
    /// </summary>
    /// <param name="projectId"></param>
    public void setProjectId(String projectId)
    {
        dal.setProjectId(projectId);
    }


}
