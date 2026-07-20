package ArrayListTest;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 할 일을 저장할 동적 리스트 생성 [cite: 56]
        ArrayList<String> todoList = new ArrayList<>();

        while (true) {
            System.out.println("\n====== TODO 관리 ======");
            System.out.println("1. 할 일 추가");
            System.out.println("2. 할 일 목록 보기");
            System.out.println("3. 할 일 삭제");
            System.out.println("4. 종료");
            System.out.print("번호 입력 : ");

            int menuChoice = scanner.nextInt();
            scanner.nextLine(); // nextInt() 사용 후 남은 엔터키 제거 

            if (menuChoice == 1) {
                System.out.print("추가할 할 일을 입력하세요: ");
                String task = scanner.nextLine();
                todoList.add(task); // 리스트에 데이터 추가 
                System.out.println("등록되었습니다. : " + task);

            } else if (menuChoice == 2) {
                // 리스트가 비어있는지 확인 
                if (todoList.isEmpty()) {
                    System.out.println("할 일이 없습니다.");
                } else {
                    System.out.println("현재 할 일 목록: " + todoList);
                }

            } else if (menuChoice == 3) {
                System.out.print("삭제할 할 일의 이름을 입력하세요: ");
                String targetTask = scanner.nextLine();

                // 이름으로 있는지 확인 후 삭제 
                if (todoList.contains(targetTask)) {
                    todoList.remove(targetTask);
                    System.out.println("삭제되었습니다.");
                } else {
                    System.out.println("해당 할 일이 없습니다.");
                }

            } else if (menuChoice == 4) {
                System.out.println("프로그램을 종료합니다.");
                break; // 무한 루프 탈출 
            } else {
                System.out.println("잘못된 번호입니다. 다시 선택해주세요.");
            }
        }
        scanner.close();
    }
}
		


		/*
		 * * 실습 2 (중급): 할 일 목록(TODO) 관리 프로그램 상황 설명 할 일을 추가하고, 완료한 일은 삭제할 수 있는 프로그램을
		 * 만듭니다. ====== TODO 관리 ====== 1. 할 일 추가 2. 할 일 목록 보기 3. 할 일 삭제 4. 종료
		 * 
		 * 1번: 사용자가 직접 문자열을 입력(nextLine())해서 할 일 목록(ArrayList)에 추가 2번: 전체 목록 출력 (목록이
		 * 비어있으면 "할 일이 없습니다" 출력) 3번: 삭제할 할 일의 이름을 입력받아서 목록에 있으면 삭제, 없으면 "해당 할 일이 없습니다"
		 * 출력 4번: 종료
		 * 
		 * 💡 힌트 기능사용할 문법직접 문자열 입력받기키보드.next() (공백 없는 한 단어)목록이 비어있는지 확인.isEmpty() 또는
		 * .size() == 0이름으로 있는지 확인 후 삭제.contains(값) 으로 먼저 확인 → .remove(값)메뉴가 4개if ~ else
		 * if ~ else if ~ else if
		 * 
		 */
		
