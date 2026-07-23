package com.yonsai.member.service;

import java.util.HashMap;
import java.util.Scanner;

class Member{
String id;
String password;
String name;
}

public class MemberService {
	
	// 3. 빠르게 서치하기 위해. HashMap 이용해서 저장하기
			HashMap<String, Member> 회원목록 = new HashMap<>();
			// 회원가입 메서드 안에있으면 계속 회원목록이 반복되서 생성됨?
			
////////
			
	// 회원가입하는 함수 만들기
	public void 회원가입(Scanner input) { // main에 있는, 만들어놓은 Scanner input 가져오기
		//회원가입 기능하는 메서드 선언
		
        while (true) { // 중복 확인은 아이디를 입력받은 직후에 해야 함 
        	
        	
            System.out.print("아이디 입력 : ");
            String 입력id = input.next();

            if (회원목록.containsKey(입력id)) {
                System.out.println("중복입니다. 다시 입력하세요.");
                
                continue; // 중복이면 다시 아이디부터 입력 받아야함   
            }

            System.out.print("비밀번호 입력 : ");
            String 입력pw = input.next();

            System.out.print("이름 입력 : ");
            String 입력name = input.next();

            Member A = new Member(); // Class 구조에 객체 A 변수 저장
            A.id = 입력id;
            A.password = 입력pw;
            A.name = 입력name;

            회원목록.put(입력id, A); // Key값 부여해서 목록 map에 저장

            System.out.println("성공적으로 회원가입을 완료했습니다.");

            break;
        }
    }// 회원가입 위치	
////////	
	
	
	
//	public void 로그인(Scanner input) { 나의 자그마한 요청
//		
//		
//		
//		
//		//아이디 입력 		
//		//비밀번호 입력
//		//반복후에 값이 남아야하니까 return?
//		
//		System.out.println("아이디를 입력하세요");
//		String 로그인id = input.next();
//		
//		boolean 로그인id = 회원목록.containsKey(id); //입력한 id가 목록에 있니?
//		
//		있으면 비밀번호 입력
//		없으면 아이디가 없다으니 다시 입력 
//		구간 반복
//		
//		// 가입된 객체인지 검사할건데
//		// key값으로 불러와서 그 객체 전체를 검사
//		// 아이디가 있으면 그 객체를 가져와서 입력하는 비밀번호랑 객체에 저장된 비밀번호랑 비교
//	
//		System.out.println("비밀번호를 입력하세요");
//		String 로그인pw = input.next();
//		
//		// 일치하면 넘어가고
//		// 일치하지 않으면 다시 비밀번호 입력
//		// 입력시도가 5번까지, 6회부터는 시도가 많다고 알려주면서 꺼짐
//		// 현재 시도횟수가 몇번째인지는 출력해줌
//		
//		// 로그인이 완료되면 아래 회원 메뉴 출력
//		원하는 메뉴의 번호를 출력하라고 띄어주고 입력받음
//		1,2,3 이외의 번호를 입력받으면 오류라고 말해주고 
//		잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복
//		
//        1. 비밀번호 바꾸기   
//        2. 이름 바꾸기              
//        3. 로그아웃 
//		
//   // 
//	
//	}// 로그인 위치	
	
