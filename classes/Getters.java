class Person {
	String name;
	int age;
	void speak() {
		System.out.println("Hello my name is " + name + " and I am " + age + " years old.");
	}

	void sayHell(){
		System.out.println("Hello there!");
	}

	int calculateYearsToRetirement(){
		int yearsleft = 65 - age;
		return yearsleft;
	}

	int getAge(){
		return age;
	}

	String getName(){
		return name;
	}
}

public class Getters {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Jeff";
		person1.age = 37;

		Person person2 = new Person();
		person2.name = "Mom";
		person2.age = 58;

		person1.speak();
		person2.speak();
		person2.sayHell();


		int years = person1.calculateYearsToRetirement();

		System.out.println("I have " + years + " years until retirement ");

		int age = person1.getAge();
		String name = person1.getName();
	}
}