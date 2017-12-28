package com.etl.aapi.common.exception;

public class NoAcknowledgmentReceiveException extends Exception {

	private static final long serialVersionUID = 6687839990802884081L;
	private String supplierName;
	private String workflow;

	public NoAcknowledgmentReceiveException() {

	}

	public NoAcknowledgmentReceiveException(String supplierName, String workflow) {
		super();
		this.supplierName = supplierName;
		this.workflow = workflow;
	}

	public NoAcknowledgmentReceiveException(String message) {
		super(message);
	}

	public NoAcknowledgmentReceiveException(String message, Throwable cause) {
		super(message, cause);
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getWorkflow() {
		return workflow;
	}

	public void setWorkflow(String workflow) {
		this.workflow = workflow;
	}

}
