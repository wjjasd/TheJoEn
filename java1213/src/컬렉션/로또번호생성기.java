package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 로또번호생성기 {

	public static void main(String[] args) {

		Random r = new Random();
		HashSet no = new HashSet();
		while (no.size()<6) {
			no.add(r.nextInt(45) + 1);
		}
		System.out.println(no);

	}

}
