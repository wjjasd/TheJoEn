package 스태틱;

public class Company {

	public static void main(String[] args) {

		Employee 직원1 = new Employee("문재인","남",50);
		System.out.println(Employee.count+"명 고용됨");
		Employee 직원2 = new Employee("박근혜","여",60);
		System.out.println(Employee.count+"명 고용됨");
		Employee 직원3 = new Employee("이명박","남",70);
		System.out.println(Employee.count+"명 고용됨");
		
		System.out.println("직원 평균 나이 : " + Employee.ageSum / Employee.count);
		System.out.println("-------------직원목록-----------");
		System.out.println(직원1);
		System.out.println(직원2);
		System.out.println(직원3);

	}

}
