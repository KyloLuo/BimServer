package com.modelmanage.po;

import java.util.List;
import java.util.UUID;

import com.modelmanage.enumtype.priorityType;

public class OVersion {
    private List<OperationFather> OperationList;


    private long Time;

    private String Description;

    private String UserBy;

    private String Email;

    private UUID Guid;

    private String ProjectBy;

    private  priorityType Priority;

    public OVersion() { }
    /// <summary>
    /// �����汾����
    /// </summary>
    /// <param name="operationList">��������</param>
    /// <param name="time">ʱ���</param>
    /// <param name="description">����</param>
    /// <param name="userby">����</param>
    /// <param name="email">����</param>
    public OVersion(List<OperationFather> operationList, long time, String description, String userby, String email, priorityType priority) {
        this.OperationList = operationList;
        this.Time = time;
        this.Description = description;
        this.UserBy = userby;
        this.Email = email;
        this.Guid = UUID.randomUUID();
        this.Priority = priority;
    }
    /// <summary>
    /// ���ز�������
    /// </summary>
    /// <returns>��������</returns>
    public List<OperationFather> getOperationList() {
        return this.OperationList;
    }
    /// <summary>
    /// ����ʱ���
    /// </summary>
    /// <returns></returns>
    public long getTime() {
        return this.Time;
    }
    /// <summary>
    /// ��ȡ�汾����
    /// </summary>
    /// <returns>����</returns>
    public String getDescription() {
        return this.Description;
    }
    /// <summary>
    /// ��ȡ����
    /// </summary>
    /// <returns>����</returns>
    public String getUserBy() {
        return this.UserBy;
    }
    /// <summary>
    /// ��ȡ����
    /// </summary>
    /// <returns>����</returns>
    public String getEmail() {
        return this.Email;
    }
    /// <summary>
    /// ��ȡ�汾��GUID
    /// </summary>
    /// <returns>GUID</returns>
    public UUID getGUID() {
        return this.Guid;
    }
    /// <summary>
    /// ��ȡ�汾�������ȼ�
    /// </summary>
    /// <returns>���ȼ�</returns>
    public priorityType getPriority() {
        return this.Priority;
    }

    /// <summary>
    /// �ύ��������
    /// </summary>
    /// <returns>ִ�н��</returns>
//     public boolean submit() {
//         //����projectBy�ύ�汾
//
//         return false;
//     }

}
