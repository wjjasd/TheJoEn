package 배열응용;

import java.util.Random;

import javax.swing.JOptionPane;

public class input3 {

	public static void main(String[] args) {
		//문제 1000문제
		//원래 답안지 0~3 까지 중 1000개
		//내 답안지 0~3 까지 중 1000개
		
		int[] originSheet = new int[1000];
		int[] mySheet = new int[1000];
		String[] result = new String[1000];
		
		int okCount = 0;
		int noCount = 0;
		
		//두 배열에 랜덤 값 입력
		Random r = new Random();
		for (int i = 0; i < originSheet.length; i++) {
			originSheet[i] = r.nextInt(4);
			mySheet[i] = r.nextInt(4); 
		}

		//채점
		for(int i = 0; i < originSheet.length; i++) {
			if(originSheet[i]==mySheet[i]) {
				result[i] = "정답";
				okCount++;
			}else {
				result[i] = "오답";
				noCount++;
			}
		}
		
		//출력
		System.out.println("문항    정답    내답    결과");
		System.out.println("----------------------");
		for(int i = 0; i < originSheet.length; i++) {
			System.out.println(i + "    " + originSheet[i] + "    " + mySheet[i] + "    " + result[i] );		
		}
		System.out.println(" ");
		System.out.println("정답 문항수: " + okCount);
		System.out.println("오답 문항수: " + noCount);

	}

}
