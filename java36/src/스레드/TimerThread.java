package 스레드;

import java.util.Date;

public class TimerThread extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			Date date = new Date();	
			System.out.println(date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
