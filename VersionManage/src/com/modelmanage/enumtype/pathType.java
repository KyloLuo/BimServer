package com.modelmanage.enumtype;

public enum pathType {
    // 利用构造函数传参
    local (0), global (1);

    // 定义私有变量
    private int nCode ;

    // 构造函数，枚举类型只能为私有
    private pathType( int _nCode) {
        this . nCode = _nCode;
    }

    @Override
    public String toString() {
        return String.valueOf ( this . nCode );
    }
}