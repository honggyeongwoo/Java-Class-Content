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
윈도우창.setSize(400, 500);
윈도우창.setLayout(new FlowLayout());

// 내용추가 
JButton 확인버튼 = new JButton("눌러봐!!");


//확인버튼을 클릭했을 때 동작해라!
//onclick 비슷하다! 
//addActionListener
//버튼을 클릭시 행동을 작성한다.
확인버튼.addActionListener(e->{
System.out.println("안녕하세요!");
});

윈도우창.add(확인버튼);

JButton 빨간버튼 = new JButton("RED!!");
JButton 파란버튼 = new JButton("BLUE!!");
윈도우창.add(파란버튼); //일단 만들었으면 add로 추가해야함
윈도우창.add(빨간버튼);

파란버튼.addActionListener(e->{
System.out.println("blue blue!");
});

빨간버튼.addActionListener(e->{
System.out.println("red red!");
});






윈도우창.setDefaultCloseOperation(3);

윈도우창.setVisible(true);

}
}