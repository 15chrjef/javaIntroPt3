class Machine {
	public void start() {
		System.out.println("Machine started");
	}
}

class Camera extends Machine {
	public void start(){
		System.out.println("Camera started");
	}
	public void snap(){
		System.out.println("photo taken");
	}
}

public class App {
 public static void main(String[] args) {
	 Machine machine1 = new Machine();
	 Camera camera1 = new Camera();

	 machine1.start();
	 camera1.start();
	 camera1.snap();

	 //upcasting
	 Machine machine2 = camera1;
	 machine2.start(); //camera started
	 //error: machine2.snap(); machine doesn't have snap method

	 //downcasting
	 Machine machine3 = new Camera();
	 Camera camera2 = (Camera)machine3;
	 camera2.start();
	 camera2.snap();

	 //can't change the actual object, runtime error
	 /*
		Machine machine4 = new Machine();
		Camera camera3 = (Camera)machine4;
		camera3.snap();
		camera3.start();
	 */
 }
}