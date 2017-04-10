import java.util.Queue;
import java.util.LinkedList;
public class Queues {
	public static void main(String[] args){
		//working with Queues
		Queue<String> line = new LinkedList<String>();
		line.add("Person 1");
		line.add("Person 2");
		line.add("Person 3");

		String person1 = line.remove();
		String person2 = line.remove();

		System.out.println(person1);
		System.out.println(person2);
	}
}