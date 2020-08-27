package 변수복사;

public class 기본형변수복사 {

	public static void main(String[] args) {

		int x = 300;
		int y = x;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("-----------------");
		
		x = 500;
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

}
