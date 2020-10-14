package repeat;

public class Digit {

	public static void main(String[] args) {
		// 양의 정수를 입력하고 자릿수를 출력한다
		System.out.print("-2 : "); digit(-2);
		System.out.print("2 : "); digit(2);
		System.out.print("20 : "); digit(20);
		System.out.print("212 : "); digit(212);
		System.out.print("1억 : "); digit(100000000);
	}

	static void digit(int n) {

		if (n > 0) {	//양수만 받으라고 했으니까 0보다 클때만
			int count = 1; // 1자리 부터 시작하니까 1로 초기화
			do {
				n /= 10;	//입력받은 값을 10으로 나눈다
				if (n != 0) {	//10으로 나눠서 0이면 1자리 이므로 count 증가시키지 않음
					count++; // 10으로 나눠지면 자리수 1씩 증가
				}
			} while (n > 1); //n이 1보다 작으면  반복 종료
			System.out.println("그 수는 " + count + "자리입니다.");
		} else {
			System.out.println("양의 정수를 입력하세요");
		}
	}
}
