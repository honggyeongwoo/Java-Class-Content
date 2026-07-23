package lab;

import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


interface 알림수단 {
    void 보내기(String 메시지);
}

	class 이메일알림 implements 알림수단 {
	    @Override
	    public void 보내기(String 메시지) {
	        System.out.println("[이메일] " + 메시지 + " 발송 완료");
	    }
	}
	
	class 문자알림 implements 알림수단 {
	    @Override
	    public void 보내기(String 메시지) {
	        System.out.println("[문자] " + 메시지 + " 발송 완료");
	    }
	}

class 알림서비스 {
    public void 알림보내기(알림수단 수단, String 메시지) {
        수단.보내기(메시지);
    }
}

public class Lab1_Aret {
	public static void main(String[] args) {
		
		// 웹(UI)화면 (빈 화면)
		JFrame 메시지창 = new JFrame();

		// 화면 설정 
		메시지창.setSize(500,250);

		// 화면배치를 flex처럼 가로정렬 하겠다!
		메시지창.setLayout(new FlowLayout());

		// 알림 내용 , P태그
		JLabel 텍스트레이블 = new JLabel("보낼 메시지를 입력하고 버튼을 누르세요.");
		
		// 키보드,input 입력 받을게
		JTextField 텍스트입력창 = new JTextField(20);
		
		// 실행 버튼 만들게
		JButton 문자전송버튼 = new JButton("문자 전송");
		
			문자전송버튼.addActionListener(e->{ // 버튼누르면 실행할 함수(메서드) 만들게		
				
				알림서비스 서비스 = new 알림서비스(); // 버튼 누르면 "서비스" 라는 이름의 새로운 "알림서비스()" 메서드 생성 
				
				문자알림 A = new 문자알림(); // 알림보내기(){} 메서드에 수단으로 사용할 "문자알림" 객체,메모리 생성
				서비스.알림보내기(A /*수단*/, 텍스트입력창.getText() /*get으로 문자열을 가져온다.*/); 
				
					// 축약해서 쓴다면 
					// 서비스.알림보내기(new 문자알림() , 텍스트입력창.getText()); 
				
					// new 문자알림().보내기(텍스트입력창); 이렇게 쓰변 타입이 안맞다.
				
			}); // 버튼 클릭 이벤트 종료
		
		JButton 이메일전송버튼 = new JButton("이메일 전송");
		이메일전송버튼.addActionListener(e->{ 	
				
				알림서비스 서비스 = new 알림서비스();  
				
				서비스.알림보내기(new 이메일알림(), 텍스트입력창.getText());
				
			}); // 버튼 클릭 이벤트 종료
		
				
		 // 메시지창에 내가 만든 설명레이블, 입력창, 버튼  추가
		 메시지창.add(텍스트레이블);
		 메시지창.add(텍스트입력창);
		 메시지창.add(문자전송버튼);
		 메시지창.add(이메일전송버튼);
				
		// 창 x 닫기
		메시지창.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창 띄우기
		메시지창.setVisible(true);
			}		
	}

