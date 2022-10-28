package com.Usmicrosemi.Vaccination.ServiceImpl;

public class NoVaccineException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NoVaccineException() {
		super();
	}
	public NoVaccineException(String message) {
		super(message);
	}

}
