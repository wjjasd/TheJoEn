package search;

public class Binary {

	static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		int pr = n - 1;
		
		do {
			int pc = (pl+pr)/2;
			if(a[pc] == key) {
				return pc;
			}else if(a[pc] < key) {
				pl = pc +1;
				
			}else {
				pr = pc -1;
			}
		}while(pl <= pr);
		
		return -1;
	}
	
	public static void main(String[] args) {

		int[] a = {1,3,4,5,6,8,9,10};
		System.out.println(binSearch(a, 8, 3));
		

	}

}
