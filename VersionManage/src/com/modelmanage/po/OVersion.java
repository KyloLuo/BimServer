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
    /// 创建版本对象
    /// </summary>
    /// <param name="operationList">操作序列</param>
    /// <param name="time">时间戳</param>
    /// <param name="description">描述</param>
    /// <param name="userby">作者</param>
    /// <param name="email">邮箱</param>
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
    /// 返回操作序列
    /// </summary>
    /// <returns>操作序列</returns>
    public List<OperationFather> getOperationList() {
        return this.OperationList;
    }
    /// <summary>
    /// 返回时间戳
    /// </summary>
    /// <returns></returns>
    public long getTime() {
        return this.Time;
    }
    /// <summary>
    /// 获取版本描述
    /// </summary>
    /// <returns>描述</returns>
    public String getDescription() {
        return this.Description;
    }
    /// <summary>
    /// 获取作者
    /// </summary>
    /// <returns>作者</returns>
    public String getUserBy() {
        return this.UserBy;
    }
    /// <summary>
    /// 获取邮箱
    /// </summary>
    /// <returns>邮箱</returns>
    public String getEmail() {
        return this.Email;
    }
    /// <summary>
    /// 获取版本的GUID
    /// </summary>
    /// <returns>GUID</returns>
    public UUID getGUID() {
        return this.Guid;
    }
    /// <summary>
    /// 获取版本操作优先级
    /// </summary>
    /// <returns>优先级</returns>
    public priorityType getPriority() {
        return this.Priority;
    }

    /// <summary>
    /// 提交到服务器
    /// </summary>
    /// <returns>执行结果</returns>
//     public boolean submit() {
//         //根据projectBy提交版本
//
//         return false;
//     }

}
