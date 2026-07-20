import java.util.Scanner;

public class FunctionTest3 {

// 편의점 자판기. 상품의 번호를 입력하면 구매 장바구니에 담김. 선택된 상품의 합계 계산 및 출력. 없는번호 선택시 "없는 상품입니다, 올바른 번호를 선택해주세요" 출력. 

// 편의점 계산 프로그램
// 상품 메뉴 보이기
// 상품 가격 구하기
// 상품 이름 구하기
// 영수증 출력	
 
	
public static void 메뉴보이기() {
System.out.println("===== 편의점 =====");
System.out.println("1. 삼각김밥 - 1500원");
System.out.println("2. 컵라면 - 2000원");
System.out.println("3. 콜라 - 1800원");
System.out.println("4. 계산하기");
System.out.print("번호 선택: ");
}

public static void 상품구매(int 번호) {
if (번호 == 1) {
System.out.println("삼각김밥 구매 완료!");
} else if (번호 == 2) {
System.out.println("컵라면 구매 완료!");
} else if (번호 == 3) {
System.out.println("콜라 구매 완료!");
} else {
System.out.println("없는 상품입니다.");
}
}

public static void main(String[] args) {


Scanner 키보드 = new Scanner(System.in);

while (true) {
메뉴보이기();

int 번호 = 키보드.nextInt();
상품구매(번호);

if (번호 == 4) {
System.out.println("계산완료!");
break;
}
}
}
}