package 상속;

public class CoffeeTruck extends Truck {
	
	int coffeeWeight = 0; //커피 무게

	public CoffeeTruck(String color, int ton) {
		super(color, ton);
	}
	
	//커피 싣기 (커피무게 단위:톤)
	public void loadCoffee(int coffeeWeight) {
		this.coffeeWeight = coffeeWeight;
	}

	@Override
	public String toString() {
		return "CoffeeTruck [coffeeWeight=" + coffeeWeight + "톤, ton=" 
				+ ton + "톤 트럭, enginStart=" + enginStart + ", color=" + color + "]";
	}

}
