package 배열기본;


public class 배열개념4 {
	public static void main(String[] args) {

		String[] name = {"홍길동", "김길동", "이길동", "박길동"};
		int[] age = {20,30,40,50};
		char[] gender = {'m','f','m','f'};
		boolean[] braf = {true,false,true,true};
		double[] weight = {70,65.5,50.5,40.4};
		
		for(int i = 0 ; i < name.length; i++) {
			System.out.println("성명: "+name[i]);
			System.out.println("나이: "+age[i]);
			System.out.println("성별: "+gender[i]);
			System.out.println("아침: "+braf[i]);
			System.out.println("무게: "+weight[i]);
			System.out.println(" ");
		}
		
		//for문 축약형 (꺼낼때만)
		int index = 1;
		for (String s : name) {
			System.out.println((index++)+"번째 "+s);
		}
		
	}
}
