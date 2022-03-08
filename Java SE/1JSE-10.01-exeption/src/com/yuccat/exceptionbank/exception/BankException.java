package com.yuccat.exceptionbank.exception;

public class BankException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1613580054007302656L;
	private String message;
	private boolean gravity = false;
	
	
	public BankException(String message, boolean gravity) {
		super();
		this.message = message;
		this.gravity = gravity;
	}
	
	public String render() {
		
		return (this.gravity ? "error" : "warning") + ": " + this.message ;
		
	}
}
