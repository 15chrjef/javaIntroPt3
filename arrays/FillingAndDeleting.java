import java.util.Arrays;

public class FillingAndDeleting {
	public static void main (String[] args) {
		//filling array
		int[] oneThroughTen = new int[10];
		for(int i = 0; i < oneThroughTen.length; i++){
			oneThroughTen[i] = i+1;
		}
		System.out.println(Arrays.toString(oneThroughTen));

		//deleting elements
		String[] names = { "John", "May", "Alex", "George" };
		names[1] = names[names.length -1];
		System.out.println(Arrays.toString(names));


		//filter and new array
		String[] newNames = new String[names.length - 1];
		for(int i = 0; i < newNames.length; i++){
			newNames[i] = names[i];
		}

		System.out.println(Arrays.toString(newNames));
	}
}