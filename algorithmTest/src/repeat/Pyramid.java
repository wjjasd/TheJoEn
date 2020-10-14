package repeat;

public class Pyramid {

	public static void main(String[] args) {

		sPyramid(4);
		nPyramid(4);

	}

	static void sPyramid(int s) {

		for (int i = 1; i <= s; i++) {
			if (i <= s && i > 0) {
				for (int k = 0; k <= 4 - i; k++) {
					System.out.print(" ");
				}
			}
			for (int j = 0; j < (i - 1) * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	static void nPyramid(int n) {
		
		for (int i = 1; i <= n; i++) {
			if (i <= n && i > 0) {
				for (int k = 0; k <= 4 - i; k++) {
					System.out.print(" ");
				}
			}
			for (int j = 0; j < (i - 1) * 2 + 1; j++) {
				System.out.print(i%10);
			}
			System.out.println();
		}

	}

}
