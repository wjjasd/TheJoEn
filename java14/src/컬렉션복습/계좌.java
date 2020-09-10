package 컬렉션복습;

public class 계좌 {
	
	String name;	//고객이름
	String field; 	//계좌종류
	int money;		//금액
	
	@Override
	public String toString() {
		return "계좌 [이름 = " + name + ", 계좌종류 = " + field + ", 금액 = " + money + "]";
	}

	public 계좌(String name, String field, int money) {
		this.name = name;
		this.field = field;
		this.money = money;
	}
	
	

}
