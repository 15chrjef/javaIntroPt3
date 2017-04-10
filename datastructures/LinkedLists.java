import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedLists{
	public static void main (String[] args){
		LinkedList<String> gList = new LinkedList<String>();
		gList.add("Roast Beef");
		gList.add("Cheese");
		gList.add("Honey wheat bread");

		gList.addFirst("Lettuce");
		gList.addLast("Fruit Juice");

		gList.removeFirst();

		System.out.println(gList.getFirst());
		System.out.println(gList.getLast());

		ListIterator<String> iter = gList.listIterator();
		System.out.println("______________");

		if(iter.hasNext()){
			iter.next();
			iter.add("Lettuce");
		}

		for(String item: gList){
			System.out.println("Item " + item);
		}

	}
}