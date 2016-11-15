package com.modelmanage.po;

import com.modelmanage.enumtype.operatorType;

public class OperationFather {
    private String OperateOid;
    private operatorType OperatorType;
    private long Time;
    private ValueStore Value;
    private String Oid;
    private Object AddOrDelObject;

    public String getOid() {
        return this.Oid;
    }

    public String getOperateOid() {
        return this.OperateOid;
    }

    public Object getAddOrDelObject() {
        return AddOrDelObject;
    }

    public void setAddOrDelObject(Object addOrDelObject) {
        AddOrDelObject = addOrDelObject;
    }

    public operatorType getOperatorType() {
        return this.OperatorType;
    }

    public long getTime() {
        return this.Time;
    }

    public ValueStore getValue() {
        return this.Value;
    }
    public void setValue(ValueStore valuestore)
    {
        this.Value = valuestore;
    }
    public OperationFather() { }
    /// <summary>
    /// 创建操作对象
    /// </summary>
    /// <param name="operateOid">操作的对象id</param>
    /// <param name="type">操作符类型</param>
    /// <param name="time">时间戳</param>
    /// <param name="oldValue">改变值</param>
    /// <param name="newValue">起始值</param>
    public OperationFather(String operateOid, operatorType type ,long time, String oldValue, String newValue, String oid) {
        this.OperateOid = operateOid;
        this.OperatorType = type;
        this.Time = time;
        this.Value = new ValueStore(oldValue, newValue);
        this.Oid = oid;
    }
}
