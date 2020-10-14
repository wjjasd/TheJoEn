package array;

public class Convert {

	public static void main(String[] args) {
		
		char[] d = new char[3];
		
		int digit = cardConv(3, 2, d);
		System.out.println(digit);
		
	}
	
	static int cardConv(int x, int r, char[] d) {
		int digits =0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x%r);
			x /= r;
		}while(x!=0);
		return digits;
	}

}
