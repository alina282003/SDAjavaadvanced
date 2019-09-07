package twitter;

import java.util.HashMap;

public class Platform {

	private HashMap<String, User> database;

	public Platform() {
		database = new HashMap<String, User>();
	}

	public void addUser(User user) {
		if (database.containsKey(user.getUsername())) {
			System.out.println("Acest username este deja folosit");
		} else {
			database.put(user.getUsername(), user);
		}
	}

	public void addMessageToUser(User user, String mesaj) {
		if (database.containsKey(user.getUsername())) {
			Tweet tweet = new Tweet(mesaj);
			database.get(user.getUsername()).addTweet(tweet);
		} else {
			System.out.println("Acest user nu exista");
		}
	}

	public void listAllMessagesFromUser(User user) {
		for (Tweet tweet : user.getMessages()) {
			System.out.println(tweet.getMessage());
		}
	}

	public void searchAfterWord(String word) {
		// pentru fiecare user
		for (User user : database.values()) {
			// pentru fiecare mesaj a fiecarui user
			for (Tweet tweet : user.getMessages()) {
				// verifica daca contine cuvantul cautat
				if (tweet.getMessage().contains(word)) {
					System.out.println(tweet.getMessage());
				}
			}
		}
	}

	public HashMap<String, User> getDatabase() {
		return database;
	}
	

}
