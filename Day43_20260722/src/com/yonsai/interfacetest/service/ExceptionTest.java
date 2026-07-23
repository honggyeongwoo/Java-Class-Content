package com.yonsai.interfacetest.service;

public class ExceptionTest {
	
	public void 예외처리() {
		System.out.println("예외처리  란?");
		
		// Exception?
		//  -프로그램을 실행하다가 예상하지 못한 문제를
		//   해결하는 것!
		//  - 비정상적인 종료를 막기위해서!
		//  - 문제가 생겼을 때 프로그램이 죽지 않게 
		//	    하는 기술
		
//		// 정상이라면 아래 코드들이 다 실행 되야함
//		// 근데 10 / 0은 성립하지않음, 오류 코드 출력
//		int result = 10 / 0;
//		System.out.println(result);
//		// 이것도 콘솔 출력 안됨, 위에서 죽었거든
//		System.out.println("정상실행");

		
		int result = 10 / 2;
		System.out.println(result);
		int[] arr = {1,2,3};
		System.out.println(arr[5]); //문법? 맞아 근데 [5]라는건 없어 ..
		//  java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
	}
	
	public void 예외처리2() {
		try {
			//에러가 발생할 수 있는 문장들을 여기다 적는다
			int result = 10 / 0;
			System.out.println(result);
		}catch(/*어떤 종류의 에러를 처리할건지 적어*/ ArithmeticException e) {
			//ArithmeticException 수학적 계산에서 에러가 발생했을때 처리하겠다.
			//try에 적어둔 문장들에서 에러가 발생한다?
			//그럼 처리할게
			System.out.println("2_0으로 나눌수없다");//에러, 예외에 대한 설명
		}
		System.out.println("2_정상실행");
	}
	
	public void 예외처리3() {
		System.out.println();
		System.out.println("3 실행");
		
		try {
			int[] nums = {10,20,30};
			System.out.println(nums[5]);
		}catch (IndexOutOfBoundsException e) {
			System.out.println("3데이터가 없습니다.");
		}

		System.out.println("3정상실행");
		}
	
	// if,else 예측 가능해
	// try,catch 예측 불가능해
	
	public void if문과try차이2() {
		// try~catch "대비"
		// 회원가입 버튼눌렀을 때  저장하기전에
		// 서버가 에러의해서 꺼질수도 있고
		// 네트워크가 끊길 수도 있고
		// 내용을 저장해야되는 연결이 안된다.
		// 
		// try {
		// //회원가입저장();
		// }catch() {
		// System.out.println("실행해보기전엔 모른다");
		// }
		//
		// //데이터를 가져올때 API호출
		// // 공공데이터를 제공하는 서버쪽에서 나한테 애기없이
		// // 그냥 파일을 삭제하는경우,리뉴얼 파일 접근을 못하게 잠시 닫아놓은
		// // 경우
		// try {
		// //공공데이터가져와();
		// }catch() {
		// System.out.println("인터넷연결을 확인하세요");
		// }
		//
		// // 이미지 업로드 
		// //  서버쪽에서 용량이 없는거는 내가 확인을 못함
		// //  서버에서 바이러스 걸림 업로드X
		// try {
		// // 이미지업로드()
		// }catch() {
		// System.out.println("용량부족");
		// }
		//
		// 미리 확인 가능 - if문 
		// 실행하기 전에는 모르는 문제 - try-catch

		}



		public void if문과try차이() {

		// if~ else "예측"
		//  - 미리 알고 있는 상황 처리!
//		    날씨가 비가 온다 예측 
		//  - 이미 확인할 수있는 조건들!

		boolean 로그인성공 = true;

		if(로그인성공) {
		System.out.println("메인페이지로 이동");
		}else {
		System.out.println("로그인 실패");
		}

		// 아이디중복확인 미리 확인할 수있다.
		boolean 아이디중복 = true;

		if(아이디중복) {
		System.out.println("이미 사용중인 아이디입니다.");
		}else {
		System.out.println("회원가입 완료!");
		}

		// 장바구니 재고 확인
		int 재고 = 0;
		if(재고 > 0) {
		System.out.println("구매가능");
		}else {
		System.out.println("품절");
		}
		}

}