	public void 로그인(Scanner input) { // Main에서 만든 Scanner를 받아와서 로그인 입력에 사용한다.

		String 로그인id = ""; // while문 밖에서도 로그인id를 사용해야 하므로 미리 선언한다.

		Member 로그인회원 = null; // 아이디가 맞으면 회원목록에서 꺼낸 Member 객체를 저장할 변수다.

		// 1. 아이디 검사 구간
		while (true) { // 존재하는 아이디를 입력할 때까지 반복한다.
			
			System.out.print("아이디를 입력하세요 : "); // 사용자에게 아이디 입력을 요청한다.
			로그인id = input.next(); // 키보드로 입력한 아이디를 로그인id 변수에 저장한다.
			
			if (회원목록.containsKey(로그인id)) { // 회원목록 HashMap에 입력한 아이디가 key로 존재하는지 검사한다.
				
				로그인회원 = 회원목록.get(로그인id); // 아이디가 존재하면 key로 Member 객체 전체를 꺼낸다.
				break; // 존재하는 아이디를 찾았으므로 아이디 입력 반복문을 종료한다.
				
			} else { // 입력한 아이디가 회원목록에 없을 때 실행한다.
				System.out.println("존재하지 않는 아이디입니다. 다시 입력해주세요."); // 아이디가 없다고 알려준다.
				
			} // if-else 끝
		} // 아이디 검사 while 끝
		
		
		// 2. 비밀번호 검사 구간		
		int 비밀번호시도횟수 = 0; // 비밀번호를 몇 번 틀렸는지 저장하는 변수다.
		
		while (true) { // 비밀번호가 맞거나 시도 횟수가 초과될 때까지 반복한다.
			
			System.out.print("비밀번호를 입력하세요 : "); // 사용자에게 비밀번호 입력을 요청한다.
			
			String 로그인pw = input.next(); // 키보드로 입력한 비밀번호를 로그인pw 변수에 저장한다.
			비밀번호시도횟수++; // 비밀번호 입력 시도를 1회 증가시킨다.
			
			if (로그인회원.password.equals(로그인pw)) { // 저장된 비밀번호(로그인회원은 id에서 불러왔음)와 입력한 비밀번호가 같은지 비교한다.
				// 로그인id의 객체가 가진 pw와 입력한 로그인pw가 같은지를 비교하겠다 
				
				System.out.println("로그인 성공"); // 비밀번호가 일치하면 로그인 성공 메시지를 출력한다.
				break; // 비밀번호가 맞았으므로 비밀번호 입력 반복문을 종료한다.
				
			} else { // 비밀번호가 일치하지 않을 때 실행한다.
				System.out.println("비밀번호가 틀렸습니다."); // 비밀번호 오류 메시지를 출력한다.
				System.out.println("현재 시도 횟수 : " + 비밀번호시도횟수 + " / 5"); // 현재 몇 번째 시도인지 출력한다.
				
				if (비밀번호시도횟수 >= 5) { // 비밀번호를 5번 이상 틀렸는지 검사한다.
					
					System.out.println("비밀번호 입력 시도가 너무 많습니다. 로그인을 종료합니다."); // 시도 초과 메시지를 출력한다.
					return; // 로그인 메서드 자체를 종료하고 Main 메뉴로 돌아간다.
					
				} // 시도 횟수 검사 if 끝
				
			} // 비밀번호 검사 if-else 끝
		} // 비밀번호 검사 while 끝
		
		
		// 3. 로그인 성공 후 회원 메뉴 구간
		while (true) { // 로그인 성공 후 회원 메뉴를 계속 보여주기 위한 반복문이다.
			
			System.out.println("====== 회원 메뉴 ======"); // 회원 메뉴 제목을 출력한다.
			System.out.println("1. 비밀번호 바꾸기"); // 1번 메뉴를 출력한다.
			System.out.println("2. 이름 바꾸기"); // 2번 메뉴를 출력한다.
			System.out.println("3. 로그아웃"); // 3번 메뉴를 출력한다.
			System.out.print("원하는 메뉴 번호를 입력하세요 : "); // 사용자에게 메뉴 번호 입력을 요청한다.
			
			int 회원메뉴 = input.nextInt(); // 사용자가 입력한 메뉴 번호를 정수로 저장한다.
			
			if (회원메뉴 == 1) { // 사용자가 1번을 선택했는지 검사한다.
				System.out.print("새 비밀번호를 입력하세요 : "); // 새 비밀번호 입력을 요청한다.
				String 새비밀번호 = input.next(); // 입력받은 새 비밀번호를 변수에 저장한다.
				로그인회원.password = 새비밀번호; // 현재 로그인한 회원 객체의 password 필드를 새 값으로 변경한다.
				System.out.println("비밀번호가 변경되었습니다."); // 비밀번호 변경 완료 메시지를 출력한다.
				
			} else if (회원메뉴 == 2) { // 사용자가 2번을 선택했는지 검사한다.
				System.out.print("새 이름을 입력하세요 : "); // 새 이름 입력을 요청한다.
				String 새이름 = input.next(); // 입력받은 새 이름을 변수에 저장한다.
				로그인회원.name = 새이름; // 현재 로그인한 회원 객체의 name 필드를 새 값으로 변경한다.
				System.out.println("이름이 변경되었습니다."); // 이름 변경 완료 메시지를 출력한다.
				
			} else if (회원메뉴 == 3) { // 사용자가 3번을 선택했는지 검사한다.
				System.out.println("로그아웃합니다."); // 로그아웃 메시지를 출력한다.
				break; // 회원 메뉴 반복문을 종료하고 로그인 메서드를 끝낸다.
				
			} else { // 1, 2, 3 이외의 번호를 입력했을 때 실행한다.
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); // 잘못된 메뉴 번호라고 알려준다.
				
			} // 회원 메뉴 if-else 끝
			System.out.println(); // 다음 메뉴 출력 전 한 줄을 비워 화면을 보기 좋게 만든다.
		} // 회원 메뉴 while 끝
		
	} // 로그인 메서드 끝 
	
	
	
}// 목록 위치	

