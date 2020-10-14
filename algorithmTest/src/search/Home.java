package search;

public class Home {

	public static void main(String[] args) {

		Person personA = new Person(24);
		Person personB = new Person(21);
		
		int r1 = personA.compareTo(personB);
		
		if(r1 > 0) {
			System.out.println("A가 B보다 나이가 많음");
		}else if(r1 == 0) {
			System.out.println("A, B 나이 같음");
		}else {
			System.out.println("B가 A 보다 나이 많음");
		}
		
	}

}
