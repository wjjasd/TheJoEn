package 컬렉션;

import java.util.HashMap;

public class Map연습 {

	public static void main(String[] args) {

		HashMap customer = new HashMap();
		customer.put(100, "김데이");
		customer.put(200, "김사전");
		customer.put(300, "김구조");
		customer.put(300, "김자료");
		
		System.out.println("고객명단");
		System.out.println(customer);
		
		System.out.println();
		System.out.println();
		System.out.println("update : 200번 삭제, 300번 이름변경");
		customer.remove(200);
		customer.put(300,"김충성");
		System.out.println(customer);

	}

}
