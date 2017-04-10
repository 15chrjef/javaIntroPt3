public class ArraySearcher{
	public static void main(String[] args) {
		String[] toys = { "Bike", "Pogo Stick", "YoYo", "Action Figure" };
		int result = StringSearcher(toys, "YoYo");
		if(result == -1 ) {
			System.out.println("No match found");
		} else {
			System.out.println("Result: " + toys[result]);
		}
	}
	public static int StringSearcher(String[] arr, String val) {
		int match = -1;
		for(int i = 0; i < arr.length; i++){
			if(arr[i].equalsIgnoreCase(val)){
				match = i;
				break;
			}
		}
		return match;
	}
}