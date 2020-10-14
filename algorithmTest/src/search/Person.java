package search;

public class Person implements Comparable<Person> {
	
	int age;
	
	public Person(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		
		if(this.age > o.age) return 1;
		if(this.age < o.age) return -1;
		return 0;
		
	}

}
