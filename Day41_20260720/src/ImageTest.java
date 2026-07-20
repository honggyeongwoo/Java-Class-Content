import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//이미지를 가져오는 클래스

// 경로 설정 
//  항상 프로젝트 폴더 안에 넣어놓기 
//  그러면 파일명으로 저장 가능하다.
//  단! 실무에서는 폴더를 나눠 놓습니다.
//  image폴더 그 안에  이미지들 넣어놓고 
//  상대경로 - 파일 자기 자신위치에서 경로를 찾는다.

public class ImageTest {
	// 창만들기 - 창설정(크기) - 레이아웃 만들기(배치, 안쓰면 마지막 컨텐츠만 최상단 레이어) - 요소 만들기 - 요소 창에 추가하기 - 창 보이기
	public ImageTest() {
		System.out.println("이미지 가져오기");
		
		JFrame 화면 = new JFrame(); // 창 만들기
		
		화면.setSize(1200,400); // 화면 설정(크기)
		화면.setLayout(new FlowLayout()); // 마지막에 추가한 버튼이 레이어 최상단에서 혼자 보임
//		화면.setLayout(new BorderLayout()); // 이건 뭐임? flow랑 border랑 뭐가 다른가

		// 실제로 이미지를 가져오는 도구!
		ImageIcon 라이언 = new ImageIcon("ryan.png");
		
		
		JButton 라이언버튼 = new JButton(라이언); //버튼에 넣기
//		라이언버튼.setSize(100,100); 이건 안먹하네 ..		
		화면.add(라이언버튼); // 화면에 추가하기
		라이언버튼.addActionListener(e->{
			System.out.println("라이언 입니다!");
			});
		
		ImageIcon 무지 = new ImageIcon("muji.png"); 
		JButton 무지버튼 = new JButton(무지);
		화면.add(무지버튼);
		무지버튼.addActionListener(e->{
			System.out.println("무지 입니다!");
			System.out.println();
			System.out.println("무지의 정보를 입력하세요");
			
			//무지버튼 눌렀을때 아래 텍스트,패스워드 창 띄우고
			//배치를 아래쪽에 하고픈데 
			JTextField 텍스트창 = new JTextField(15); // JTextField(15, "North")방향이 왜 안먹지
			JPasswordField 패스워드창 = new JPasswordField(20);	
			화면.add(텍스트창, "North"); // add에 추가해야죠~, 근데 딱히 쓴거랑 안쓴거랑 배치가 안달라지는데?
			화면.add(패스워드창, "North");
			
		    화면.revalidate(); // 레이아웃 재계산
		    화면.repaint();   // 화면 다시 그리기
			});
		
		ImageIcon 어피치 = new ImageIcon("apeach.png"); //FlowLayout 없으면, 어피치 버튼 하나만 출력됨
		JButton 어피치버튼 = new JButton(어피치);
//		어피치버튼.setSize(100,100);
		화면.add(어피치버튼);
		어피치버튼.addActionListener(e->{
			System.out.println("어피치 입니다!");
			});
		
		라이언버튼.setPreferredSize(new Dimension(300, 300));
		무지버튼.setPreferredSize(new Dimension(300, 300));
		어피치버튼.setPreferredSize(new Dimension(300, 300));
	
		
		화면.setVisible(true); // 창 보이기(띄우기 ?)
	}
}
