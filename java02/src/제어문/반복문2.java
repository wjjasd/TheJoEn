package 제어문;

public class 반복문2 {

	public static void main(String[] args) {
		// 정해진 횟수 만큼 반복
		
		//1번
		int start = 100; //시작값and끝값
		while(start>0) { //100에서 1까지 돌아감
			System.out.println(start);
			start--;    //-1씩 증가
		}
		
		System.out.println("------------------------------");
		
		//2번
		for(int i=5; i<11; i++) { //시작값;끝값;증가값
			System.out.println(i);
		}
		
		System.out.println("------------------------------");
		
		//3번
		int i = 1; //시작값&끝값
		while(i<101) { // i: 1부터 100까지
			System.out.println(i);
			i += 2; //증가값
		}
		

	}

}
