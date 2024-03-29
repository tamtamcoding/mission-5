package com.accenture.bars.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BarsException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String INVALID_START_DATE_FORMAT =
			"ERROR: invalid Start Date format at row";
	public static final String INVALID_END_DATE_FORMAT = 
			"ERROR: invalid End Date format at row";
	public static final String INVALID_BILLING_CYCLE  = 
			"ERROR: invalid Billing Cycle Value at row";
	public static final String BILLING_CYCLE_NOT_ON_RANGE  = 
			"ERROR: invalid Billing Cycle not on range at row";
	public static final String PATH_DOES_NOT_EXIST  = 
			"Please input an existing request file path";
	public static final String NO_SUPPORTED_FILE  = 
			"No supported request file found in the file path";
	public static final String FILE_NOT_SUPPORTED  = 
			"File is not supported for processing";
	public static final String NO_REQUESTS_TO_READ  = 
			"No Request(s) to read from the input file";
	public static final String NO_RECORDS_TO_WRITE = 
			"No Record(s) to write from the output file";


	public BarsException(String message) {
		super(message);
	}

	public BarsException(String message, Throwable cause) {
		super(message, cause);
	}

}

