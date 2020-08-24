package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		int 가입id = 1111;
		int 가입pw = 2222;
		
		int 로그인id = 1111;
		int 로그인pw = 2222;
		
		if(가입id == 로그인id && 가입pw == 로그인pw) {
			System.out.println("로그인ok");
		}else {
			System.out.println("로그인not");
		}
		
		
	}

}
