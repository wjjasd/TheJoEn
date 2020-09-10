package 컬렉션복습;

public class Day {
	
	String doing;
	int time;
	String location;
	
	public Day(String doing, int time, String location) {
	
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	@Override
	public String toString() {
		return "[doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	

}
