package 상속;

public class 사람 extends Object {	//extends Object -> 기본값

	String name;
	int age;

	public 사람(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println("먹다");
	}

	@Override
	public String toString() {
		return "사람 [name=" + name + ", age=" + age + "]";
	}
	
}
