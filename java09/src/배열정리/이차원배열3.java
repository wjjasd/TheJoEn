package 배열정리;

public class 이차원배열3 {

	public static void main(String[] args) {

		int[][] seat = new int[3][];

		System.out.println("seat의 행 크기 : "+seat.length);
		System.out.println();

		int[] s1 = new int[3];
		int[] s2 = new int[4];
		int[] s3 = new int[5];
		
		seat[0] = s1;
		seat[1] = s2;
		seat[2] = s3;
		
		System.out.println("  0 1 2 3 4");
		System.out.println();
		for (int i = 0; i < seat.length; i++) {
			System.out.print(i+" ");
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j]+" ");
			}
			System.out.println();
		}

	}

}
