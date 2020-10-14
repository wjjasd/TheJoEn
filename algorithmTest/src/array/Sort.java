package array;

public class Sort {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		a = reveres(a);
		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
		}

//		System.out.println(sum(a));

		int[] a1 = { 1, 2, 3 };
		int[] a2 = { 3, 5, 6, 7};
//		a1 = copy(a1, a2);
		for (int i : a1) {
//			System.out.println(i);
		}
		
		a1 = reverseCopy(a1, a2);
		for (int i : a1) {
			System.out.println(i);
		}
		
	}

	static int[] reveres(int[] a) {
		int temp;

		for (int i = 0; i < a.length / 2; i++) {
			temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}

		return a;
	}

	static int sum(int[] a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}

	static int[] copy(int[] a, int[] b) {
		a = b.clone();
		return a;
	}

	static int[] reverseCopy(int[] a, int[] b) {
		a = b.clone();
		int temp;

		for (int i = 0; i < a.length / 2; i++) {
			temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}

		return a;
	}

}
