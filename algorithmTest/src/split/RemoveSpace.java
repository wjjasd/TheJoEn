package split;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RemoveSpace {

	public static void main(String[] args) {

//		String str = "서울특별시 서대문구 연세로 50";
//		str = str.replaceAll("\\s", "");
//		System.out.println(str);
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String datestr = sdf.format(cal.getTime());
		System.out.println(datestr);
		
		

	}

}
