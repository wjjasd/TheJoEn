package DB연결;

import javax.swing.JOptionPane;

public class 삭제UI {

	public static void main(String[] args) throws Exception {

		String id = JOptionPane.showInputDialog("삭제할 데이터 id 입력");
		
		
		MemberDAO db = new MemberDAO();
		
		db.delete(id);
		
	}

}
