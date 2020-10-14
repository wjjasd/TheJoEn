package repeat;

public class Repeat1 {

	public static void main(String[] args) {

		System.out.println(repeatWhile(100000000));
		System.out.println();
		System.out.println(repeatFor(100000000));
	}

	public static int repeatFor(int x) {
		// Start time
		long startTime = System.currentTimeMillis();
		int r = 0;
		for (int i = 0; i <= x; i++) {
			r += i;
		}
		// End time
		long endTime = System.currentTimeMillis();
		// Total time
		long lTime = endTime - startTime;
		System.out.println("for문" + "TIME : " + lTime + "(ms)");
		return r;
	}

	public static int repeatWhile(int x) {
		// Start time
		long startTime = System.currentTimeMillis();
		int r = 0;
		int i = 0;

		while (i <= x) {
			r += i;
			i++;
		}
		// End time
		long endTime = System.currentTimeMillis();
		// Total time
		long lTime = endTime - startTime;
		System.out.println("while문" + "TIME : " + lTime + "(ms)");
		return r;
	}

}
