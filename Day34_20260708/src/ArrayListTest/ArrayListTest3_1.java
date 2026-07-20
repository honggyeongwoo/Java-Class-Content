package ArrayListTest;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest3_1 {

	public static void main(String[] args) {

		
		Scanner 키보드 = new Scanner(System.in);

		ArrayList<String> 상품목록 = new ArrayList<>();

		while (true) {
			System.out.println("====== 우리동네 편의점 ======");
			System.out.println("1. 상품 담기 ");
			System.out.println("2. 장바구니 보기");
			System.out.println("3. 종료");
			System.out.print("번호 입력 : ");

			int 메뉴선택 = 키보드.nextInt();

			if (메뉴선택 == 1) { // 1번 선택 시 상품 선택 루프 진입
				while (true) {
					System.out.println("--- 상품 추가 ---");
					System.out.println("1.삼각김밥 2.컵라면 3.초코우유 4.과자 5.종료");
					int 상품선택 = 키보드.nextInt();

					if (상품선택 == 1)
						상품목록.add("1.삼각김밥");
					else if (상품선택 == 2)
						상품목록.add("2.컵라면");
					else if (상품선택 == 3)
						상품목록.add("3.초코우유");
					else if (상품선택 == 4)
						상품목록.add("4.과자");
					else if (상품선택 == 5)
						break; // 상품 선택 루프만 종료
					else
						System.out.println("잘못된 번호입니다.");
				}
			} else if (메뉴선택 == 2) { // 2번 선택 시 목록 출력
				System.out.println("현재 장바구니: " + 상품목록);
			} else if (메뉴선택 == 3) { // 3번 선택 시 전체 종료
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}
		}
	}
}
	




