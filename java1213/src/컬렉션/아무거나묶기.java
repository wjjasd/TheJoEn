package 컬렉션;

import java.util.ArrayList;

import DB연결.BbsVO;

public class 아무거나묶기 {

	public static void main(String[] args) {


		ArrayList list = new ArrayList();
		
		list.add(19);
		list.add("자바과정");
		list.add(25.5);
		list.add(false);
		list.add(new BbsVO());
		
		System.out.println(list.size() + "개 들어있음");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		System.out.println("------------1----------------");
		
		list.remove(0);
		System.out.println(list.get(0));
		list.add(0,"홍길동");
		System.out.println(list.size() + "개 들어있음");
		
		System.out.println("-------------2---------------");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		System.out.println("--------------3--------------");
		list.set(0, "김길동");
		System.out.println(list.get(0));
		
		System.out.println("--------------4--------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
			
		}
		
	}

}
