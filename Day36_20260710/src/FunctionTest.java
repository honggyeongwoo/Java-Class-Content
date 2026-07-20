
public class FunctionTest {

	public static void a() { // 이 자체로는 실행이 안됨.(선언) -> 실행을 하려면 메인에서 호출 a() ? //
		int num2 = 100;
	}

	public static void b() {
		String name2 = "";
		System.out.println(name2);
	}

	public static void c(int num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		a(); // } 닫히면 종료(메모리,캐시 삭제?)

		int num = 10;

		c(num);

		new Person(); // 객체

	}

}

class Person {
	int a;
	String b;

}