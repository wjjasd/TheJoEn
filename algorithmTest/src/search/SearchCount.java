package search;

public class SearchCount {

	static int searchIdn(int[] a, int n, int key, int[] idx) {

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				idx[count++] = i;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		int[] a = { 1, 9, 2, 9, 4, 6, 7, 9 };
		int[] b = new int[9];
		System.out.println(String.valueOf(searchIdn(a, 8, 9, b)));

	}

}
