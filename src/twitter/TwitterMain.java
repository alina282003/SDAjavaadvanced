package twitter;

import utils.ScannerUtils;

public class TwitterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user1 = new User("userName1");
		User user2 = new User("userName2");
		User duplicate = new User("userName1");
		
		Platform twitter = new Platform();
		
		twitter.addUser(user1);
		twitter.addUser(user2);
		twitter.addUser(duplicate);
		
		System.out.println(twitter.getDatabase());
		
		twitter.addMessageToUser(user1, "Salut");
		twitter.addMessageToUser(user1, "Ce mai faci?");
		twitter.addMessageToUser(user1, "Eu fac un curs de Java");
		
		twitter.addMessageToUser(user2, "Salut");
		twitter.addMessageToUser(user2, "Fac bine");
		twitter.addMessageToUser(user2, "Ce este Java?");
		twitter.addMessageToUser(user2, "Salut");

		System.out.println("insert message to user");
		String message = ScannerUtils.getScanner().nextLine();
		twitter.addMessageToUser(user1, message);
		
		System.out.println("All messages from user1:");
		twitter.listAllMessagesFromUser(user1);
		System.out.println("All messages from user2:");
		twitter.listAllMessagesFromUser(user2);
		
		twitter.searchAfterWord("Java");
		
		System.out.println("insert word for searching in messages");
		String word = ScannerUtils.getScanner().nextLine();
		twitter.searchAfterWord(word);
		
	}

}
