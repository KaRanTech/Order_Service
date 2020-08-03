package com.example.mindtree.orderdemo.exception;

/**
 * @author Karunakar Pilli.
 *
 */
public class OrderCustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public OrderCustomException(String message) {
		super(message);
	}

	public OrderCustomException(String message, Throwable t) {
		super(message, t);
	}
	
	public OrderCustomException(Throwable t) {
		super(t);
	}

}
