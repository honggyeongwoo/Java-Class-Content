// Day34_20260708_Java 교육

import java.util.ArrayList;
import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
				
//public class ArrayListTest

// 1. 배열 : 수정,삭제 아예 안됨 대응이 안되요, 100칸 만들어놨는데 10칸만 사용하고, 10칸 만들어 놨는데 100칸 필요하면 어캄?
// 2. ArrayList : 그럼 필요한 갯수에 따라서 늘었다가 줄어들게
// 2-1. add() : 공간에 추가할게!
// ArrayList<String> 이름리스트 = new ArrayList<>();
// 2-2. Size()
// 2-2 예시) int size = 이름리스트.size();

// 문법 : ArrayList<E> ? 뭔데 -> <>안에는 저장할 TYPE
// (**ArrayList 문법에 대한 추가 설명 필요-gemini)
// 틀을 만들어 놓는 개념? (추가 설명 필요-gemini)
				
		
		// 1. add()
		ArrayList<String> 이름리스트 = new ArrayList<>(); 
			// ArrayList 만드는 문법
			// 저장 형태 : String
			// 변수 명 : 이름리스트

		이름리스트.add("에리나"); 
			// 리스트에 값 추가
		System.out.println(이름리스트);
			// 이름리스트에 있는 값 출력
		System.out.println(이름리스트.size());
			// 이름리스트에 공간의 값(크기) 출력

		이름리스트.add("카리나");
		이름리스트.add("바나나");
		이름리스트.add("미리나");
		이름리스트.add("가려나");
			// add : 데이터 추가
		
		System.out.println(이름리스트);
		System.out.println(이름리스트.size());

		이름리스트.add(2, "알렉스"); 
			// 배열의 맨뒤에 추가말고, 기존 배열의 공간 사이에 넣고 싶으면?								
			// 끼워넣고싶은 공간의 번호를 부여한다. .add(배열번호, "데이터")
		
		System.out.println(이름리스트);
		System.out.println(이름리스트.size());

		// 2. size()
		int size = 이름리스트.size();

		// 4. 배열에서 하나의 값을 가져오기
		// get

		String 이름 = 이름리스트.get(2); // 가져오려는 값의 번호를 입력한다.
		System.out.println(이름);

		//String 이름2 = 이름리스트.get("카리나"); // 가져오려는 값 자체를 입력해도 되나?
											// get에 ""데이터 값 자체를 넣는건 안되네
		//System.out.println(이름2);

		// 5. 배열에서 값을 삭제하기
		// remove

		이름리스트.remove("미리나");
		System.out.println(이름리스트);

		이름리스트.remove(0);
		System.out.println(이름리스트);
		
		
		
//public class ArrayListTest2
		
// 1)		
//🎵 실습 문제: 멜론 플레이리스트 만들기
//📖 상황 설명
//당신은 멜론 플레이리스트 관리 프로그램을 만들고 있습니다.
// 현재 플레이리스트에는 아래 3곡이 순서대로 들어있습니다.
//
//1번째: APT.
//2번째: Dynamite
//3번째: Supernova
//이 플레이리스트를 다음 요청사항대로 수정하는 프로그램을 작성하세요.
//
//
//✅ 요청사항 (순서대로 처리)
//노래 추가: 처음에 위 3곡을 순서대로 ArrayList에 담는다		
		ArrayList<String> playlist = new ArrayList<>();
		System.out.println("1. (ArrayList) 요청사항 노래추가");
		playlist.add("ATP");
		playlist.add("Dynamite");
		playlist.add("Supernova");
		System.out.println(playlist);
		
//		두 번째 위치에 "Hype Boy" 삽입: 기존 2번째 자리("Dynamite" 앞)에 "Hype Boy"를 끼워 넣는다
		System.out.println("2.(add) Hype Boy 추가");
		playlist.add(1,"Hype Boy");
		System.out.println(playlist);		
//		결과 예상: [APT., Hype Boy, Dynamite, Supernova]
		
//		"Dynamite" 삭제: 곡 이름으로 찾아서 삭제한다
		System.out.println("3. (remove) Dynamite 삭제");
		playlist.remove(2);
		System.out.println(playlist);
//		결과 예상: [APT., Hype Boy, Supernova]
		
//		마지막에 "Attention" 추가: 리스트 맨 뒤에 새 곡을 추가한다
		System.out.println("4. (add) Attention 추가");
		playlist.add("Attention");
		System.out.println(playlist);
//		결과 예상: [APT., Hype Boy, Supernova, Attention]
		
//		각 단계가 끝날 때마다 현재 플레이리스트 전체를 출력해서 어떻게 바뀌는지 눈으로 확인하세요.
		
// 2)
		
