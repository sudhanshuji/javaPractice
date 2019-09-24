package exceptions;

public class CheckArgumentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CheckArgumentException() {
		super();
	}

	public CheckArgumentException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CheckArgumentException(String message, Throwable cause) {
		super(message, cause);
	}

	public CheckArgumentException(String message) {
		super(message);
	}

	public CheckArgumentException(Throwable cause) {
		super(cause);
	}
	
	
	
}
