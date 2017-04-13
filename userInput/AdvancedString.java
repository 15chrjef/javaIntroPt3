
public class AdvancedString {
	public static void main(String[] args) {
		//inneficient
		String info = "";
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";

		System.out.println(info); 

		//more effecient
		StringBuilder sb = new StringBuilder("");

		sb.append("My name is Sue.")
		.append(" ")
		.append("I am a lion tamer");

		System.out.println(sb.toString());

		//////Formating////
		System.out.print("Here is some text.\t that was a tab \n that was a new line");
		System.out.println(" More Text on same line");

		//format ints each %d is a self contained character d allocates a number of digits
		System.out.printf("Total cost %d; quantity is %d \n", 5, 120);
		for(int i=0; i<20; i++){
			System.out.printf("%2d: some text here\n", i);
		}

		//formatting floating ints
		System.out.printf("Total value: %.3f", 5.6);
		System.out.printf("Total value: %5.3f", 1234.614123);

	}
}