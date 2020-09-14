package 상속;

public class Car {
	
	//시동 여부 초기 꺼짐
	boolean enginStart = false;
	//차 색상
	String color;
	
	public void enginStart() {
		enginStart = true;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [enginStart=" + enginStart + ", color=" + color + "]";
	}
	

}
