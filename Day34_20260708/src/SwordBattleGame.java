import java.util.ArrayList;
import java.util.Scanner;

public class SwordBattleGame {
    public static void main(String[] args) {

        Scanner 키보드 = new Scanner(System.in);
        ArrayList<String> 가방 = new ArrayList<>();
        가방.add("검");

        while (true) {
            System.out.println("====== 용사의 모험 ======");
            System.out.println();
            System.out.println("내 가방: " + 가방);
            System.out.println("1. 몬스터와 싸우기");
            System.out.println("2. 가방 보기");
            System.out.println("3. 종료");
            System.out.print("진행할 행동의 번호를 입력하세요!");
            int 진행번호 = 키보드.nextInt();

            if (진행번호 == 1) {
                System.out.println("처치할 몬스터 목록");
                System.out.println(" 1. 슬라임 ");
                System.out.println(" 2. 고블린 ");
                System.out.println(" 3. 드래곤 ");
                System.out.print("물리칠 몬스터 번호를 선택: ");

                int 몬스터번호 = 키보드.nextInt();
                String 몬스터이름 = "";
                int 고유번호 = 0;
                String 처치보상 = "";

                if (몬스터번호 == 1) {
                    몬스터이름 = "슬라임";
                    고유번호 = 1;
                    처치보상 = "창";
                } else if (몬스터번호 == 2) {
                    몬스터이름 = "고블린";
                    고유번호 = 2;
                    처치보상 = "총";
                } else if (몬스터번호 == 3) {
                    몬스터이름 = "드래곤";
                    고유번호 = 3;
                    처치보상 = "왕관";
                }

                if (몬스터번호 == 1) {
                    if (가방.contains("검")) {
                        System.out.println("검으로 슬라임을 물리쳤습니다.");
                        가방.add(처치보상);
                        System.out.println("획득보상 :" + 처치보상);
                    } else {
                        System.out.println("검이 없어 슬라임을 처지하지 못했습니다. 검을 구매하세요");
                        break;
                    }
                } else if (몬스터번호 == 2) {
                    if (가방.contains("창")) {
                        System.out.println("창으로 고블린을 물리쳤습니다.");
                        가방.add(처치보상);
                        System.out.println("획득보상 :" + 처치보상);
                    } else {
                        System.out.println("창이 없어 고블린을 처지하지 못했습니다. 슬라임을 무찌르고 창을 획득하세요");
                        break;
                    }
                } else if (몬스터번호 == 3) {
                    if (가방.contains("총")) {
                        System.out.println("총으로 드래곤을 물리쳤습니다.");
                        가방.add(처치보상);
                        System.out.println("획득보상 :" + 처치보상);
                        System.out.println("모험 종료");
                        break;
                    } else {
                        System.out.println("총이 없어 드래곤을 처지하지 못했습니다. 고블린을 무찌르고 총을 획득하세요");
                        break;
                    }
                }
            }
        }
    }
}