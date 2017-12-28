package com.etl.aapi.common.exception;

public class InternalServerException extends Exception
{
	private static final long serialVersionUID = -3678055732276714022L;

	public InternalServerException() {
	}

	public InternalServerException(String message) {
		super(message);
	}

	public InternalServerException(String message, Throwable cause) {
		super(message, cause);
	}
}
