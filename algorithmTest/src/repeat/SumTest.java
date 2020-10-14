package repeat;

public class SumTest {

	public static void main(String[] args) {
		// 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드를 작성하시오
		System.out.println(sumof(1, 100000000));
	}

	// ((n + 1) * n) / 2;

	public static int sumof(int a, int b) {

		// Start time
		long startTime = System.currentTimeMillis();

		int result = 0;

		if (a < b) {
			for (int i = a; i <= b; i++) {
				result += i;
			}
		} else {
			for (int i = b; i <= a; i++) {
				result += i;
			}
		}

		// End time
		long endTime = System.currentTimeMillis();
		// Total time
		long lTime = endTime - startTime;
		System.out.println("for문" + "TIME : " + lTime + "(ms)");

		return result;
	}

}
