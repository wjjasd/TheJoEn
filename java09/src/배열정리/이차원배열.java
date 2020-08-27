package 배열정리;

public class 이차원배열 {

	public static void main(String[] args) {

		int[][] seat = new int[3][5];

		System.out.println("seat의 행 크기 : "+seat.length);
		System.out.println();

		seat[0][0] = 1;
		seat[0][4] = 1;
		seat[2][4] = 1;
		seat[2][1] = 1;
		seat[1][2] = 1;

		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j]+" ");
			}
			System.out.println();
			
		}

	}

}
