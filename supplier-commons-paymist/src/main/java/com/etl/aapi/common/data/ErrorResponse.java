package com.etl.aapi.common.data;

import java.io.Serializable;

public class ErrorResponse implements Serializable {

	private static final long serialVersionUID = -4052875719881392701L;
	private int errorCode;
	private String errorMessage;
	private String event;

	public ErrorResponse() {
		super();
	}

	public ErrorResponse(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public ErrorResponse(int errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}
}
