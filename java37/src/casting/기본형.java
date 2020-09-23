package casting;

public class 기본형 { //primitive 정수,실수,문자,논리

	public static void main(String[] args) {

		byte a = 100;
		int b = a;
		
		int c = 128;
		byte d = (byte) c;
		
		System.out.println(d);

	}

}
