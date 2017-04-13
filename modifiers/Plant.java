public class Plant {
	//bad practice
	public String name;

	//acceptable pract... if it is final
	public final static int ID = 8;

	private String type;

	protected String size;
	public Plant() {
		this.name = "Freddy";
		this.type = "plant";

		this.size = "medium";
	}
}