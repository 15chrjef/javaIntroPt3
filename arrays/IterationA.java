public class IterationA {
	public static void main(String[] args) {
		String[] fruits = { "pear", "orange", "apple", "bananas" };
		for(String fruit: fruits){
			System.out.println(fruit);
		}

		String[] nulls = new String[3];
		for(String nully:nulls){
			System.out.println(nully);
		}

		int[][] grid = {
			{3, 5, 2343},
			{2, 4},
			{1, 2, 3, 4}
		};

		for(int[] row:grid){
			for(int cell:row){
				System.out.print("{" + cell + "}" + "\t\t\t");
			}
			System.out.println();
		}
	}
}