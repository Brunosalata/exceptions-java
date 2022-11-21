package model.exceptions;

public class DomainException extends Exception {		//extends RuntimeException inpede que a IDE exija tratamento
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
}
