package 배열응용;

import java.util.Random;

public class 원하는값 {
	public static void main(String[] args) {
		
		//랜덤객체, 배열선언
		Random r = new Random();
		int[] number = new int[1000];
		
		//자료입력
		for (int i = 0; i < number.length; i++) {
			number[i] = r.nextInt(1000); // 0~999
		}
		//배열출력
		for (int i = 0; i < number.length; i++) {
			System.out.println(i + ":" + number[i]);
		}
		
		//최대,최소값 초기화
		int max = number[1];
		int min = number[1];
		
	
		
		
		//최대,최소검색
		for (int i = 1; i < number.length; i++) {
			if (max < number[i]) {
				max = number[i];	
			}
			if(min > number[i]) {
				min = number[i];
				
			}
		}
		//최대 최소 위치 검색
		int maxCount = 0;
		int minCount = 0;
		String maxInd = "";
		String minInd = "";
		for(int i = 0; i < number.length; i++) {
			if(max == number[i]) {
				maxCount++;
				maxInd += ","+i;
			}
			if(min == number[i]) {
				minCount++;
				minInd += ","+i;
			}
		}
		//맨 앞 글자 제거
		maxInd = maxInd.substring(1);
		minInd = minInd.substring(1);
		
		//결과출력
		System.out.println("------------------------------------");
		System.out.println("최대값 : "+max);
		System.out.println("최대값 갯수 : "+maxCount);
		System.out.println("최대값 위치 : " + maxInd);
	
		System.out.println("최소값 : "+min);
		System.out.println("최소값 갯수 : "+minCount);
		System.out.println("최소값 위치 : "+minInd);
	}
}
