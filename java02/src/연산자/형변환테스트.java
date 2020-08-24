package 연산자;

public class 형변환테스트 {

	public static void main(String[] args) {

		// 자동형변환
		byte x = 100;
		int y = x;

		// 불가 byte는 127까지 형변환 불가
		int z = 300;
//		byte w = z;

		// 불가 강제형변환
		double t = 400;
		int p = (int)t;

		// 가능 자동형변환
		int i = 400;
		double j = i;
	}

}
