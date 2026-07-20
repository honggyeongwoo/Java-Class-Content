
public class FunctionTest2 {

	public static void 세탁기(String 빨랫감) {
		System.out.println(빨랫감 + " 빨래한다");
	}

	public static void 머신(String 요리) {
		System.out.println(요리 + " 만들어주는 머신 입니다.");
	}

	public static void 전자레인지(int 시간, String 상품) {
		System.out.println(시간 + 상품);

	}

	public static void main(String[] args) {

		세탁기("청바지");

		머신("지코바");

		int 시간 = 20;
		String 상품 = "핫바";
		전자레인지(시간, 상품);

		전자레인지(30, "라면");

	}

}
