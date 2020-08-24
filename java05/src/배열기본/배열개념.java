package 배열기본;

public class 배열개념 {
	public static void main(String[] args) {
		//많은 양의 데이터를 한꺼번에 다룰 때 편리
		String[] jumsu = new String[1000];

//		jumsu[0] = 100;
//		jumsu[10] = 200;
//		jumsu[999] = 1000;
	
//		System.out.println("첫번째 값 : " + jumsu[0]);
//		System.out.println("11번째 값 : " + jumsu[10]);
//		System.out.println("마지막 값 : " + jumsu[999]);
		
		//배열은 자동 초기화됨  int = 0 , boolean = false, String = null
		
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(i+":"+jumsu[i]);
		}
	}
}
