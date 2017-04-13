class Robot {
	public void speak(String text){
		System.out.println("hello " + text);
	}

	public void jump(int height){
		System.out.println("Jumping: " + height);
	}

	public void move(String direction, double distance){
		System.out.println("Moving " + distance + " meters in direction " + direction);
	}
}

public class MethodParams {
	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.speak("adsfadsf");
		sam.jump(1);
		sam.move("west", 4);
	}
}