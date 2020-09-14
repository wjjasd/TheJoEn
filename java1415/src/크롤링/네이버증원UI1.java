package 크롤링;

import java.io.FileWriter;

public class 네이버증원UI1 {

	public static void main(String[] args) {
		String[] codes = {"005930", "293490", "238090", "009830", "047820"};
		String[] names = {"삼전", "카카오게임즈", "엔티포스", "한화솔루션", "초록뱀"};
				
		네이버증권크롤링2 naver = new 네이버증권크롤링2();
		
		for (int i = 0; i < codes.length; i++) {
			String[] result = naver.crawl(codes[i]);
			
			try {
				FileWriter file = new FileWriter(result[0]+".txt");
				file.write(result[0] + "\n"); //이름
				file.write(result[1] + "\n"); //종목코드
				file.write(result[2] + "\n"); //현재가
				file.write(result[3] + "\n"); //전일대비
				file.write(result[4] + "\n"); //증감비율
				file.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}

}
