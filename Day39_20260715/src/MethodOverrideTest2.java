

//class 신한은행앱{
//	int 잔액; // 내 돈 확인해줘야해. 근데 이체는 어케 할거야?
//	
//	//이체기능 메서드 만들게
//	void 이체하기(){ // void?
//		System.out.println("로그인");
//		System.out.println();
//		System.out.println();
//		System.out.println("이체 완료");
//		
//		// 이체 완료에 대한 결과만 보여주면 되니까 void 씀
//		// return으로 반환 해줄거 없으니까 생략헀음		
//	}
//}
//// 똑같은 기능을 하는 국민은행 전용 앱도 만들어래 
//// 죄다 중복인거같은데 ....
//
//
//
//// 앱 다운로드 =  new
//// 다운로드 행위 = 함수()
//
//class 국민은행앱{
//	int 잔액; // 내 돈 확인해줘야해. 근데 이체는 어케 할거야?
//	
//	//이체기능 메서드 만들게
//	void 이체하기(){ // void?
//		System.out.println("로그인");
//		System.out.println();
//		System.out.println();
//		System.out.println("이체 완료");
//		
//		// 이체 완료에 대한 결과만 보여주면 되니까 void 씀
//		// return으로 반환 해줄거 없으니까 생략헀음		
//	}
//}
//
//
//
//public class MethodOverrideTest2 {
//
//	public static void main(String[] args) {
//
//		국민은행앱 내핸드폰 = new 국민은행앱(); //내 휴대폰에 설치한다.
//		
//		System.out.println("--내핸드폰--");
//		내핸드폰.이체하기(); // 이체하기 기능 메서드 실행 -> 콘솔에 출력되지요
//		
//	}
//
//}

//어라? 새로운 기능(메서드)를 추가 해야한다.  어쩌지

////////////////////////////////////////////////////

class 신한은행앱{
	int 잔액; 
	
	void 이체하기(){
		System.out.println("로그인");
		System.out.println();
		System.out.println();
		System.out.println("이체 완료");
	}
		// 앱으로 출금을 하는 기능!
		// 우리도 카드 없이 출금할 수있도록 해줄께
		//  gitflow  main 서비스를 실행중! 
//		dev / feature - 스마트출금 브랜치 생성
		int 스마트출금(String 비밀번호){
		System.out.println("비밀번호가 맞으면 출금액입력");
		System.out.println("내 계좌 잔액이랑 비교한다");
		System.out.println("잔액이 출금액보다 많으면 출금");
		return 200000;
		}
}


class 국민은행앱{
	int 잔액; 
	void 이체하기(){ 
		System.out.println("로그인");
		System.out.println();
		System.out.println();
		System.out.println("이체 완료");
	
	}
}



public class MethodOverrideTest2 {

	public static void main(String[] args) {

		국민은행앱 내핸드폰 = new 국민은행앱(); //내 휴대폰에 설치한다.
		
		System.out.println("--내핸드폰--");
		내핸드폰.이체하기(); // 이체하기 기능 메서드 실행 -> 콘솔에 출력되지요
		
	}

}
