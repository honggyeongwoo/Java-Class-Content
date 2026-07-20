import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		// 1. 키보드 생성
		Scanner 키보드 = new Scanner(System.in);
		
		// 2, 나이 입력
//		System.out.println("나이를 입력: "); // ln -> 줄바꿈!
//		int age = 키보드.nextInt(); // ln 때문에 줄바꿈으로 내려와짐
		
//		System.out.print("나이를 입력: "); // ln 없음! 줄바꿈 없음!
//		int age = 키보드.nextInt(); // 나이를 입력: 오른쪽에 바로 작성 가능해짐
		
		System.out.print("이름을 한번 더 입력: ");
		String name = 키보드.nextLine();
		
		System.out.println("---사람의 정보---");
		System.out.println("이름: "+ name);
//		System.out.println("나이: " + age);
		
		
	}

}


////나이 입력
////println() 괄호안에 있는 값을 콘솔에 출력하고 
////        자동으로 줄바꿈 해라!
////print() 괄호안에 있는 값을 콘솔에 출력만 한다
//System.out.print("나이를 입력:");
//int age = 키보드.nextInt();
////20\n
////키보드로 입력한 값중에 필요없는 내용들을 지운다.
////자판기에서 거스름돈을 반환받고 자판기는 0원
////식판에 음식을 받아서 모두 먹는것! 식판 깨끗이 비운다
//키보드.nextLine();
//
//System.out.println("이름을 입력:");
//String name =  키보드.nextLine();
//
//System.out.println("----사람의 정보-----");
//System.out.println("이름: "+ name);
//System.out.println("나이: " + age);
//}
//}