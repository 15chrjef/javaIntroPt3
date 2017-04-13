class Machine {
	private String name;
	private int code;
	public Machine(){
		this("Arnie", 0)
		System.out.println("Constructor here!!");
	}

	public Machine(String name) {
		this(name, 0)
		System.out.println("Second Constructor here!!");
	}

	public Machine(String name, int code) {
		System.out.println("Third Constructor here!!");
		this.name = name;
		this.code = code;
	}
}

public class Constructor{
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Machine machine 2 = new Machine("Machine 2")
	}
}