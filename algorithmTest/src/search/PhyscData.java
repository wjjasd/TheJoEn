package search;

import java.util.Comparator;

public class PhyscData {
	private double vision; //시력
	public PhyscData(double vision) {	//생성자
		this.vision = vision;
	}
	//comparator를 재정의한  클래스
	private static class VisionOrderComparator implements Comparator<PhyscData>{

		@Override
		public int compare(PhyscData o1, PhyscData o2) {
			//시력에 따라 대소 비교
			return (o1.vision > o2.vision) ? 1:
				   (o1.vision < o2.vision) ? -1 : 0;
		}
	}
	//VisionOrderComparator 객체 : PhyscData의 정적 멤버변수
	public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();		
}
