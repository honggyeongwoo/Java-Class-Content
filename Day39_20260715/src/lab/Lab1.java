package lab;

import java.util.ArrayList;

class 자동차{ // 부모 class 생성
	String 이름; // 필드값 생성
	
	void 경적울리기() { // 부모 class에서 실행?할 메서드 생성
		             // return 별 필요없어서 void 선언
		System.out.println("빵빵");
	}
}

class 승용차 extends 자동차{ // 부모 class 기반으로 승용차 라는 놈이 상속받음
	@Override // 부모에서 가져와서 오버라이딩 할예정이다.
	void 경적울리기(){ // 오버라이딩 함
		System.out.println("빵!"); // 내용은 수정해서 썼음
	}
}

class 트럭 extends 자동차{	
	@Override
	void 경적울리기(){
		System.out.println("빠아아아아아아앙!");
	}
}

class 오토바이 extends 자동차{	
	void 경적울리기(){
		// 그냥 이대로 덮어짐, 부모꺼를 그대로 쓰고싶으면 그냥 경적울리기()이걸 안쓰면 됨
	}
}

public class Lab1 {

	public static void main(String[] args) {
		
		ArrayList<자동차> 주차장 = new ArrayList<>();
		
		주차장.add(new 승용차());
		
//		주차장.add(승용차);
		// ()안에 승용차, 승용차() 다 안되고 new 승용차()만 되네?
		
		주차장.add(new 트럭());
		주차장.add(new 오토바이());
		
		주차장.get(0); // 왜 콘솔 안되지? 다 void 까지 다 불러온거 아닌가?

		주차장.get(0).경적울리기();  // 빵~ , 배열 0번 승용차
		주차장.get(1).경적울리기();  // 빠라라라랑~ , 배열 1번 트럭
		주차장.get(2).경적울리기();  // 빵빵빵! , 배열 2번 오토바이
		
	}

}
