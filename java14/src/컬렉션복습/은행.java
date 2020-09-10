package 컬렉션복습;

import java.util.ArrayList;

public class 은행 {

	public static void main(String[] args) {
		//계좌 인스턴스화, 생성자를 통해 데이터 초기화
		계좌 account1 = new 계좌("kim","정기적금",5000);
		계좌 account2 = new 계좌("park","보통예금",25000);
		계좌 account3 = new 계좌("yang","보통예금",15000);
		
		//파일저장 처리반 생성
		계좌파일로저장 f = new 계좌파일로저장();
		
		//처리반으로 리스트 넘기기 위해 객체 생성 리스트 안에 내용물은 <계좌>
		ArrayList<계좌> list = new ArrayList(); 
		list.add(account1); //아까 만든 계좌들 하나씩 추가
		list.add(account2);
		list.add(account3);
		//저장 메소드 호출
		f.save(list);

	}

}
