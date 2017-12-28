package com.etl.aapi.common.data;

public class ErrorDetails {

	private int errorCode;
	private String errorName;
	private String errorMessage;

	public ErrorDetails(int errorCode, String errorName, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorName = errorName;
		this.errorMessage = errorMessage;
	}


	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorName() {
		return errorName;
	}

	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
