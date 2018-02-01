package com.etl.aapi.user.signup.data;

import com.etl.aapi.common.data.ErrorResponse;

public class DuplicateUserFound extends ErrorResponse{

	private static final long serialVersionUID = 1608652374359151802L;
	
	private String email;
	boolean exist;
	
	public DuplicateUserFound(int errorCode, String errorMessage, String email, boolean exist) {
		super(errorCode, errorMessage);
		this.email = email;
		this.exist = exist;
	}
	
	public DuplicateUserFound(String email, boolean exist) {
		super(0,"");
		this.email = email;
		this.exist = exist;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isExist() {
		return exist;
	}

	public void setExist(boolean exist) {
		this.exist = exist;
	}

}
