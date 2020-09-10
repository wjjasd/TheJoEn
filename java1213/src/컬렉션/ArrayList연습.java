package 컬렉션;

import java.util.ArrayList;

public class ArrayList연습 {

	public static void main(String[] args) {
		// 달리기를 했는데 1등 박소정, 2등 김정민, 3등 소지현, 4등 김개념 그런데 2등 반칙하여 탈락 
		// 등수와 이름 잘 찍히도록 프로그램
		
		ArrayList player = new ArrayList();
		
		player.add("박소정");
		player.add("김정민");
		player.add("소지현");
		player.add("김개념");

		System.out.println("출전선수 목록");
		System.out.println("--------------");
		for (int i = 0; i < player.size(); i++) {
			System.out.println(player.get(i));
		}
		System.out.println("--------------");
		
		System.out.println();
		player.remove(1); // 2등 반칙하여 탈락
		System.out.println("수상자 목록");
		System.out.println("--------------");
		for (int i = 0; i < player.size(); i++) {
			System.out.println( (i+1) +"위: " + player.get(i));
		}
		System.out.println("--------------");
		
	}

}
