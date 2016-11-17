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
    /// �������ն���
    /// </summary>
    /// <param name="operateOid">�����Ķ���id</param>
    /// <param name="type">����������</param>
    /// <param name="oldValue">ԭʼֵ</param>
    /// <param name="newValue">�޸�ֵ</param>
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
    /// ��ȡ�����Ķ���id
    /// </summary>
    /// <returns></returns>
    public String getOperateOid() {
        return this.OperateOid;
    }
    /// <summary>
    /// ��ȡ������
    /// </summary>
    /// <returns></returns>
    public operatorType getOperatorType() {
        return this.OperatorType;
    }
    /// <summary>
    /// ��ȡ����ֵ
    /// </summary>
    /// <returns>ValueStore�������д��������ֵ</returns>
/*    public ValueStore getValue() {
        return this.Value;
    }*/
}
