class Frog {
	private String name;
	private int age;

	public void setName(String newName) {
		this.name = newName;
	}

	public void setAge(int newAge) {
		this.age = newAge;
	}

	public String getName() {
		return this.name;
	}

	public int getAge(){
		return this.age;
	}
}

public class Setters {
	/*
		cannot access frog1.name or frog1.age because properties are private;
	*/

	public static void main(String[] args) {
		Frog frog1 = new Frog();

		frog1.setName("Froggy");
		frog1.setAge(11111);
		
		System.out.println(frog1.getAge());
		System.out.println(frog1.getName());
	}
}