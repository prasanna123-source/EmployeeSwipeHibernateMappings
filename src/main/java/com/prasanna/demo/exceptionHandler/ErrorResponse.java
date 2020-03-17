package com.prasanna.demo.exceptionHandler;

import java.util.List;

public class ErrorResponse {
	String errorcode;
	List<String> errormessage;
	public ErrorResponse(String errorcode, List<String> details) {	
		this.errorcode = errorcode;
		this.errormessage = details;
	}

}
