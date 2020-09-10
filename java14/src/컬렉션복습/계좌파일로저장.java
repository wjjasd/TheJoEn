package 컬렉션복습;

import java.io.FileWriter;
import java.util.ArrayList;

public class 계좌파일로저장 {

	public void save(ArrayList<계좌> list) {
		System.out.println("입력받은 총 계좌 수"+list.size());
		
		//리스트안에 내용물 하나씩 꺼내기 위해 반복
		for (int i = 0; i < list.size(); i++) {
			계좌 account = list.get(i);
			
			// 파일로저장 예외처리필요
			try {
				FileWriter w = new FileWriter(account.name + ".txt");
				w.write(account.name + "\n"); //한줄씩 파일에다가 쓰기
				w.write(account.field + "\n");
				w.write(account.money + "\n");
				w.close(); //닫아줘야 쓰기 완료됨
			} catch (Exception e) {
				System.out.println("파일저장 실패");
			}
		}
	}
}
