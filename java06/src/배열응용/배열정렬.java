package 배열응용;

import java.util.Arrays;

public class 배열정렬 {

	public static void main(String[] args) {

		int[] 나이 = {99,10,100,88,33,24,10,77};
		
		int[] 나이2 = 나이.clone(); //비파괴, 깊은복사
		
		for (int i : 나이) {
			System.out.print(i +"\t");
		}
		System.out.println("\n------------------------------------------------------------");
		나이2[0] = 999;
		for (int i : 나이2) {
			System.out.print(i +"\t");
		}
		
//		Arrays.sort(나이); //파괴함수
//		for (int x : 나이) {
//			System.out.println(x + " ");
//		}

	}

}
