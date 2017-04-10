
public class MessageBoardTester {
	public static void main(String[] args){
		MessageBoard board = new MessageBoard();

		User andrew = new User("Andrew");
		User jane = new User("Jane");

		Message m1 = new Message(andrew, "Hey Jane, how are you doing?");
		Message m2 = new Message(jane, "I'm doing, thanks for asking!");
		Message m3 = new Message(andrew, "Awesome!");

		board.post(m1);
		board.post(m2);
		board.post(m3);

		System.out.println(board.display());
	}
}