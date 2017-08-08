package com.yf.guava.execute;

public class GuavaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1257204355219385632L;

	public GuavaException() {
		super();
	}
	
	public GuavaException(String errorMsg){
		super(errorMsg);
	}
	
	public GuavaException(Throwable throwable){
		super(throwable);
	}
	
	public GuavaException(String message,Throwable throwable){
		super(message, throwable);
	} 
}
