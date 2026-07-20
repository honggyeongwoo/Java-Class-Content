import java.util.Scanner; // 입력 처리를 위한 Scanner 클래스 임포트
import java.util.ArrayList; // 동적 배열 관리를 위한 ArrayList 클래스 임포트

public class FunctionTest3_2 { // 클래스 선언: 프로그램의 기본 단위
    // [데이터 저장] 목적지, 열차, 좌석 정보를 담을 클래스 정의
    static class Info { // 정적 중첩 클래스: 외부 클래스 없이 Info만 생성 가능
        String name; // 상품 이름을 저장할 문자열 변수
        int id; // 선택을 위한 고유 번호 변수
        int price; // 가격 정보를 저장할 정수 변수
        Info(String name, int id, int price) { // 생성자: 객체 초기화 로직
            this.name = name; // 전달받은 name을 멤버 변수에 할당
            this.id = id; // 전달받은 id를 멤버 변수에 할당
            this.price = price; // 전달받은 price를 멤버 변수에 할당
        }
    }

    // [공용 자원] static: 모든 함수가 공유하는 클래스 레벨 변수
    static Scanner 키보드 = new Scanner(System.in); // 키보드 입력을 위한 스캐너 객체 생성
    
    // [상태 저장] 장바구니 리스트: 선택된 상품들을 순서대로 저장
    static ArrayList<Info> 장바구니 = new ArrayList<>(); // 가변 길이 리스트 선언

    // [데이터 배열] 각 카테고리별 데이터 미리 저장
    static Info[] 목적지목록 = { new Info("대구", 1, 10000), new Info("강릉", 2, 20000), new Info("대전", 3, 25000), new Info("서울", 4, 50000) };
    static Info[] 열차목록 = { new Info("KTX", 1, 50000), new Info("무궁화", 2, 30000), new Info("아리랑", 3, 10000) };
    static Info[] 좌석목록 = { new Info("좌석", 1, 15000), new Info("입석", 2, 5000) };

    // [함수] 각 단계별 메뉴 출력 및 선택 처리
    public static int 선택함수(String 제목, Info[] 목록) { // 매개변수로 메뉴 제목과 목록을 전달받음
        while (true) { // 사용자가 올바른 값을 선택할 때까지 무한 반복하는 루프
            System.out.println("--- " + 제목 + " ---"); // 메뉴 타이틀 출력
            for (Info item : 목록) { // 향상된 for문: 목록 배열의 모든 요소를 순회
                System.out.println(item.id + ". " + item.name + " (" + item.price + "원)"); // 메뉴 항목 출력
            }
            System.out.println("0. 이전"); // 이전 단계 이동을 위한 번호 출력
            System.out.print("번호 입력: "); // 입력 안내
            int 입력 = 키보드.nextInt(); // 사용자로부터 번호 입력받음
            
            // 0 입력 시 이전 단계로 돌아가라는 신호(0)를 반환
            if (입력 == 0) return 0; // 메서드 즉시 종료 및 0 반환
            
            // 일치하는 ID 탐색 및 장바구니 추가
            for (Info item : 목록) { // 입력받은 값과 목록의 ID를 비교
                if (item.id == 입력) { // 번호가 일치하면
                    장바구니.add(item); // 리스트에 선택된 객체 저장
                    return item.id; // 선택된 번호 반환
                }
            }
            // 올바르지 않은 번호 입력 시 처리
            System.out.println("올바른 번호를 입력해주세요."); // 검증 로직
        }
    }

    // [함수] '이전' 선택 시 장바구니 마지막 항목 제거
    public static void 취소함수() {
        if (!장바구니.isEmpty()) { // 리스트가 비어있지 않은 경우에만 삭제
            장바구니.remove(장바구니.size() - 1); // 마지막 인덱스의 요소 삭제
        }
    }

    // [함수] 예약 시스템의 흐름 관리 (State Machine)
    public static void runReservationSystem() {
        int 단계 = 1; // 1:목적지, 2:열차, 3:좌석 단계 관리
        while (단계 != 0) { // 단계가 0이 되면 루프 종료
            if (단계 == 1) { // 1단계 로직
                int 결과 = 선택함수("목적지 선택", 목적지목록);
                단계 = (결과 == 0) ? 0 : 2; // 0이면 종료, 아니면 2단계로 이동
            } else if (단계 == 2) { // 2단계 로직
                int 결과 = 선택함수("열차 선택", 열차목록);
                if (결과 == 0) {
                    취소함수(); // 이전 단계로 갈 때 데이터 삭제
                    단계 = 1; // 1단계로 회귀
                } else {
                    단계 = 3; // 3단계로 이동
                }
            } else if (단계 == 3) { // 3단계 로직
                int 결과 = 선택함수("좌석 선택", 좌석목록);
                if (결과 == 0) {
                    취소함수(); // 이전 단계로 갈 때 데이터 삭제
                    단계 = 2; // 2단계로 회귀
                } else {
                    printFinalReceipt(); // 모든 선택 완료 시 출력 함수 호출
                    break; // 예약 프로세스 루프 탈출
                }
            }
        }
    }

    // [함수] 최종 영수증 출력
    public static void printFinalReceipt() {
        int 합계 = 0; // 합계 초기화
        System.out.println("--- 최종 결과 ---");
        System.out.print("선택: ");
        for (Info item : 장바구니) { // 장바구니 리스트를 순회
            System.out.print(item.name + " "); // 선택 항목 이름 출력
            합계 += item.price; // 가격 합산
        }
        System.out.println("\n합계: " + 합계 + "원"); // 최종 합계 출력
        System.out.println("이용해주셔서 감사합니다.");
    }

    // [메인 함수] 프로그램 시작점
    public static void main(String[] args) {
        System.out.println("기차 예매 사이트 시작");
        runReservationSystem(); // 흐름 관리 함수 호출
    }
}