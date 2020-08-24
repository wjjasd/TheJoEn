package 연산자;

public class 산술연산자2 {

	public static void main(String[] args) {
		int x = 200;
		int y = 100;
		int sum = x + y;		
		double div = y / x;
		System.out.println(sum);
		System.out.println(div);
		
		//하나만 실수로 형변환해서 출력
		double div2 = (double)y / x;
		System.out.println(div2);
		
		
		
	}

}
