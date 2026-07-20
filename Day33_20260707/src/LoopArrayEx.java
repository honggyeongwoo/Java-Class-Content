import java.util.Scanner;
import java.util.Arrays;

public class LoopArrayEx {

	public static void main(String[] args) {

		String[] cust = { "일", "이", "삼", "사", "오", "육" };

//		while 사용해서 현재 주문한 고객의 닉네임을 가져와서 화면에 띄우기

		int 공간번호 = 0;

		while (공간번호 <= 5) {
			System.out.println(cust[공간번호]);
			공간번호 += +1;
		}
		System.out.println();
///////////////////////////
		String[] members = { "a", "b", "c", "d", "e", "f" };

		int spaceMem = 0;

		while (spaceMem <= 5) {
			System.out.println(members[spaceMem++] + "고객님 할인쿠폰 발급 되었습니다.");
		}
		System.out.println();
///////////////////////////
		int 번호 = 0;
		while (번호 < members.length) {
			System.out.println(members[번호] + " 15% 할인쿠폰이 도착했습니다");
			번호 += 1;
		}

		System.out.println();
///////////////////////////		
		// 배열 = 여러개의 데이터를 저장한다
		// 반복문 = 같은 일을 여러번 시킨다
		// 배열 + 반복문 = 여러개의 데이터를 하나씩 꺼내면서
//		               같은 작업을 수행한다.
		// 목록! 보여주는 프로그램에서는 많이 사용한다.

		// 회원가입할 때 아이디 중복검사하는 로직!
		// 사용자가 입력한 아이디가 이미 다른 사람이
		// 사용중인지 확인하는 기능!
///////////////////////////
		System.out.println();

		Scanner input = new Scanner(System.in);

		String[] 기존아이디 = { "apple", "banana", "cherry" };

		System.out.print("가입할 아이디를 입력하세요: ");

		String 새로가입하는아이디 = input.next();

		boolean 중복 = false;
		for (String id : 기존아이디) {
			if (새로가입하는아이디.equals(id)) {
				중복 = true;
				break;
			}
		}

		if (중복) {
			System.out.println("중복입니다.");
		} else {

			String[] 새배열 = new String[기존아이디.length + 1];

			for (int i = 0; i < 기존아이디.length; i++) {
				새배열[i] = 기존아이디[i];
			}

			새배열[새배열.length - 1] = 새로가입하는아이디;

			기존아이디 = 새배열;

			System.out.println("가입 완료!");
			System.out.println("현재 목록: " + Arrays.toString(기존아이디));
		}
		input.close();

//////////////////////////////////

//		Scanner 키보드 = new Scanner(System.in);
//
//		String[] 기존아이디 = {"apple", "banana", "cherry"};
//		
////		input으로 입력 받기
//		String 새로가입하는아이디 = "";
//		
//		if(새로가입하는아이디 == 기존아이디[]) {
//			System.out.println("중복입니다. 다른 아이디를 사용해주세요");
//		}else {
//			String 기존아이디[] = 새로가입하는아이디;
//			System.out.println(기존아이디);
//			기존아이디.split;
//		}

////////////////////////////////////////////////////////////
	}

}
