package java03;

public class Q3 {

	public static void main(String[] args) {

//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < i + 1; j++) {
//				System.out.print("☆");
//			}
//			System.out.println("");
//		}
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5 - i; j++) {
//				System.out.print("☆");
//			}
//			System.out.println("");
//		}

		int i, j;

		int k = 0;

		for (i = 1; i <= 9; i++) {

			for (j = 0; j < 5; j++) {

				System.out.print((j <= k) ? "*" : " ");

			}

			k = (i < 5) ? (k += 1) : (k -= 1);

			System.out.println();

		}

	}
}
