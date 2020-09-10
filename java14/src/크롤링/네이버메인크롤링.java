package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버메인크롤링 {

	public static void main(String[] args) {
		
		//웹사이트에서 정보를 가지고 오는 것
		//단순: 스크랩핑   단순+@: 크롤링
			
		//크롤롤링 순서
		//1.사이트연결
		//2.해당 페이지 다운로드(html)
		//3.원하는 위치의 정보 추출
		
		Connection con = Jsoup.connect("https://movie.naver.com/movie/bi/mi/basic.nhn?code=190010");
		System.out.println("1.사이트 연결 성공");
		Document doc;
		try {
			doc = con.get();
//			System.out.println(doc);
			Elements list = doc.select(".info_spec");
			System.out.println(list.size());
			Elements list2 = list.select("dd > p > a");
			System.out.println(list2.get(0).text());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
