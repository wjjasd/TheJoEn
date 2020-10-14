package repeat;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// 두 변수 a,b에 정수 입력 후 b-a 출력
		// 단, 변수b에 입력값이 a이하이면 변수 b를 다시 입력 받음.
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		do {
			System.out.println("a값을 입력하세요");
			a = sc.nextInt();
			System.out.println("b값을 입력하세요");
			b = sc.nextInt();
			System.out.println();
			
			if(b <= a) {
				System.out.println("a의 값 : " + a);
				System.out.println("b의 값 : " + b);
				System.out.println("a보다 큰 값을 입력하세요!");
			}
			
		}while(b <= a);
		
		System.out.println("b의 값 : "+b);
		System.out.println("b - a는 " + (b-a) + "입니다.");
		sc.close();
	}

}
