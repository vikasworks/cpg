package com.etl.aapi.gateway.exception;

public class JsonTransformerException extends Exception {

	private static final long serialVersionUID = 9082759078415854583L;
	
	public JsonTransformerException() {

	}

	public JsonTransformerException(String message) {
		super(message);
	}

	public JsonTransformerException(String message, Throwable cause) {
		super(message, cause);
	}

	public JsonTransformerException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
