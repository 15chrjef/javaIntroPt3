class Plant {
	public static final ID = 7;
	private String name;

	public String getData(){
		String data = "some stuff " + calculateGrowthForecast();
	}

	private int calculateGrowthForecast() {
		return 9;
	}

	public String getName(){
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class App {
	public static void main(String[] args) {
		
	}
}