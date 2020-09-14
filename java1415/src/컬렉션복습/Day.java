package 컬렉션복습;

public class Day {

	String doing;
	int time;
	String location;
	public static int count;
	public static int timeSum;
	public static int timeAvr;
	

	public Day(String doing, int time, String location) {

		count++;
		timeSum += time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	@Override
	public String toString() {
		return "[doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	public static int getAvr() {
		
		timeAvr = timeSum / count;
		
		return timeAvr;
	}



}
