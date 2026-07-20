import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//public class LoginTest { 홍경우 작성
//	
//	// 로그인 창을 만들어서 로그인 됬는지 안됬는지 확인!!
//	// 순서
//		//  창만들기(JFrame) - 
//		//	창 설정(setSize,FlowLayout)  
//		//	기능 만들기(JLabel,JTextField,JPasswordField,JButton)
//		//	기능 화면에 추가(윈도우창.add)
//		//	종료버튼(윈도우창.setDefaultCloseOperation())
//		//	창 화면 보이기(윈도우창.setVisible(true))
//	
//	public LoginTest() {
//		JFrame 윈도우창 = new JFrame(); // 새 창 만들기.
//
//		윈도우창.setSize(600, 300); // 사이즈 설정
//		윈도우창.setLayout(new FlowLayout()); // 겹치지않게끔. 레이어, 레이아웃 분리? 
//		
//		// 기능 만들기
//		
//		// 아이디 레이블, 입력창
//			JLabel 아이디레이블 = new JLabel("아이디 : "); //아이디 레이블 생성
//			
//			// input type=text 한줄 입력창 만들기
//			// JTextField(대략적인 가로크기)
//			JTextField 아이디텍스트창 = new JTextField(15);	
//			
//		// 비밀번호 레이블, 입력창
//			JLabel 비밀번호레이블 = new JLabel("비밀번호 : "); //아이디 레이블 생성			
//	
//			// input type=password 
//			// 비밀번호를 입력할 때 글자를 숨겨주는 input창!
//			JPasswordField 패스워드창 = new JPasswordField(20);
//			
//		// 로그인 버튼 만들기
//			JButton 로그인확인버튼 = new JButton("로그인 확인");
//		
//
//		// 화면에 보여주기 , add안하면 화면 에 보여지지않음
//			윈도우창.add(아이디레이블); // 아이디 레이블 화면 추가
//			윈도우창.add(아이디텍스트창); // 아이디 입력창 화면 추가
//			
//			윈도우창.add(비밀번호레이블); // 비밀번호 레이블 화면 추가
//			윈도우창.add(패스워드창); // 비밀번호 입력창 화면 추가
//		
//			윈도우창.add(로그인확인버튼); // 로그인 확인 버튼 화면 추가
//
//		// 종료 기능
//		윈도우창.setDefaultCloseOperation(3); // x 표시 누르면 종료
//
//		// 창 보이기
//		윈도우창.setVisible(true); // 디폴트값은 숨겨짐, 보이기위해 Visible(true)
//	}
//
//}
//--------------------------------------------------------------------------

public class LoginTest {
public LoginTest() {
	// 창 만들기
	JFrame 윈도우창 = new JFrame("로그인");

	// 창 크기
	윈도우창.setSize(600, 300);
	
	// 가로 정렬 (FlowLayout)
	// 가운데 정렬을 해서  FlowLayout.CENTER
	// 가로 간격 (px) 20
	// 세로 간격 (px) 15
	윈도우창.setLayout(new FlowLayout(
	 FlowLayout.CENTER
	 ,20,15));

	JLabel 아이디라벨 = new JLabel("아이디");
	JTextField 아이디입력 = new JTextField(15);

	JLabel 비밀번호라벨 = new JLabel("비밀번호");
	JPasswordField 비밀번호입력 = new JPasswordField(15);

	JButton 로그인버튼 = new JButton("로그인");


	// 사용자가 행동하기를 기다린다. 
	//  사용자가 로그인 버튼을 클릭하면 
	로그인버튼.addActionListener(e->{

	// 자바스크립트에서도 input타입들 이벤트 처리할때
	// 이벤트객체가 자동으로 넘어온다. 안 쓰고 싶으면 안쓰면됨
	// input창에서 내용꺼내기! getText();

	String 아이디 = 아이디입력.getText();
	// 비밀번호가 각각 저장되어있는 char[]로 되어있다.
	// 그래서 문자로 변경해라!
	String 비밀번호 = new String(비밀번호입력.getPassword());

	System.out.println("아이디:" + 아이디);
	System.out.println("비밀번호:" + 비밀번호);

	if(아이디.equals("admin") && 
	   비밀번호.equals("1234")) {
	System.out.println("로그인 성공!");
	}else {
	System.out.println("아이디 또는 비밀번호 확인하세요!");
	JOptionPane.showMessageDialog(null, "로그인 실패");
	}

	아이디입력.setText("");       // ✅ 텍스트 비우기
	비밀번호입력.setText("");     // ✅ 비밀번호창 비우기
	
	});






	윈도우창.add(아이디라벨);
	윈도우창.add(아이디입력);

	윈도우창.add(비밀번호라벨);
	윈도우창.add(비밀번호입력);
	윈도우창.add(로그인버튼);

	// 종료 버튼
	윈도우창.setDefaultCloseOperation(3);

	// 창 보이기
	윈도우창.setVisible(true);
	}
	}