//// 강사님 ver 코드 파이프라인
//HashMap<String, Member> 회원목록 = new HashMap<>(); 목록 만들고
//Scaner 키보드 = new 입력받아야하니까 키보드 생성할게
//
//string id = "";
//
//while(true) {
//	syso ("아이디 입력")
//	id = 키보드.nextline();
//	
//	먼저 아이디가 있는지 검사할래
//	어차피 중복이면 돌아가야하니까 아이디 먼저 검사
//	
//	if(회원목록.containsKey(id))) {
//		아이디가 중복이야?
//		중복이면 돌아가서 다시 입력해
//	}else {
//		아니야 중복 아니야? 그럼 사용가능하다고 출력하고 반복문 멈추자.
//	}
//	}
//	이제 중복 검사 끝
//	
//	syso 비밀번호 입력
//	string password = 키보드입력값
//	
//	syso 이름 입력
//	string name = 키보드입력값
//	
//	비밀번호랑 이름 입력받은 값 저장했다
//	
//	member 새로운멤버 = new member() 멤버 생성 했다
//	
//	새로운멤버.id =
//	새로운멤버.password =
//	새로운멤버.name =
//	
//	입력받은 정보를 객체에 저장 했다
//	
//	그러고 난뒤에 목록에 추가할게
//	회원목록.put(id, 새로운멤버) 근데 찾을 key값은 id로 부여할게	
//}






// 		회원가입 했을때 처음 입력하더라도 중복이뜸 / 내가 작성한 꼬인 코드

//		// 1. 아이디랑 비밀번호 이름 3개만 키보드로 입력 받기, 
//		
//		System.out.print("아이디 입력 : ");
//        String 입력id = input.next();
//
//        System.out.print("비밀번호 입력 : ");
//        String 입력pw = input.next();
//
//        System.out.print("이름 입력 : ");
//        String 입력name = input.next();
//		        
//		// 2. Member class에 저장하기	
//        
//        Member A = new Member(); // 입력받은 정보 저장해
//        A.id = 입력id;
//        A.password = 입력pw;
//        A.name = 입력name;
//        
//        while(true) {
//			// 단! 조건 입력한 아이디가 회원목록변수 안에 key가 있다면
//			// 중복이 안되면 "성공적으로 회원가입을 완료했습니다."
//			// 중복이라면 ?
//			// "다시 입력하세요 입력을 다시받아야된다." 
//				// 다시 중복확인
//        	if (회원목록.containsKey(입력id)) {
//        	    System.out.println("중복입니다.");
//        	    break;
//        	} else {
//        	    회원목록.put(입력id, A); // A를 id를 key로 회원목록에 저장
//        	}
//
//        }	
//	}
//}
