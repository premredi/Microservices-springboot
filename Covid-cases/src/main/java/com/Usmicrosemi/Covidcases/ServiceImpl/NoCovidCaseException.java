package com.Usmicrosemi.Covidcases.ServiceImpl;

public class NoCovidCaseException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NoCovidCaseException() {
		super();
	}
	public NoCovidCaseException(String message) {
		super(message);
	}

}
