package 클래스만들기;

public class 계산기쓰는가게 {

	public static void main(String[] args) {

		//계산기
		계산기 cal = new 계산기();
		cal.plus();
		
//		Tv부품을 사용해서 켜고 끄기
		TV tv = new TV();
		tv.powerOn();
		tv.channelUp();
		tv.channelDown();
		tv.channelUp();
		tv.powerOff();

	}

}
