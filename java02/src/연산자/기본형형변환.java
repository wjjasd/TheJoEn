package 연산자;

public class 기본형형변환 {

	public static void main(String[] args) {
		int x = 100; // int는 -21억 ~ 21억
		byte y = 120; // byte -128~127
		//자동형변환
		x = y;
		System.out.println("x는 " + x);
		
		//강제형변환
		int z =127;
		byte w = (byte)z;
		System.out.println("w는 " + w);
		
		//강제형변환 불가
		int q = 1000;
		byte t = (byte)q;
		System.out.println("t는 " + t);
		
		
	}

}
