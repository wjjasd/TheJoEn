package 배열기본;


public class 배열개념2 {
	public static void main(String[] args) {

		int[] temp = new int[7];
		
		String s = "abcdefg";
	
		System.out.println(s.getBytes().length);

		temp[0] = 24;
		temp[1] = 22;
		temp[2] = 23;
		temp[3] = 26;
		temp[4] = 23;
		temp[5] = 25;
		temp[6] = 26;

		String dayOfWeek = null;
		for (int i = 0; i < temp.length; i++) {
			switch (i) {
			case 0:
				dayOfWeek = "일";
				break;
			case 1:
				dayOfWeek = "월";
				break;
			case 2:
				dayOfWeek = "화";
				break;
			case 3:
				dayOfWeek = "수";
				break;
			case 4:
				dayOfWeek = "목";
				break;
			case 5:
				dayOfWeek = "금"; 
				break;
			case 6:
				dayOfWeek = "토";
				break;
			}
			System.out.println(dayOfWeek + "요일 : " + temp[i] + "℃ ");
		}

	}
}
