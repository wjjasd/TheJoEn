package array;

public class Multiarray {

	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };

	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	static int dayOfYear(int y, int m, int d) {

		while (m > 1) {

			d += mdays[isLeap(y)][m - 2];

			m--;
		}

		return d;
	}

	static int lastDayOfYear(int y, int m, int d) {

		while (m > 1) {

			d += mdays[isLeap(y)][m - 2];

			m--;
		}
		
		if(isLeap(y) == 1) {
			d = 366 - d;
		}else {
			d = 365 - d;
		}

		return d;

	}

	public static void main(String[] args) {

		System.out.println(dayOfYear(2020, 2, 1));
		System.out.println(lastDayOfYear(2020, 12, 30));
	}

}
