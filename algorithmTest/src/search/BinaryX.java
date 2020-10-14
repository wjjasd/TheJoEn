package search;

public class BinaryX {

	static int binSearchX(int[] a, int n, int key) {

		int index = -1; // 결과값 못찾으면 -1 리턴
		int pl = 0; // 이진검색 맨 앞인덱스
		int pr = n - 1;// 이진검색 맨 끝인덱스
		
		do {
			int pc = (pl + pr) / 2; // 중앙 인덱스
			if (a[pc] == key) {
				for(int i = pc; i >= 0; i--) {	//맨앞 까지 주사(走査)
					if(a[i]==key) {				// 걸리면 인덱스 대입!
						index = i;
					}
				}
				return index;	//키값 찾았기 때문에 리턴
			} else if (a[pc] < key) {
				pl = pc + 1;

			} else {
				pr = pc - 1;
			}
		} while (pl <= pr);

		return index;
	}

	public static void main(String[] args) {

		int a[] = { 1, 3, 5, 7, 7, 7, 7, 8, 8, 9, 9};
		int b[] = { 3, 3, 5, 7, 7, 7, 7, 8, 8, 9, 9};
		int result = binSearchX(a, 11, 7);
		int result2 = binSearchX(b, 11, 3);
		System.out.println("a배열 key위치 : " + result);
		System.out.println("b배열 key위치 : " + result2);
	}

}
