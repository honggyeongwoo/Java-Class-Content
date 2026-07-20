//package lab;
//// ClassTest_Lab1.java
//
//import java.util.Random;   // 랜덤 숫자를 만들기 위한 도구
//import java.util.Scanner;  // 키보드 입력을 받기 위한 도구
//
//// 플레이어 한 명의 정보를 저장하는 class
//class 플레이어 {
//    String 이름;      // 플레이어가 입력한 이름
//    int 시작점수;     // 게임 시작 전 점수
//    int 종료점수;     // 게임 종료 후 최종 점수
//}
//
//public class ClassTest_Lab1 {
//
//    // 여러 메서드에서 같이 쓰기 위해 static으로 만든 공용 도구
//    static Random 랜덤도구 = new Random();
//    static Scanner 키보드 = new Scanner(System.in);
//
//    // 최대 100명의 플레이어 기록을 저장할 배열
//    static 플레이어[] 랭킹목록 = new 플레이어[100];
//
//    // 현재 랭킹목록에 몇 명이 저장되었는지 세는 변수
//    static int 저장된플레이어수 = 0;
//
//    // 플레이어 객체를 만들어주는 메서드
//    public static 플레이어 플레이어만들기(String 이름) {
//        플레이어 새플레이어 = new 플레이어();
//
//        새플레이어.이름 = 이름;
//        새플레이어.시작점수 = 0;
//        새플레이어.종료점수 = 0;
//
//        return 새플레이어;
//    }
//
//    // 곱셈 게임을 10회 진행하는 메서드
//    public static void 게임하기(플레이어 대상) {
//        int 카운트 = 1;
//        int 끝나는값 = 10;
//
//        대상.시작점수 = 대상.종료점수;
//
//        while (카운트 <= 끝나는값) {
//            int 숫자1 = 랜덤도구.nextInt(50) + 1;
//            int 숫자2 = 랜덤도구.nextInt(50) + 1;
//
//            int 정답 = 숫자1 * 숫자2;
//
//            System.out.println();
//            System.out.println("[" + 카운트 + "번째 문제]");
//            System.out.print(숫자1 + " x " + 숫자2 + " = ");
//
//            int 플레이어정답 = 키보드.nextInt();
//
//            if (정답 == 플레이어정답) {
//                System.out.println("정답! +10점");
//                대상.종료점수 += 10;
//            } else {
//                System.out.println("오답! -10점");
//                System.out.println("정답은 " + 정답 + " 입니다.");
//                대상.종료점수 -= 10;
//            }
//
//            카운트 += 1;
//        }
//
//        System.out.println();
//        System.out.println("===== 게임 종료 =====");
//        System.out.println("플레이어: " + 대상.이름);
//        System.out.println("시작 점수: " + 대상.시작점수);
//        System.out.println("종료 점수: " + 대상.종료점수);
//    }
//
//    // 게임이 끝난 플레이어를 랭킹 배열에 저장하는 메서드
//    public static void 랭킹저장(플레이어 대상) {
//        랭킹목록[저장된플레이어수] = 대상;
//        저장된플레이어수 += 1;
//    }
//
//    // 점수가 높은 순서대로 랭킹을 정렬하는 메서드
//    public static void 랭킹정렬() {
//        for (int i = 0; i < 저장된플레이어수 - 1; i++) {
//            for (int j = i + 1; j < 저장된플레이어수; j++) {
//                if (랭킹목록[i].종료점수 < 랭킹목록[j].종료점수) {
//                    플레이어 임시 = 랭킹목록[i];
//                    랭킹목록[i] = 랭킹목록[j];
//                    랭킹목록[j] = 임시;
//                }
//            }
//        }
//    }
//
//    // 10등까지 랭킹을 출력하는 메서드
//    public static void 랭킹출력() {
//        랭킹정렬();
//
//        System.out.println();
//        System.out.println("===== 플레이어 랭킹 TOP 10 =====");
//
//        if (저장된플레이어수 == 0) {
//            System.out.println("아직 랭킹이 없습니다.");
//            return;
//        }
//
//        int 출력개수 = 저장된플레이어수;
//
//        if (출력개수 > 10) {
//            출력개수 = 10;
//        }
//
//        for (int i = 0; i < 출력개수; i++) {
//            System.out.println(
//                (i + 1) + "등: " +
//                랭킹목록[i].이름 +
//                " / 점수: " +
//                랭킹목록[i].종료점수
//            );
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println("===== 랜덤 곱셈 맞추기 게임 =====");
//
//        System.out.print("플레이어 이름을 입력하세요: ");
//        String 입력이름 = 키보드.next();
//
//        플레이어 현재플레이어 = 플레이어만들기(입력이름);
//
//        boolean 실행중 = true;
//
//        while (실행중) {
//            게임하기(현재플레이어);
//            랭킹저장(현재플레이어);
//            랭킹출력();
//
//            System.out.println();
//            System.out.println("1. 다시하기");
//            System.out.println("2. 종료하기");
//            System.out.print("선택: ");
//
//            int 선택 = 키보드.nextInt();
//
//            if (선택 == 1) {
//                System.out.println();
//                System.out.println("1. 이름 그대로 사용");
//                System.out.println("2. 새 이름으로 시작");
//                System.out.print("선택: ");
//
//                int 이름선택 = 키보드.nextInt();
//
//                if (이름선택 == 1) {
//                    현재플레이어 = 플레이어만들기(현재플레이어.이름);
//                } else if (이름선택 == 2) {
//                    System.out.print("새 플레이어 이름을 입력하세요: ");
//                    String 새이름 = 키보드.next();
//                    현재플레이어 = 플레이어만들기(새이름);
//                } else {
//                    System.out.println("잘못 입력했습니다. 기존 이름으로 다시 시작합니다.");
//                    현재플레이어 = 플레이어만들기(현재플레이어.이름);
//                }
//
//            } else if (선택 == 2) {
//                System.out.println("다음에 또 만나요");
//                실행중 = false;
//
//            } else {
//                System.out.println("잘못 입력했습니다. 게임을 종료합니다.");
//                System.out.println("다음에 또 만나요");
//                실행중 = false;
//            }
//        }
//    }
//}