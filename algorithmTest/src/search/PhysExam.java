package search;

import java.util.Arrays;

public class PhysExam {

	public static void main(String[] args) {

		PhyscData[] x = {
				new PhyscData(0.2),	//index 0
				new PhyscData(0.3), //index 1
				new PhyscData(0.4), //index 2
				new PhyscData(0.5), //index 3
				new PhyscData(0.9), //index 4
				new PhyscData(1.1), //index 5
				new PhyscData(1.2)  //index 6
		};
		
		int idx = Arrays.binarySearch(x, // 배열 x에서
									  new PhyscData(1.1), //이 객체와 같은 요소를
									  PhyscData.VISION_ORDER); //시력에 의해 검색
		
		if(idx < 0) System.out.println("요소없음");
		else {
			System.out.println("x["+idx+"]에 있음");
			System.out.println("찾은 값 : " + x[idx]);
		}
	}

}
