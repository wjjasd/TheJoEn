package casting;

import java.util.ArrayList;

public class 참조형 {

	public static void main(String[] args) {
		// 상속관계에서만 형변환
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add(100);
		list.add(11.22);
		list.add(true);
		list.add('a');
		list.add(new VO());
		
		System.out.println(list);
		
		String s = (String)list.get(0);
		int i = (Integer)list.get(1);
		double d = (Double)list.get(2);
		
		
		
		
		
	}

}
