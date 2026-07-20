import java.util.ArrayList;
import java.util.Scanner;

public class ItemShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> bag = new ArrayList<>();
        int money = 100;

        // 아이템 정보 (이름, 가격)
        String[] itemNames = {"포션", "검", "방패", "갑옷"};
        int[] itemPrices = {10, 50, 70, 100};

        while (true) {
            System.out.println("\n[현재 소지금: " + money + "]");
            System.out.println("1.구매  2.가방  3.종료");
            System.out.print("메뉴 선택: ");
            int menu = sc.nextInt();

            if (menu == 1) { // 4-A. 구매 서브메뉴
                while (true) {
                    System.out.println("\n--- 구매 목록 ---");
                    for (int i = 0; i < itemNames.length; i++) {
                        System.out.println((i + 1) + "." + itemNames[i] + "(" + itemPrices[i] + ")");
                    }
                    System.out.println("0.메인으로");
                    System.out.print("아이템 선택: ");
                    int choice = sc.nextInt();

                    if (choice == 0) { // 6-A. 탈출
                        break;
                    } else if (choice >= 1 && choice <= 4) {
                        int idx = choice - 1;
                        if (money >= itemPrices[idx]) { // 6-A. 구매 로직
                            money -= itemPrices[idx];
                            bag.add(itemNames[idx]);
                            System.out.println(itemNames[idx] + "을(를) 구매했습니다.");
                        } else {
                            System.out.println("돈이 부족합니다!");
                        }
                    }
                }
            } else if (menu == 2) { // 4-B. 가방 출력
                System.out.println("\n--- 내 가방 ---");
                if (bag.isEmpty()) System.out.println("가방이 비어있습니다.");
                else System.out.println(bag);
            } else if (menu == 3) { // 4-C. 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
        sc.close();
    }
}