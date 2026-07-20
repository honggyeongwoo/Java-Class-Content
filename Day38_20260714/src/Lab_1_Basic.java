

//**문제 1. 교통수단 → 자동차, 오토바이**
//
//- 여러 교통수단이 공통으로 가지는 변수를 부모 클래스 `교통수단`에 묶기
//  : `String 번호판`, `int 속도`
//- `자동차`가 `교통수단`을 상속받고, 고유 변수 `int 문개수` 추가
//- `오토바이`가 `교통수단`을 상속받고, 고유 변수 `boolean 사이드카여부` 추가
//
//**힌트:** `번호판`, `속도`를 `자동차`, `오토바이`에 
//각각 다시 적지 않아도 되는 이유를 생각해보세요.

// 부모(교통수단) : `String 번호판`, `int 속도`
// 상속(자동차, 오토바이)

// 자동차/ 고유 변수 `int 문개수`
// 오토바이/ 고유 변수 `boolean 사이드카여부`

class 교통수단 {
	String 번호판;
	int 속도;
}

class 자동차1 extends 교통수단{
//상속받음	String 번호판; 
//상속받음	int 속도; 
	
	int 문개수; // 자동차-고유변수
}

class 오토바이 extends 교통수단{
//상속받음	String 번호판; 
//상속받음	int 속도; 
	
	boolean 사이드카여부;
}

public class Lab_1_Basic {

	public static void main(String[] args) {

		자동차1 모닝 = new 자동차1(); // 교통수단->자동차1 의 구조를 가진 "모닝" 메모리 생성
		모닝.번호판 = "62고 5555";
		모닝.속도 = 80;
		모닝.문개수 = 4; // 고유 변수
		
		System.out.println(모닝.번호판);
		System.out.println(모닝.속도);
		System.out.println(모닝.문개수);

		
		오토바이 혼다 = new 오토바이(); // 교통수단->오토바이 의 구조를 가진 "혼다" 메모리 생성
		혼다.번호판 = "서울 5555";
		혼다.속도 = 50;
		혼다.사이드카여부 = false; // 고유 변수
		
		System.out.println(혼다.번호판);
		System.out.println(혼다.속도);
		System.out.println(혼다.사이드카여부);
	}

}
