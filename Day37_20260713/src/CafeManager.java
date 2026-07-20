//import java.util.ArrayList;
//import java.util.Scanner;
//
//// * 카페 포인트 적립 — 상황
//// * 고객 정보
//// *  이름,전화번호,포인트 
//// * 전화번호 하나로 여러 정보를 관리하는 상황 
//// * (등록 → 적립 → 조회) 등록 시점엔 이름,
//// * 전화번호만 알고, 포인트는 아직 없음 (이제 막 가입했으니까)
//// * 기본값 필드기본값왜 이 값인지이름(직접 입력)등록 
//// * 시점에 이미 앎   전화번호(직접 입력)등록 시점에 이미 앎
//// * 포인트 0  방금 가입했으니 적립된 게 없음
//
//class 고객정보{
//	String 이름;
//	String 전화번호;
//	int 포인트;
//	public 고객정보(String 이름, String 전화번호) {
//		this.이름 = 이름;
//		this.전화번호 = 전화번호;
//	}		
//}
//
//public class CafeManager {
//
//public static void main(String[] args) {
//
//ArrayList<고객정보> 고객목록 = new ArrayList<>();
//
//Scanner 키보드 = new Scanner(System.in);
//
// 
//while(true) {
//	
//	System.out.println("\n===== 메뉴 =====");
//    System.out.println("1. 고객 등록");
//    System.out.println("2. 포인트 적립");
//    System.out.println("3. 포인트 조회");
//    System.out.println("0. 종료");
//    System.out.print("선택: ");
//	
//    int 선택 = 키보드.nextInt();
//    키보드.nextLine();
//    
//    if(선택 == 1) {
//    	System.out.print("이름: ");
//    	String 이름 = 키보드.nextLine();
//    	System.out.print("전화번호: ");
//    	String 전화번호 = 키보드.nextLine();
//    	
//    	고객정보 새로운고객 = new 고객정보(이름, 전화번호);
//    	고객목록.add(새로운고객);
//    	
//    	System.out.println(이름 + "님 회원가입을 환영합니다" );    	
//    }else if(선택 == 2) {
//    	
//    	System.out.print("가입한 전화번호: ");
//    	String 전화번호 = 키보드.nextLine();
//    	
//    	int 번호 = 0;
//    	while(번호 < 고객목록.size()) {
//    		
//    		고객정보 고객 = 고객목록.get(번호);    		
//
//        	
////        	if(고객.전화번호.equals(입력전화번호)) {
////        		System.out.println(고객.이름+ "님 안녕하세요 적립 되었습니다.");
////        		고객.포인트++;
//        	}
//    		
//    	}
//    	
//
//    }
//    
//    
//}
//
//            
///*
// * 
//            실행 순서!(파이브라인)
//1) 프로그램 시작 → ArrayList<고객> 고객목록 준비
//   ↓
//2) while(true)로 메뉴 반복 출력
//   ↓
//3) 사용자가 번호 입력 (nextInt) → 개행 제거 (nextLine)
//   ↓
//4) 선택값에 따라 분기
//   ├─ 1: 고객등록 → 이름/전화번호 입력 → new 고객(이름, 전화번호) 생성
//   │              (포인트는 매개변수로 안 받고 생성자 안에서 0으로 자동 설정)
//   │              → 고객목록.add()
//   │
//   ├─ 2: 포인트적립 → 전화번호/적립포인트 입력
//   │              → 고객목록 반복 순회 (while + get(번호))
//   │              → 전화번호 일치하는 고객 찾기
//   │              → 찾으면 대상.포인트 += 적립포인트 → break
//   │              → 못 찾으면 "등록된 고객이 아닙니다"
//   │
//   ├─ 3: 포인트조회 → 전화번호 입력
//   │              → 고객목록 반복 순회
//   │              → 전화번호 일치하는 고객의 이름+포인트 출력
//   │
//   └─ 0: 종료 → break → 프로그램 종료
//   ↓
//5) 종료 아니면 2번으로 돌아가서 메뉴 다시 출력 (반복)
// */
//}
//
//}