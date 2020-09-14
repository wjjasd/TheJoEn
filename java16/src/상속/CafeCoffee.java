package 상속;

public class CafeCoffee {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println("차1 : "+car1);

		Truck truck1 = new Truck("핑크", 10);
		System.out.println("트럭1 : "+truck1);
		
		CoffeeTruck coffeeTruck1 = new CoffeeTruck("검정", 2);
		coffeeTruck1.enginStart();	//시동걸기
		coffeeTruck1.loadCoffee(1);	//커피싣기
		System.out.println("커피트럭1 : "+coffeeTruck1);
		
		CoffeeTruck coffeeTruck2 = new CoffeeTruck("파랑", 4);
		System.out.println("커피트럭2 : "+coffeeTruck2);

	}

}
