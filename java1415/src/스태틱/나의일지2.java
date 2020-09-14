package 스태틱;

public class 나의일지2 {

	public static void main(String[] args) {

		Day day1 = new Day("collection", 5, "home");
//		System.out.println(Day.count);
		Day day2 = new Day("static", 3, "home");
//		System.out.println(Day.count);
		Day day3 = new Day("운동", 11, "피트니스");
//		System.out.println(Day.count);

		System.out.println(Day.count+"개 생성됨");
		System.out.println(Day.timeSum+"시간 누적됨");
		System.out.println("시간 평균"+day1.getAvg());
		System.out.println("회사이름 : " + Day.company);
	}

}
