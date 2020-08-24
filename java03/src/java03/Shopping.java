package java03;

import javax.swing.JOptionPane;

public class Shopping {

	public static void main(String[] args) {
		int notePrice = 1000; // 노트가격
		int stickerPrice = 1000; // 스티커가격
		int discount = 3000; // 할인금액
		int sum = 0; // 총액
		int pay = 0; // 결재금액

		int noteQty = 0; // 노트수량
		int stickerQty = 0; // 스티커수량

		noteQty = Integer.parseInt(JOptionPane.showInputDialog("노트 몇개?"));
		stickerQty = Integer.parseInt(JOptionPane.showInputDialog("스티커 몇개?"));

		sum = (notePrice * noteQty) + (stickerPrice * stickerQty); // 총합
		pay = sum; // 할인전 결재금액

		if (sum >= 31000) { // 총액 31000 이상 일때

			pay -= discount; // 결재액에서 할인액 차감
			JOptionPane.showMessageDialog(null, "총 금액 : " + sum + "\n할인 : " + discount + "\n결재금액: " + pay);
		} else { // 할인 적용 안될때
			JOptionPane.showMessageDialog(null, "총 금액 : " + sum);
		}

	}

}
