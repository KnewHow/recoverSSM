package erongdu.exception;

/**
 * Items Exception
 * 
 * @author yuangh
 * 
 * @company erongdu
 *
 * @data 2017年8月27日
 */
public class ItemsException extends Exception {

	private String message;

	public ItemsException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
