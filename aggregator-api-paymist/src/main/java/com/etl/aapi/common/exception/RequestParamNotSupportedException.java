package com.etl.aapi.common.exception;

public class RequestParamNotSupportedException extends Exception {

	private static final long serialVersionUID = -2197554799963062953L;

	public RequestParamNotSupportedException() {
		super();
	}

	public RequestParamNotSupportedException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public RequestParamNotSupportedException(String arg0) {
		super(arg0);
	}

}
