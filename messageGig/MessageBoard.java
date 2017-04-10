import java.util.ArrayList;

public class MessageBoard{

	private ArrayList<Message> messages;
	public MessageBoard(){
		messages = new ArrayList<Message>();
	}

	public void post(Message m) {
		messages.add(m);
	}

	//displays all the messages
	public String display(){
		String theMessages = "Welcome to the Message Board\n\n";

		for(int i = 0; i < messages.size(); i++){
			theMessages = theMessages + messages.get(i).getMessage();
		}

		return theMessages;
	}

}