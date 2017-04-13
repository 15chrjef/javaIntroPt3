import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a line of text");
		String line = input.nextLine();

		System.out.println("Enter a Integet");
		int value = input.nextInt();

		System.out.println("Your entered: " + line);
		System.out.println("Your entered: " + value);

	}
}