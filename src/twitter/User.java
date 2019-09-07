package twitter;

import java.util.ArrayList;

public class User {

	private String username;
	private ArrayList<Tweet> messages;
	
	public User(String username) {
		this.username=username;
		this.messages= new ArrayList<Tweet>();
	}
	
	public void addTweet(Tweet tweet) {
		messages.add(tweet);
	}
	
	public String getUsername() {
		return username;
	}

	public ArrayList<Tweet> getMessages() {
		return messages;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", messages=" + messages + "]";
	}


	

	
}
