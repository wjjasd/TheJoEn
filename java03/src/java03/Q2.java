package java03;

public class Q2 {

	public static void main(String[] args) {
		for (int i = 1; i < 9; i++) {
			if (i % 2 == 1) {
				continue;
			} else {
				System.out.println(i + "단");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + "x" + j + "=" + i * j);
				}
				System.out.println("------------------------------------");
			}
		}
	}
}
