package java03;

public class Skip {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0) {
				continue; //반복문 처음으로 돌아감
			}
			System.out.println(i);
		}
	}

}
