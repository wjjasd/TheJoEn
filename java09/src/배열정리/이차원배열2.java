package 배열정리;

public class 이차원배열2 {

	public static void main(String[] args) {
		
		
		
		int[][] score = new int[4][];

		System.out.println("score의 행 크기 : "+score.length);
		System.out.println();

		int[] kor = {50,60,70,80,90};
		int[] math = {66,77,88};
		int[] eng = {90,80,70,60};
		int[] sci = {77,100};
		
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
