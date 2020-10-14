package repeat;

public class Triangle {

	public static void main(String[] args) {

		triangleLB(5); // 왼쪽 아래가 직각인 이등변 삼각형

		System.out.println();
		triangleLU(5); // 왼쪽 위가 직각인 이등변 삼각형

		System.out.println();
		triangleRU(5); // 오른쪽 위가 직각인 이등변 삼각형

		System.out.println();
		triangleRB(5); // 오른쪽 아래가 직각인 이등변 삼각형
	}

	static void triangleLB(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("0");
			}
			System.out.println();
		}
	}

	static void triangleLU(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("0");
			}
			System.out.println();
		}
	}

	static void triangleRU(int n) {
		for (int i = 0; i < n; i++) {
			if (i > 0) {
				for (int k = 0; k < i; k++) {
					System.out.print(" ");
				}
			}
			for (int j = i; j < n; j++) {

				System.out.print("0");
			}
			System.out.println();
		}
	}

	static void triangleRB(int n) {
		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("0");
			}
			System.out.println();
		}
	}

}
