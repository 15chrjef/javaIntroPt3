import java.util.Stack;
public class Stacks {
	public static void main (String[] args){
		Stack<String> pez = new Stack();

		pez.push("Candy1");
		pez.push("Candy2");
		pez.push("Candy3");
		pez.push("Candy4");
		
		String candy4 = pez.pop();
		String candy3 = pez.pop();

		System.out.println(candy4);
		System.out.println(candy3);
		System.out.println(pez.peek());
	}
}