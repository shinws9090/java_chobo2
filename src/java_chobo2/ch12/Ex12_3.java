package java_chobo2.ch12;

interface Eatable{}

class Fruit implements Eatable{

	@Override
	public String toString() {
		return "Fruit";
	}
	
}

class Apple extends Fruit {

	@Override
	public String toString() {
		return "Apple ";
	}
	
}

class Grape extends Fruit{

	@Override
	public String toString() {
		return "Grape ";
	}
	
}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{}


class Toy {

	@Override
	public String toString() {
		return "Toy";
	}
	
}

public class Ex12_3 {

	
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>();
//		FruitBox<Toy> toyBox = new FruitBox<Toy>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
//		appleBox.add(new Grape());
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox >"+ fruitBox);
		System.out.println("fruitBox >"+ appleBox);
		System.out.println("fruitBox >"+ grapeBox);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
