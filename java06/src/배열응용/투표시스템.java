package 배열응용;

import javax.swing.JOptionPane;

public class 투표시스템 {

	public static void main(String[] args) {
		// 1 2 3 4 5
		String candid[] = { "블랙핑크", "유재석", "아이유", "이효리", "비" };
		int candCount[] = { 0, 0, 0, 0, 0 };
		String userInput = "";
		int invalid = 0;

		for (int i = 0; i < 10; i++) {
			userInput = JOptionPane.showInputDialog("투표시스템\n" + "후보의 번호를 입력하세요\n" + (i + 1) + "번째 투표자" + "\n"
					+ "-----------------------------------------\n" + "후보명단\n" + "1.블랙핑크\n" + "2.유재석\n" + "3.아이유\n"
					+ "4.이효리\n" + "5.비\n" + "------------------------------------------\n");

			switch (userInput) {
			case "1":
				candCount[0] += 1;
				break;
			case "2":
				candCount[1] += 1;
				break;
			case "3":
				candCount[2] += 1;
				break;
			case "4":
				candCount[3] += 1;
				break;
			case "5":
				candCount[4] += 1;
				break;
			default : invalid++;
			}
		}
		
		int max = candCount[0];
		int winner = 0;
		for(int i = 0; i< candCount.length; i++) {
			if(max < candCount[i]) {
				max = candCount[i];
				winner = i;
			}
		}
		
		String result = "투표결과\n"
					  + "1. 블랙핑크 : "+candCount[0]+"\n"
					  + "2. 유 재 석   : "+candCount[1]+"\n"
					  + "3. 아 이 유   : "+candCount[2]+"\n"
					  + "4. 이 효 리   : "+candCount[3]+"\n"
					  + "5. 비              : "+candCount[4]+"\n"
					  + "무효표 : " + invalid + "\n"
					  + "-----------------------------------\n"
					  + "우승자 : " + candid[winner]+"\n"
					  + "득표수 : " + candCount[winner]+"\n";
					  
		JOptionPane.showMessageDialog(null, result);

	}

}
