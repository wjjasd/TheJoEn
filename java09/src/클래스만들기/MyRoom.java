package 클래스만들기;

public class MyRoom {

	public static void main(String[] args) {

		Phone myPhone = new Phone();
		myPhone.color = "흰색";
		myPhone.size = 7;
		myPhone.company = "삼성";
		
		System.out.println("p1 색상: " + myPhone.color);
		System.out.println("p1 크기: " + myPhone.size);
		System.out.println("p1 회사: " + myPhone.company);
		myPhone.call();
		
		Phone myPhone2 = new Phone();
		myPhone2.color = "빨강";
		myPhone2.size = 11;
		myPhone2.company = "애플";
		System.out.println("p2 색상: " + myPhone2.color);
		System.out.println("p2 크기: " + myPhone2.size);
		System.out.println("p2 회사: " + myPhone2.company);
		myPhone2.message();
		
		
		Dog dog1 = new Dog();
		dog1.name = "d1";
		dog1.bark();
		dog1.run();
		
		Dog dog2 = new Dog();
		dog2.name = "d2";
		dog2.bark();
		dog2.run();
		
	}

}
