package generics;

public class FruitRepository {
	private String fruits[];

	public FruitRepository(String[] fruits) {
		this.fruits = fruits;
	}

	public String[] getFruits() {
		return this.fruits;
	}

	public void addFruit(int index, String fruit) {
		this.fruits[index] = fruit;
	}
}
