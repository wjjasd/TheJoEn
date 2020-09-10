package 컬렉션;

import java.util.HashSet;

public class HashSet연습 {

	public static void main(String[] args) {

		HashSet team = new HashSet();
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DBA");
		
		System.out.println("팀 구성원");
		System.out.println(team);

	}

}
