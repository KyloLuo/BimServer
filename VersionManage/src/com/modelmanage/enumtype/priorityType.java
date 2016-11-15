package com.modelmanage.enumtype;

public enum priorityType {
	low(0),
	normal(1),
	higher(2),
	highest(3);
	
	private int nCode ;
	private priorityType( int _nCode) {
        this . nCode = _nCode;
    }
	public String toString() {
        return String.valueOf ( this . nCode );
    }
}
