package ArrayListTest;
/*
1. Scanner 생성 + ArrayList(영화찜목록) 생성
        ↓
2. 바깥 while(true) 시작 → 메인 메뉴 출력
   (1.영화추가  2.영화보기  3.종료)
        ↓
3. 메뉴선택 번호 입력받기 (nextInt)
        ↓
4. 메뉴선택 값에 따라 분기 (if ~ else if ~ else if)
        ↓
   ┌─────────────┬─────────────────┬─────────────┐
   │ 메뉴선택==1   │  메뉴선택==2      │ 메뉴선택==3   │
   ↓             ↓                 ↓
5-A. 영화추가      5-B. 찜목록 출력     5-C. 종료 메시지
   서브메뉴 진입      (println)          출력 + break
   (안쪽 while)                          ↓
   ↓                                바깥 while 탈출
6-A. 영화선택번호                      → 프로그램 완전 종료
   입력받기
   ↓
7-A. 영화선택번호에 따라 분기
   (1~4: add로 영화 추가
    0: break로 안쪽 while 탈출)
   ↓
8-A. 0이 아니면 → 6-A로 돌아가서 반복
     0이면 → 안쪽 while 탈출
   ↓
9-A. "메인메뉴로 돌아갑니다" 출력
   ↓
10. 바깥 while 맨 위로 돌아가서 다시 2번부터 반복
    (메뉴선택==3이 나올 때까지 무한 반복) 
 * 
 */



import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest2 {

	public static void main(String[] args) {		
		
		Scanner 키보드 = new Scanner(System.in);

		// 영화목록들을 찜하는 ArrayList 를 만든다.
		ArrayList<String> 영화찜목록 = new ArrayList<>();

		while (true) {
			System.out.println("====== 넷플릭스 ======");
			System.out.println("1. 영화 추가");
			System.out.println("2. 영화 보기");
			System.out.println("3. 종료");

			System.out.print("번호 입력 : ");
			int 메뉴선택 = 키보드.nextInt();

			if (메뉴선택 == 1) {
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
					int 영화선택번호 = 키보드.nextInt();

					if (영화선택번호 == 1) {
						영화찜목록.add("브로큰");
					} else if (영화선택번호 == 2) {
						영화찜목록.add("하얼빈");
					} else if (영화선택번호 == 3) {
						영화찜목록.add("승부");
					} else if (영화선택번호 == 4) {
						영화찜목록.add("한산");
					} else if (영화선택번호 == 0) {
						System.out.println("1메뉴 종료!메인메뉴로 돌아갑니다.");
						break;
					}
				}
				// 1번을 선택했을 때 무한반복의 끝!
			} else if (메뉴선택 == 2) {
				System.out.println("찜목록 보기");
				System.out.println(영화찜목록);

			}

			else if (메뉴선택 == 3) {
				System.out.println("넷플릭스 종료합니다.");
				break;
			}
		}



		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner 키보드 = new Scanner(System.in);
//
//		//영화목록들을 찜하는 ArrayList 를 만든다.
//		ArrayList<String> 영화찜목록 = new ArrayList<>();
//
//		// 넷플릭스 찜목록
//		//  넷플릭스를 한 번 켜면 내가 X버튼이나
//		//  종료버튼을 누르지 않는 한 넷플릭스가 계속
//		//  실행되야 된다. 반복문
//		// while(true) 무조건 반복해라!
//		//  고객이 종료를 누르기 전까지는 무한반복해서
//		//  넷플릭스를 끄지 말아라!
//
//		while(true) {
//		System.out.println("====== 넷플릭스 ======");
//		System.out.println("1. 영화 추가");
//		System.out.println("2. 영화 보기");
//		System.out.println("3. 종료");
//		System.out.print("번호 입력 : ");
//		
//		int 메뉴선택 = 키보드.nextInt();
//		
//		if(메뉴선택 == 1) {
//			while(true) {
//				
//			
//		System.out.println("--- 영화 추가 ---");
//		System.out.println(" 1. 브로큰 ");
//		System.out.println(" 2. 하얼빈 ");
//		System.out.println(" 3. 승부 ");
//		System.out.println(" 4. 한산 ");
//		System.out.println("추가할 영화 번호를 선택:");
//		
//		int 영화선택번호 = 키보드.nextInt();
//		
//		if(영화선택번호 == 1) {
//		영화찜목록.add("브로큰");
//		}else if(영화선택번호 == 2) {
//		영화찜목록.add("하얼빈");
//		}else if(영화선택번호 == 3) {
//		영화찜목록.add("승부");
//		}else if(영화선택번호 == 4) {
//		영화찜목록.add("한산");
//		}
////		else {
////			System.out.println("찜한 목록이 없습니다.");}
//		
//		// 5나 다른 값 누르면 어떻게 할거야 ?
//		// 일치하는게 없으니까 그냥 지나갈게 -> if가 종료(무시)되고 다시 while로 복귀(반복)
//		
//		System.out.println(영화찜목록);
//		}else if(메뉴선택 == 3) {
//			System.out.println("넷플릭스 종료합니다.");
//			break;
//			}		
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
////		🎵 실습 문제: 멜론 플레이리스트 만들기
////		📖 상황 설명
////		당신은 멜론 플레이리스트 관리 프로그램을 만들고 있습니다.
////		 현재 플레이리스트에는 아래 3곡이 순서대로 들어있습니다.
////
////		1번째: APT.
////		2번째: Dynamite
////		3번째: Supernova
////		이 플레이리스트를 다음 요청사항대로 수정하는 프로그램을 작성하세요.
////
////
////		✅ 요청사항 (순서대로 처리)
////		노래 추가: 처음에 위 3곡을 순서대로 ArrayList에 담는다		
//		ArrayList<String> playlist = new ArrayList<>();
//		System.out.println("1. (ArrayList) 요청사항 노래추가");
//		playlist.add("ATP");
//		playlist.add("Dynamite");
//		playlist.add("Supernova");
//		System.out.println(playlist);
//		
////		두 번째 위치에 "Hype Boy" 삽입: 기존 2번째 자리("Dynamite" 앞)에 "Hype Boy"를 끼워 넣는다
//		System.out.println("2.(add) Hype Boy 추가");
//		playlist.add(1,"Hype Boy");
//		System.out.println(playlist);		
////		결과 예상: [APT., Hype Boy, Dynamite, Supernova]
//		
////		"Dynamite" 삭제: 곡 이름으로 찾아서 삭제한다
//		System.out.println("3. (remove) Dynamite 삭제");
//		playlist.remove(2);
//		System.out.println(playlist);
////		결과 예상: [APT., Hype Boy, Supernova]
//		
////		마지막에 "Attention" 추가: 리스트 맨 뒤에 새 곡을 추가한다
//		System.out.println("4. (add) Attention 추가");
//		playlist.add("Attention");
//		System.out.println(playlist);
////		결과 예상: [APT., Hype Boy, Supernova, Attention]
//		
////		각 단계가 끝날 때마다 현재 플레이리스트 전체를 출력해서 어떻게 바뀌는지 눈으로 확인하세요.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
