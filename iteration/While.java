public class While {
	public static void main(String[] args) {
		int value = 10;
		boolean loop = value < 20;

		System.out.println(loop);
		while(loop){
			System.out.println(value < 20);
			System.out.println(value);
			value += 1;
			loop = value < 20;
		}
	}
}