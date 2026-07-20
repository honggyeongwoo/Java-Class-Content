package Gemini;

public class EX1 {

    public String checkPassword(String password) {
        // 1. 중간에 위치한 return (Early Return)
        if (password == null) {
            return "비밀번호를 입력해주세요.";
        }
        
        // 2. break의 역할
        int count = 0;
        while (count < 5) {
            if (password.equals("1234")) {
                System.out.println("비밀번호 일치!");
                break; // while 반복문만 부수고 나감
            }
            count++;
            System.out.println(count + "번째 틀렸습니다.");
        }
        
        // break 이후 여기 계속 실행됨
        System.out.println("검사가 끝났습니다.");
        
        // 3. 마지막에 위치한 return
        return "검사 완료 결과 보고서";
    }

    // ⭐ 자바 프로그램의 실행 시작점!
    public static void main(String[] args) {
        
        EX1 ex = new EX1(); // EX1 클래스를 사용할 준비 (객체 생성)

        System.out.println("--- [테스트 1: null 입력 (Early Return)] ---");
        // 메서드가 return한 값을 문자열 변수 result1에 저장 후 출력
        String result1 = ex.checkPassword(null); 
        System.out.println("반환된 값: " + result1);

        System.out.println("\n--- [테스트 2: 맞는 비밀번호 입력 (break)] ---");
        String result2 = ex.checkPassword("1234");
        System.out.println("반환된 값: " + result2);

        System.out.println("\n--- [테스트 3: 틀린 비밀번호 입력] ---");
        String result3 = ex.checkPassword("9999");
        System.out.println("반환된 값: " + result3);
    }
}