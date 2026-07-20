public class LoopEx {

	public static void main(String[] args) {
// 모든 언어에서 공통적으로 사용하는 반복문
// 반복문 그럼 왜 쓰죠? 
//  - 

// 만약 카페 커피 주문 5개 
// println() 자바는 화면이 없다(프론트화면 X)
// 콘솔 창에 찍어보는것 console.log() == println()
// Scanner == 콘솔창에 입력하는 > 입력한다!
		System.out.println("1번고객님 커피 나왔습니다.");
		System.out.println("2번고객님 커피 나왔습니다.");
		System.out.println("3번고객님 커피 나왔습니다.");
		System.out.println("4번고객님 커피 나왔습니다.");
		System.out.println("5번고객님 커피 나왔습니다.");

// 게임 몬스터 생성
		System.out.println("몬스터 출현!");
		System.out.println("몬스터 출현!");
		System.out.println("몬스터 출현!");
		System.out.println("몬스터 출현!");
		System.out.println("몬스터 출현!");
		System.out.println("몬스터 출현!");

// 커피를 주문하거나 회원에게 문자를 보내야된다.
// 쇼핑몰에서 10%쿠폰이 생겼다 지금얼른 구매문자!
		System.out.println("15%할인쿠폰 나갑니다! 얼른 구매하세요");
		System.out.println("15%할인쿠폰 나갑니다! 얼른 구매하세요");
		System.out.println("15%할인쿠폰 나갑니다! 얼른 구매하세요");
		System.out.println("15%할인쿠폰 나갑니다! 얼른 구매하세요");
		System.out.println("15%할인쿠폰 나갑니다! 얼른 구매하세요");
		System.out.println("15%할인쿠폰 나갑니다! 얼른 구매하세요");
		System.out.println("15%할인쿠폰 나갑니다! 얼른 구매하세요");
		System.out.println("15%할인쿠폰 나갑니다! 얼른 구매하세요");
		System.out.println("15%할인쿠폰 나갑니다! 얼른 구매하세요");
		System.out.println("15%할인쿠폰 나갑니다! 얼른 구매하세요");

// 회원이 10000명? 내 손가락 부서짐
// 컴퓨터야! 1000번 반복해줄래? - 반복문 (스케쥴러,알림)
// 배열
// String[] 카페주문 = {"1 아메리카노","2아메리카노","3.카페모카"};

// 시작값 
// 얼마동안 반복할꺼냐
// 다음으로 이동할때 몇씩 이동

// while(참인동안반복해라) {
// 어떤 내용을 실행할지 문장들;
//
// }
/////////////////////////////////////////////////////////////////////////

// 10~20까지 출력하는 반복문 !

// 1. 시작하는 값 정하기 / 10
		int start = 10;
		int end = 20;

//2. 반복 실행

		while (start <= end) {
			System.out.println(start);
			start = start + 1;
		}

		System.out.println("반복 끝");

// 20 <= 20 이 되는순간 20으로 출력 -> +1 -> while 또 시작/ 21 <= 20 ? / ㄴㄴ false 반복 끝낼게 /

/////////////////////////////////////////////////////////////////////////
		System.out.println();
// 10번 찍어 안넘어가는 나무 엄슴

// 시작값, 종료값 설정(저장)

		int start2 = 1; // 변수값 key-word : count?
		int end2 = 10; //

//1~10번 반복해서 찍기

		while (start2 <= end2) {
			System.out.println("나무를 찍은 횟수: " + start2++);

		}
//10번찍고 종료되면 나무가 넘어감

		System.out.println((start2 - 1) + "번 찍어서 나무를 넘어뜨렸다.");
///////////////////////////////////////////////////////
		System.out.println();
//더 줄인다면? num++ ?  ++를 변수 뒤에 붙인다면 ?

//while(start2 <= end2) {
//	System.out.println("나무를 찍은 횟수: " + start2++);
//	start2 += 1;
//}

///////////////////////////////////////////////////////

		int num = 10;

		System.out.println("초기값: " + num);
		System.out.println("변경 num++ : " + num++);
		System.out.println("변경된 후 값 : " + num);

///////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////

	}
}