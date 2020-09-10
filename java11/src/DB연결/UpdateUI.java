package DB연결;

import javax.swing.JOptionPane;

public class UpdateUI {

	public static void main(String[] args) throws Exception {

		String id = JOptionPane.showInputDialog("업데이트 데이터 id 입력");
		String tel = JOptionPane.showInputDialog("업데이트 데이터 입력");
		
		
		MemberDAO db = new MemberDAO();
		
		db.update(id,tel);
		
	}

}
