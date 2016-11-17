package com.modelmanage.po;

import java.io.Serializable;

public class ValueStore implements Serializable{
    private String OldValue;
    private String NewValue;

    public ValueStore() { }

    /// <summary>
    /// ֵ����
    /// </summary>
    /// <param name="oldValue">��ʼֵ</param>
    /// <param name="newValue">�޸ĺ�ֵ</param>
    public ValueStore(String oldValue, String newValue) {
        this.OldValue = oldValue;
        this.NewValue = newValue;
    }

    public String getOldValue() {
        return this.OldValue;
    }

    public String getNewValue() {
        return this.NewValue;
    }

    public void setOldValue(String oldValue) {
        OldValue = oldValue;
    }

    public void setNewValue(String newValue) {
        NewValue = newValue;
    }
}
