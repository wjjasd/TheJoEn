package 스태틱;

public class Day {

	String doing;
	int time;
	String location;
	final static String company = "MEGA";
	public static int count;
	public static int timeSum;
	
	

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
	
	public int getAvg() {
		
		int timeAvg = timeSum / count;
		
		return timeAvg;
	}

	public static String getCompany() {
		return company;
	}

}
