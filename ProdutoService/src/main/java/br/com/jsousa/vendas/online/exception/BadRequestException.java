package br.com.jsousa.vendas.online.exception;

public class BadRequestException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5050912009441441828L;

	public BadRequestException(String message) {
        super(message);
    }
	
}
