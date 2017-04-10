public class Message{

	private User user;
	
	private String content;

	public Message(User u, String m){
		user = u;
		content = m;
	}

	public String getMessage(){
		String message = content + " - by:" + user.getName() + "\n";
		return message;
	}
}