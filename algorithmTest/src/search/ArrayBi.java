package search;

import java.util.Arrays;

public class ArrayBi {


	public static void main(String[] args) {

		/*
		 * int[] a = { 1, 2, 6, 10, 11, 20, 99, 120 }; //요솟수가 8인 배열 a int idx =
		 * Arrays.binarySearch(a, 12); if(idx < 0) { System.out.println("삽입 포인트 = " +
		 * (idx + 1)*-1); // 검색 실패시 반환 값 = (삽입포인트+1) * -1 //삽입 포인트는 키가 존재한다면 원래 들어가야할
		 * 자리의 인덱스 }
		 */

		String a = "텍스트1";
		String b = "텍스트2";
		String c = "텍스트3";
		String d = "텍스트4";
		String e = "텍스트5";

		String[] f = { a, b, c, d, e };
		int idx2 = Arrays.binarySearch(f, "텍스트4");
		System.out.println(idx2);
		

	}

}
