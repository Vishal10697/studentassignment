package com.tech.studenthibernate;

public class InvalidRollNoException extends RuntimeException {

	String msg;

	public InvalidRollNoException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return this.msg;
	}
	
	
	
}
