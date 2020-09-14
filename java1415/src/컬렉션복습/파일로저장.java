package 컬렉션복습;

import java.io.FileWriter;
import java.util.ArrayList;

public class 파일로저장 {

	public void save(ArrayList<Day> list) {
		System.out.println(list.size() + "일치의 데이터");
		for (int i = 0; i < list.size(); i++) {
			Day day = list.get(i);
			System.out.println((i + 1) + "일차" + day);
			System.out.println("------------------");
			// 파일로저장 예외처리필요
			try {
				FileWriter w = new FileWriter("day" + (i + 1) + ".txt");
				w.write(day.doing + "\n");
				w.write(day.time + "\n");
				w.write(day.location + "\n");
				w.close(); //닫아줘야 쓰기 완료됨
			} catch (Exception e) {
				System.out.println("파일저장 실패");
			}
		}
	}
}
