package 스태틱;

public class Employee {
	
	String name;		//이름
	String gender;		//성별
	int age;			//나이
	static int count;	//직원 수
	static int ageSum;	//직원 나이 합
	
	public Employee(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		count++; 		//객체생성시 마다 직원 수 누적
		ageSum += age;	//나이 평균 구하기위해 누적
	}

	@Override	//직원목록 만들기 위해 재정의
	public String toString() {
		return " [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
}
