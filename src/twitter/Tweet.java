package twitter;

public class Tweet {

	private String message;

	public Tweet(String message) {
		if (message.length() > 140) {
			message = message.substring(0, 139); // or throw exception that will be caught
		}
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
