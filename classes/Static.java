class Thing {
	public final static int LUCKY_NUMBER = 7;
	public String name;
	public static String description;
	public static int count = 0;
	public int id;
	public Thing(){
		id = count;
		count++;
	}

	public void showName(){
		System.out.println(description + " : " + name);
	}

	public static void showInfo() {
		System.out.println("Hello");
		//won't work: System.out.println(name);
	}
}

public class Static {
	public static void main(String[] args) {

		Thing.description = "I am a thing";

		System.out.println(Thing.description);
		Thing.showInfo();

		System.out.println("Current Number of things: " + Thing.count);
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();

		System.out.println("Current Number of things: " + Thing.count);

		thing1.name = "bob";
		thing2.name = "sue";

		thing1.showName();
		thing2.showName();

		//can't do LUCKY_NUMBER is a constant Thing.LUCKY_NUMBER = 4;
		System.out.println(Thing.LUCKY_NUMBER);
	}
}