//영화목록들을 찜하는 ArrayList 를 만든다.
// 넷플릭스 찜목록
//  넷플릭스를 한 번 켜면 내가 X버튼이나
//  종료버튼을 누르지 않는 한 넷플릭스가 계속
//  실행되야 된다. 반복문
// while(true) 무조건 반복해라!
//  고객이 종료를 누르기 전까지는 무한반복해서
//  넷플릭스를 끄지 말아라!	
		
		Scanner 키보드 = new Scanner(System.in);	
		
		ArrayList<String> 영화찜목록 = new ArrayList<>(); // 영화 찜 목록 데이터 저장 할 유동적 배열 만들어

		while(true) { // 행동을 완료해서 내가 창을 닫기전까지는 계속 꺼지지않고 반복,유지 할거야
			
			System.out.println("====== 넷플릭스2 ======"); // ㅣ실행됬을때의 초기 화면이다
			System.out.println("1. 영화 추가");			// ㅣ
			System.out.println("2. 영화 보기");			// ㅣ
			System.out.println("3. 종료");				// ㅣ
			System.out.print("번호 입력 : ");				// ㅣ
			
			int 메뉴선택 = 키보드.nextInt();	// 숫자 입력하는 키보드를 사용해서, 엔터로 입력한 데이터를 "메뉴션택"에 저장한다
			
			if(메뉴선택 == 1) { // 키보드에 입력한 "메뉴선택"의 값이 1 이라면 (if)
				System.out.println("--- 영화 추가 ---"); // 메뉴선택 값 1이 입력됬을때 출력되는 다음 화면
				System.out.println(" 1. 브로큰 ");
				System.out.println(" 2. 하얼빈 ");
				System.out.println(" 3. 승부 ");
				System.out.println(" 4. 한산 ");
				System.out.println("추가할 영화 번호를 선택:");
				
				int 영화선택번호 = 키보드.nextInt(); // 찜 목록에 추가할 영화의 번호 데이터 입력
				
					if(영화선택번호 == 1) { // 입력한 데이터값이 1일때
					영화찜목록.add("브로큰"); // "영화찜목록" 배열리스트에, "브로큰" 데이터 저장 (후에는 리스트 데이터를 객체처럼 위에 먼저 저장후 불러와서 연산 줄이기)
					}else if(영화선택번호 == 2) {
					영화찜목록.add("하얼빈");
					}else if(영화선택번호 == 3) {
					영화찜목록.add("승부");
					}else if(영화선택번호 == 4) {
					영화찜목록.add("한산");
					}
					
					// 만약 else를 쓰지않고 그냥 이대로 마친다면
					// 5나 다른 값 누르면 어떻게 할거야 ?
					// 일치하는게 없으니까 그냥 지나갈게 -> if가 종료(무시)되고 다시 while로 복귀(반복)
					
					else {
					System.out.println("선택된 영화가 없습니다. 올바른 번호를 입력해주세요");
					}
					
				System.out.println(영화찜목록);
				
			}else if(메뉴선택 == 2) {
				System.out.println("현재 찜한 영화 목록 입니다. : " + 영화찜목록);
			}else if(메뉴선택 == 3) {
				System.out.println("넷플릭스 종료합니다.");
				break; //break;가 없다면? 다시 초기화면 나옴 -> 항상 true값을 가진 while 문이기때문에 장치가 없으면 무한 태초마을. 할 일 다 마쳤으니 x버튼을 눌러서 종료하는 것 
				}		
		}
		
// 3) 

// 영화 선택시에 태초마을로 돌아가지않고 영화선택화면 반복(부분 while)
		
		
		Scanner 키보드3 = new Scanner(System.in);

		// 영화목록들을 찜하는 ArrayList 를 만든다.
		ArrayList<String> 영화찜목록3 = new ArrayList<>();

		while (true) {
			System.out.println("====== 넷플릭스3 ======");
			System.out.println("1. 영화 추가");
			System.out.println("2. 영화 보기");
			System.out.println("3. 종료");

			System.out.print("번호 입력 : ");
			int 메뉴선택3 = 키보드3.nextInt();

			if (메뉴선택3 == 1) {
				System.out.println("--- 영화 추가 ---");

				// 응용 !
				// 내가 원하는데로 선택한 다음에 더이상 선택할께 없으면
				// 뒤로가기 기능!

				while (true) {
					System.out.println(" 1. 브로큰 ");
					System.out.println(" 2. 하얼빈 ");
					System.out.println(" 3. 승부 ");
					System.out.println(" 4. 한산 ");
					System.out.println(" 0번을 누르면 종료!");
					System.out.println("추가할 영화 번호를 선택:");
					int 영화선택번호3 = 키보드3.nextInt();

					if (영화선택번호3 == 1) {
						영화찜목록.add("브로큰");
					} else if (영화선택번호3 == 2) {
						영화찜목록.add("하얼빈");
					} else if (영화선택번호3 == 3) {
						영화찜목록3.add("승부");
					} else if (영화선택번호3 == 4) {
						영화찜목록3.add("한산");
					} else if (영화선택번호3 == 0) {
						System.out.println("1메뉴 종료!메인메뉴로 돌아갑니다.");
						break;
					}
				}
				// 1번을 선택했을 때 무한반복의 끝!
			} else if (메뉴선택3 == 2) {
				System.out.println("찜목록 보기");
				System.out.println(영화찜목록3);

			}

			else if (메뉴선택3 == 3) {
				System.out.println("넷플릭스 종료합니다.");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
