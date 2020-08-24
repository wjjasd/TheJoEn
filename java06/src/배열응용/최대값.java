package 배열응용;

public class 최대값 {

	public static void main(String[] args) {
		int[] num = { 55, 11, 22, 99, 33 };
		int max = num[0];
		for (int i = 1; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println(max);
	}

}
