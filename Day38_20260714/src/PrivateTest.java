// 파일명 : PrivateTest.java

// 해커가 자바로 만들어진 프로그램 해킹!
// 해커역할은 main
// 자바로 만든 게임서버!(회사)
class 게임서버 {

private int 골드; // 게임을 시작하면 기본적으로 돈은 0원!

public void 골드추가(int 돈) {
	골드 += 돈;
}

}

public class PrivateTest {

public static void main(String[] args) {

게임서버 서희회사 = new 게임서버();

System.out.println("해커: 골드 999999로 바꿔서 게임해지!");
// 서희회사.골드 = 999999;에러남
System.out.println("private 이라 접근 할 수없다!");

System.out.println();
System.out.println("😎 해커 : 다시 공격!");
System.out.println("😎 해커 : 또 공격!");
System.out.println("😎 해커 : 계속 공격!");
System.out.println("❌ 자바 : 아무리 시도해도 private은 직접 접근할 수 없습니다.");
}
}