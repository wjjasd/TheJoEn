package 배열응용;

public class 배열점수비교 {

	public static void main(String[] args) {
		// 초기화
		String subject[] = { "국어", "수학", "과학", "컴퓨터", "영어" };
		int firstSeme[] = { 100, 99, 77, 87, 66 };
		int secondSeme[] = firstSeme.clone();
		secondSeme[2] = 44;
		secondSeme[4] = 55;

		// 출력
		for (String s : subject) {
			System.out.print("\t" + s + "\t");
		}
		System.out.print("\n------------------------------------------------------------------------------");
		System.out.println("");
		System.out.print("1학기");
		for (int i : firstSeme) {
			System.out.print("\t" + i + "\t");
		}
		System.out.println("");
		System.out.print("2학기");
		for (int i : secondSeme) {
			System.out.print("\t" + i + "\t");
		}
		System.out.print("\n------------------------------------------------------------------------------");

		// 변동여부검색, 출력
		System.out.println(" ");
		System.out.print("\n점수가 변경된 과목(최근성적기준) :");
		for (int i = 0; i < firstSeme.length; i++) {
			if (firstSeme[i] < secondSeme[i]) {
				System.out.print("\t" + subject[i] + "(" + "+" + (secondSeme[i] - firstSeme[i]) + ")");
			} else if (firstSeme[i] > secondSeme[i]) {
				System.out.print("\t" + subject[i] + "(" + "-" + (firstSeme[i] - secondSeme[i]) + ")");
			}
		}

		int firstAvg = 0; // 평균값
		int secondAvg = 0;

		int firstSum = 0; // 합계
		int secondSum = 0;

		// 합계 계산
		for (int i = 0; i < firstSeme.length; i++) {
			firstSum += firstSeme[i];
			secondSum += secondSeme[i];
		}

		// 평균값 계산
		firstAvg = firstSum / firstSeme.length;
		secondAvg = secondSum / secondSeme.length;
		// 출력
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("1학기 평균 : " + firstAvg);
		System.out.println("2학기 평균 : " + secondAvg);

		// 평균이 더 높은 학기 출력
		System.out.println(" ");
		if (firstAvg < secondAvg) { // 2학기가 더 높을 때
			System.out.println("2학기의 평균이 더 높습니다");
		} else if (firstAvg > secondAvg) { // 1학기가 더 높을 때
			System.out.println("1학기의 평균이 더 높습니다");
		} else {
			System.out.println("두학기의 평균이 같습니다");
		}

	}

}
