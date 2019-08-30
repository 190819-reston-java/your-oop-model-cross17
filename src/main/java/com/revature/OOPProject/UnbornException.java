package com.revature.OOPProject;

public class UnbornException extends RuntimeException {
	
	public UnbornException() {
		this("An animal needs to be born to be in this database.");
	}
	
	public UnbornException(String notice) {
		super(notice);
	}

}
