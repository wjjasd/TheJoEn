package 변수복사;

public class 참조형변수복사 {

	public static void main(String[] args) {

		int x[] = {1,2,3,4,5};
		int y[] = x;
		
		
		System.out.println("-----------------");
		
		System.out.print("x: ");
		for (int i : x) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("x주소 " + x);
		System.out.println("y주소 " + y);
		System.out.println();
		System.out.println("---- int y[] = x; ----");
		
		
		System.out.print("x: ");
		for (int i : x) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("y 길이: "+y.length);
		System.out.println("x주소 " + x);
		System.out.println("y주소 " + y);
		
		System.out.println();
		System.out.println("---- int y[] = x.clone(); ----");
		x[0] = 9;
		y = x.clone();
		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("x: ");
		for (int i : x) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("x주소 " + x);
		System.out.println("y주소 " + y);
		
	}

}
