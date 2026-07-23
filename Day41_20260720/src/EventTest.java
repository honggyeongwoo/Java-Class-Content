import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// 버튼을 클릭했을때 글을 입력했을 때 뭔가 사용자가 
// 행동을 했을 때 동작하는 것!  이벤트!
public class EventTest {

public EventTest() {
// 창 만들기
JFrame 윈도우창 = new JFrame();

// 창 설정
윈도우창.setSize(400, 500); //가로 * 세로
윈도우창.setLayout(new FlowLayout()); // display-flex 같은, 없으면 마지막에 창에 추가된 기능만 보여짐, 레이어의 최상단 하나만

// 내용추가 
JButton 확인버튼 = new JButton("눌러봐!!"); // 버튼 기능 생성

//확인버튼을 클릭했을 때 동작해라!
//onclick 비슷하다! 
//addActionListener
//버튼을 클릭시 행동을 작성한다.

확인버튼.addActionListener(e->{ // 화살표 함수, 클릭시 {}실행
System.out.println("안녕하세요!");
});

윈도우창.add(확인버튼); //만들어놓은 "확인버튼" 기능 창에 추가

JButton 빨간버튼 = new JButton("RED!!"); // 버튼 기능 생성 red라고 출력됨
JButton 파란버튼 = new JButton("BLUE!!"); // 버튼 기능 생성 blue 라고 출력됨

윈도우창.add(파란버튼); //일단 만들었으면 add로 추가해야함
윈도우창.add(빨간버튼); //만들어놓은 "빨간버튼" 기능 창에 추가

파란버튼.addActionListener(e->{// 화살표 함수, 클릭시 {}실행
System.out.println("blue blue!");
});

빨간버튼.addActionListener(e->{// 화살표 함수, 클릭시 {}실행
System.out.println("red red!");
});

윈도우창.setDefaultCloseOperation(3);

윈도우창.setVisible(true); // 

}
}