package com.prasanna.demo.exceptionHandler;

public class CustomException extends RuntimeException{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public CustomException(String msg) {
super("Employee Records not found" +msg);	
}


}
