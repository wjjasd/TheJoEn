package repeat;

public class Gauss {

	public static void main(String[] args) {

		// Start time
		long startTime = System.currentTimeMillis();

		System.out.println(sum(100000000));

		// End time
		long endTime = System.currentTimeMillis();
		// Total time
		long lTime = endTime - startTime;
		System.out.println("가우스" + "TIME : " + lTime + "(ms)");

	}

	public static int sum(int n) {
		return ((n + 1) * n) / 2;
	}

}
