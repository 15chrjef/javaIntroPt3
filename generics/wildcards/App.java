import java.util.ArrayList;
class Machine {
	public String toString(){
		return "I am a machine";
	}
	public void start(){
		System.out.println("Machine Started");
	}
}

class Camera extends Machine {
	public String toString(){
		return "I am a Camera";
	}
	public void snap(){
		System.out.println("snapped photo!");
	}
}

public class App {
	public static void main(String[] args) {
		ArrayList<Machine> list1 = new ArrayList<Machine>();

		list1.add(new Machine());
		list1.add(new Machine());
		
		ArrayList<Camera> list2 = new ArrayList<Camera>();

		list2.add(new Camera());
		list2.add(new Camera());

		showList(list1);
		showList(list2);
	}
	//the ? mark is for unknown types, but is at least a child of machine
	public static void showList(ArrayList<? extends Machine> list){
		//Object is the parent(extends) all classes
		for(Machine value: list) {
			System.out.println(value);
			value.start();
		}
	}
}