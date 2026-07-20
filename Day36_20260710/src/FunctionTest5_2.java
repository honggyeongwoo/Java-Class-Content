// 정수 2개 더해서 값이 홀/짝 인지 구분할래
// 근데 1000번해야함 -> 함수 가자 ...

public class FunctionTest5_2 {
	
	static int num1 = 0 ;
	static int num2 = 0 ;
	static int 더한결과값 = 0 ;
	static int 곱한결과값 = 0 ;
	
	public static int 더하기(int num1, int num2) {
		return num1 + num2;		
	}
	
	public static String 홀짝판단(int 더한결과값) {
		String 결과 = "";
		if(더한결과값 % 2 == 0) {
//			System.out.println("짝수");
			결과 = "짝수";
		}else {
//			System.out.println("홀수");
			결과 = "홀수";
		}	
		return 결과;
	}
//	public    더하고뺀결과출력() {
//		변수 = 더하기()
//		변수 =	  뺴기()
//		변수+변수
//		홀짝판단
//	}

	public static void main(String[] args) {
		
		int 더한결과 = 더하기(10,5);
		System.out.println(더한결과);
		
		
//		홀짝판단(더하기(10,5));
//		System.out.println();
//		
		System.out.println(홀짝판단(더하기(10,5)));
		
	}

}
