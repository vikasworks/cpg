package com.etl.aapi.common.data;

public class StatusResponse extends ErrorResponse {

	private static final long serialVersionUID = -965882357138820263L;
	private String event;
	private String status;
	
	public StatusResponse(String event, String status) {
		super(0,"");
		this.event = event;
		this.status = status;
	}
	
	public StatusResponse(int errorCode, String errorMessage, String event, String status) {
		super(errorCode, errorMessage);
		this.event = event;
		this.status = status;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
