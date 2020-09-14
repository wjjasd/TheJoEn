package 상속;

public class Truck extends Car {
	
	int ton; //몇톤 트럭인가

	public Truck(String color, int ton) {
		
		setColor(color); //Car 색상설정
		this.ton = ton;
		
	}

	@Override
	public String toString() {
		return "Truck [ton=" + ton + "톤 트럭, enginStart=" + enginStart + ", color=" + color + "]";
	}

}
