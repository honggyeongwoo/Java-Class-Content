import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiTest3 {
	
	public GuiTest3() {
		System.out.println("실행해 Test3");
		
		JFrame 화면 = new JFrame(); // 창 만들기
		
		화면.setSize(400,300); // 켜치는 창의 size 설정		
		
		JLabel 아아디레이블 = new JLabel("아이디 : ");		
		화면.add(아아디레이블); // 아이디레이블 화면에 추가
		
		JButton 확인버튼 = new JButton("확인");
//		화면.add(확인버튼);
		
		//add는 레이어 느낌처럼 쌓임. 마지막에 add한 것만 보여줌? 한 화면 전체를?
		//같이 보여주고싶다면 배치가 필요하다. 겹치지않게끔?
		
		
		화면.setVisible(true); // 화면을 실제로 보여줘
	}

}
