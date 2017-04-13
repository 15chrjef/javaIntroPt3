public class Field {
	Plant plant = new Plant();

	public Field(){
		//works, size is protected, field same package as plant
		System.out.println(plant.size);
	}
}