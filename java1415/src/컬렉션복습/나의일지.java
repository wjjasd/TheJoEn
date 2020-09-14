package 컬렉션복습;

import java.util.ArrayList;

public class 나의일지 {

	public static void main(String[] args) {

		Day day1 = new Day("collection", 5, "home");
		Day day2 = new Day("static", 3, "home");
		Day day3 = new Day("운동", 11, "피트니스");

		ArrayList<Day> list = new ArrayList<>();
		list.add(day1);
		list.add(day2);
		list.add(day3);
		
		파일로저장 file = new 파일로저장();
		file.save(list);

	}

}
