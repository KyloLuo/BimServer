package com.modelmanage.enumtype;

public enum pathType {
    // ���ù��캯������
    local (0), global (1);

    // ����˽�б���
    private int nCode ;

    // ���캯����ö������ֻ��Ϊ˽��
    private pathType( int _nCode) {
        this . nCode = _nCode;
    }

    @Override
    public String toString() {
        return String.valueOf ( this . nCode );
    }
}