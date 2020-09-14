package 상속;

public class 맨 extends 사람{

	int power;

	
	public 맨(String name, int age, int power) {
		super(name, age);
		this.power = power;
	}

	public void run() {
		
		eat();	//부모메서드 바로 호출 가능
		System.out.println("빨리 달리다.");
		
	}

	@Override
	public String toString() {
		return "맨 [power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
