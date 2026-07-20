// 파일명 : PolymorphismTest.java

import java.util.ArrayList;

class 종합병원 { 
	
//	ArrayList<내과의사> 내과의사그룹 = new ArrayList<>(); 노놉
//	ArrayList<외과의사> 외과의사그룹 = new ArrayList<>(); 노놉
	// 굳이굳이 더 안줄이고 ?
	
//	ArrayList<의사> 의사그룹 = new ArrayList<>();  ??
	ArrayList<의사> 의사그룹; // 뭔 차이지 ..?, int 변수 랑 int 변수 =0; 개념?
}

class 의사 { // 부모 클래스
	
	String 이름; //필드
	String 진료과; //필드
	String 진료과목; //필드	
}

class 내과의사 extends 의사 { // 부모의 자식 클래스 
	
}

class 외과의사 extends 의사 { // 부모의 자식 클래스 
	
}

public class PolymorphismTest {

	public static void main(String[] args) {
// 다형성?
//  - 같은 명령을 내려도 객체마다 다르게 동작하는것
//  - 서로 다른 자식들을 부모라는 이름의 공통상자
//	     하나에 몽땅 집어넣고 한꺼번에 다루는것!
		
		
	// 의사 /= 내과의사 . 연관성이 있잖아? 부모-자식
	// 그러니까 변수로 만들수 있는거야 xx?
	// 좌/우 이름이 다르면 원래 안되는데
    // 그게 가능하려면 상속관계/연관성이 있는 관계야지 정상적으로 선언이 가능하다.
	
	의사 첫번째 = new 내과의사(); // 의사 class의 새로운 객체 생성
	System.out.println("생성된 실제 :" + 첫번째);

	의사 두번째 = new 외과의사(); // 의사 class의 새로운 객체 생성
	System.out.println("생성된 실제 :" + 두번째);
	
//	의사 세번째 = new 내과의사("김말이", "내과", "내과내과"); 아직 생성자가 없잖니.. 아하?
//	System.out.println("생성된 실제 :" + 세번째); // 
		

	}
	}