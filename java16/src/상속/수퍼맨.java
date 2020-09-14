package 상속;

public class 수퍼맨 extends 맨 {
	
	boolean fly;
	
	
	
	public 수퍼맨(String name, int age, int power, boolean fly) {
		super(name, age, power);
		this.fly = fly;
	}

	public void space() {
		System.out.println("우주를 날다.");
	}

	@Override
	public String toString() {
		return "수퍼맨 [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	

}
