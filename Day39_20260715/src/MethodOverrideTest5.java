// 파일명 : MethodOverrideTest5.java

//부모클레스 작성
class 부모 {
	int 나이; //필드값
	
	void 먹는다() { //부모 메서드
		System.out.println("먹는다");
	}
}

class 자식 extends 부모 { //부모 class 상속 받아서 사용할게
	//int 나이;
	//	
	//	void 먹는다() { 
	//		System.out.println("먹는다");
	//	} //기본적으로 이렇게 가져와짐.	그대로 사용해도 되~	
	// 아래서서 new 자식 -> 만들면 그대로 가져감
	
	@Override
	
	void 먹는다() { //어? void 먹는다() 선언했네? 재정의 하는구나? 강제아니야 그대로 써도되 진짜 오버라이딩 할게? ok 덮어쓸게
		System.out.println("아주많이 먹는다");
	}
	
//////////////////////////////////////////////////////////
	
class 프렌차이즈본사 { //부모 클레스 다.
	void 매장운영방법() { // 가맹주님들 이거 가져다 쓰세요~
		System.out.println("본사 메뉴얼");
	}
}

class 프렌차이즈_수원지점 extends 프렌차이즈본사 { // 본사 구조를 고대~로 가져온 지점 클래스 생성
	// 저희는 그대로 변경하지않고 쓰겠습니다.
}

class 프렌차이즈_제주지점 extends 프렌차이즈본사{ // 본사 구조를 고대~로 가져온 지점 클래스 생성	
	// 고대~로 가져왔는데, 저희 나름대로 재정의 해야할것같아요
	@Override // 재정의 할거니까 확인 좀 해주세요
	
	void 매장운영방법() { // 저희가 생각해봤는데 재정의 해서 따로 쓰겠습니다.
		System.out.println("제주지점 메뉴얼");
	}
	
}

	
	
	
}

public class MethodOverrideTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
