package com.modelmanage.po;

import com.modelmanage.enumtype.operatorType;

public class PhotoFather {
    private String OperateOid;
    private operatorType OperatorType;
    //private ValueStore Value;
    private Object AddOrDelObject;
    private String NewValue;
    private String OldValue;

    public String getNewValue() {
        return NewValue;
    }

    public void setNewValue(String newValue) {
        NewValue = newValue;
    }

    public String getOldValue() {
        return OldValue;
    }

    public void setOldValue(String oldValue) {
        OldValue = oldValue;
    }

    public Object getAddOrDelObject() {
        return AddOrDelObject;
    }

    public void setAddOrDelObject(Object addOrDelObject) {
        AddOrDelObject = addOrDelObject;
    }

    /// <summary>
    /// 创建快照对象
    /// </summary>
    /// <param name="operateOid">操作的对象id</param>
    /// <param name="type">操作符类型</param>
    /// <param name="oldValue">原始值</param>
    /// <param name="newValue">修改值</param>
//    public PhotoFather(String operateOid, operatorType type, String oldValue, String newValue){
//        this.OperateOid = operateOid;
//        this.OperatorType = type;
//        this.Value = new ValueStore(oldValue, newValue);
//    }
    public PhotoFather(String operateOid, operatorType type, String value)
    {
        this.OperateOid = operateOid;
        this.OperatorType = type;
        if (type == operatorType.Add || type == operatorType.Modify)
        {
            this.NewValue = value;
            this.OldValue = "";
        }
        if(type == operatorType.Delete)
        {
            this.NewValue = "";
            this.OldValue = value;
        }
    }

    public PhotoFather() { }

    /// <summary>
    /// 获取操作的对象id
    /// </summary>
    /// <returns></returns>
    public String getOperateOid() {
        return this.OperateOid;
    }
    /// <summary>
    /// 获取操作符
    /// </summary>
    /// <returns></returns>
    public operatorType getOperatorType() {
        return this.OperatorType;
    }
    /// <summary>
    /// 获取操作值
    /// </summary>
    /// <returns>ValueStore对象，其中存入操作的值</returns>
/*    public ValueStore getValue() {
        return this.Value;
    }*/
}
