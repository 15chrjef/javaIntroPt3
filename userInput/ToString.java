class Frog {
	private String name;
	private int id;
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
	}

	public Frog(int id, String name){
		this.id = id;
		this.name = name;
	}
}

public class ToString{
	public static void main(String[] args) {
		Frog frog1 = new Frog(7, "Jeff");
		System.out.println(frog1);
		
	}
}