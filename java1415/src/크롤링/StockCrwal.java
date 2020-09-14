package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class StockCrwal {
	
	static StockVO stockVo;

	public static StockVO getStockInfo(String code) {
		
		//커넥션 설정
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + code);
		try {
			
			//html태그에서 값 얻어오기
			Document doc = con.get();
			Elements list = doc.select("h2 > a");
			String name = list.get(0).text();
			System.out.println("회사이름 : " + name);

			Elements list2 = doc.select("span.code");
			String code2 = list2.get(0).text();
			System.out.println("종목코드 : " + code2);

			Elements list3 = doc.select("div.today");
			Elements list4 = list3.select(".blind");
			String now = list4.get(0).text(); // 현재가
			String dif = list4.get(1).text(); // 전일대비
			String per = list4.get(2).text(); // 증감비율

			System.out.println("현재가 : " + now);
			System.out.println("전일대비 : " + dif);
			System.out.println("증감율 : " + per);
			
			stockVo = new StockVO();
			stockVo.setCompany(name);
			stockVo.setCode(code2);
			stockVo.setNow(now);
			stockVo.setDif(dif);
			stockVo.setPer(per);
	
			System.out.println("-------------------------------------");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return stockVo;
	}
	
}
