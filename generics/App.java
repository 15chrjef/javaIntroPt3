import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();

		strings.add("cat");
		strings.add("dog");
		strings.add("alligator");

		String animal = strings.get(1);

		System.out.println(animal);

		//more than one type
		HashMap<Integer,String> map = new HashMap<Integer, String>();

		//java 7
		ArrayList<String> list2 = new ArrayList<>();		
	}
}