package com.yonsai.interfacetest.service;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

//class 아빠{void 인사 {System.out.println("아빠 꺼");}}
//class 엄마{void 인사 {System.out.println("엄마 꺼");}}
//class 나 extends 아빠,엄마{
//	void 인사 {System.out.println("아빠 꺼");}
//	void 인사 {System.out.println("엄마 꺼");}
//} // 불가!! 왜 ???

//첫번째 문제는 나라는 클래스 엄마아빠 클래스 둘다 못받음
//두번째 문제는 두 클래스에 혹시라도 똑같은 이름이 있으면
//자식입장에서 어떤걸 실행하지?
//모호성(Ambiguity) 이런 문제 때문에 자바는 아예 차단!
//다중상속하지마! 그래서 인터페이스 나옴!

// 다중 상속 금지 = 충돌이 생길 가능성이 있으니, 아예 원천차단한 언어 설계 결정.

interface 아빠{
	void 인사();
}
interface 엄마{
	void 인사();
}

class 나 implements 아빠,엄마{

	@Override
	public void 인사() {		
	}	
}

//인터페이스와 implements가 생긴 이유는 다중 상속의 충돌 문제를 해결하면서도 
//"여러 규칙을 동시에 강제"할 수 있게 하기 위해서입니다.

//		//배달앱 만든다. 
//		//배달은 주문을 하면 결제!
//		//카드 결제할 수있는 승인! 카드결제만 가능하다!
//		class 카드결제{
//		public void 카드로결제하기(int 금액) {
//		System.out.println("카드로 "+ 금액 +"결제");
//		}
//		}
//		
//		class 주문처리{
//		//결제 진행이 되면 주문 완료! 실제 음식을 만들어서 배달!
//		public void 주문하기(String 결제방법,int 금액) {
//		카드결제 카드 = new 카드결제();
//		카드.카드로결제하기(금액);
//		
//		System.out.println("주문이 완료되었습니다. 배송시간 30분걸립니다.");
//		}
//		}

			//결제 부분을 인터페이스로 개선 한다면 ?
			//규칙 : 모든 결제 수단은 "결제하기(금액)"을 반드시 가지고 있어야 한다.

			interface 결제수단{
				void 결제하기(int 금액);
			}
			
			class 주문처리{
				public void 주문하기(결제수단 방법, int 금액) {
					방법.결제하기(금액);
				}
			}

				class 카카오결제 implements 결제수단{
					@Override
					public void 결제하기(int 금액) {
					System.out.println("카카오 결제" + 금액);
					}
					}
				class 애플페이 implements 결제수단{
	
					@Override
					public void 결제하기(int 금액) {
					System.out.println("애플페이 결제" + 금액);
					}
					}
				class 토스페이 implements 결제수단{
					
					@Override
					public void 결제하기(int 금액) {
					System.out.println("토스페이 결제" + 금액);
					}
					}


public class InterfaceTest2 {
// 클래스는 다중(여러클래스) 상속 못한다?
	
	public void 주문화면() {

		// 웹(UI)화면 (빈 화면)
		JFrame 결제창 = new JFrame();

		// 화면 설정 
		결제창.setSize(500,250);

		// 화면배치를 flex처럼 가로정렬 하겠다!
		결제창.setLayout(new FlowLayout());

		// 내용 추가
		JLabel 결제안내 = new JLabel("결제 방법을 선택하세요.");
		JRadioButton kakao = new JRadioButton("카카오페이");
		JRadioButton apple = new JRadioButton("애플페이");
		JRadioButton toss = new JRadioButton("토스페이");

		// 하나만 선택 가능
		ButtonGroup group = new ButtonGroup();

		group.add(kakao);
		group.add(apple);
		group.add(toss);
		
		// 결제하기 버튼 
		JButton btn = new JButton("결제하기");
		
		// 결제하기 버튼을 클릭했을 때 실행해라~
		// 이벤트를 달겠다. 
		// 고객이 버튼을 누른 동작을 했을 때 이렇게 실행해!
		btn.addActionListener(e->{
			
			// 함수에서
			// 타입이 없다? void
			// 값이 없다? null
			
			결제수단 선택한결제수단 = null; // 선택한 결제수단이.   없다!
			
			// 어떤 결제수단이 체크 되었는지 확인
			if (kakao.isSelected()) {

			선택한결제수단 = new 카카오결제();
			System.out.println("카카오결제 메모리 생성");

			} else if (apple.isSelected()) {

			선택한결제수단 = new 애플페이();
			System.out.println("애플페이 메모리 생성");
			
			} else if (toss.isSelected()) {

			선택한결제수단 = new 토스페이();
			System.out.println("토스페이 메모리 생성");
			}
			
			주문처리 주문 = new 주문처리();
			// 결제수단을 클릭했으니 주문처리 진행할게
			주문.주문하기(선택한결제수단, 30000);
			
			// 라디오버튼에서 체크가 되었는지 안됬는지 확인
//			System.out.println(kakao.isSelected() + "카카오");
//			System.out.println(apple.isSelected() + "애플");
//			System.out.println(toss.isSelected() + "토스");
			
		}); // 버튼 클릭 이벤트 종료
		
		// 결제창에 내가 만든 라벨,버튼,라디오버튼을 추가
		결제창.add(결제안내);
		결제창.add(kakao);
		결제창.add(apple);
		결제창.add(toss);
		결제창.add(btn);
		

		결제창.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		결제창.setVisible(true);
	}
	
	
	
	
	
		public void 테스트2() {
			주문처리 주문 = new 주문처리();	
			
//			카카오결제 카카오 = new 카카오결제();		
			주문.주문하기(new 카카오결제(), 1000);
//			주문.주문하기(카카오, 1000);

			
			
			
			

		}
}
