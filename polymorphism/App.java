public class App {
	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		//valid because a tree is a plant(polymorphism)
		//but still looks up Tree methods
		Plant plant2 = tree;

		plant2.grow(); // tree growing;

		plant2.shedLeaves();
		tree.shedLeaves();

		doGrow(tree);
	}

	public static void doGrow(Plant plant) {
		plant.grow();
	}
}