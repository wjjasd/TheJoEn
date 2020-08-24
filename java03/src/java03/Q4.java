package java03;

public class Q4 {

	public static void main(String[] args) {

		int k = 4;

		for (int i = 4; i > 0; i--) {
			for (int j = 0; j < 8; j++) {
				if (j <= k && i <= j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			k++;
			System.out.println();
		}

	}
}
