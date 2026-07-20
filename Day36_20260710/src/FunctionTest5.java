// 정수 2개 더해서 값이 홀/짝 인지 구분할래
// 근데 1000번해야함 -> 함수 가자 ...

public class FunctionTest5 {
	
	static int num1 = 0 ;
	static int num2 = 0 ;
	static int 더한결과값 = 0 ;
	static int 곱한결과값 = 0 ;
	
	public static int 더하기(int num1, int num2) {
		return num1 + num2;		
	}
	
	public static void 홀짝판단(int 더한결과값) {
		if(더한결과값 % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}		
	}

	public static void main(String[] args) {	
		
//		더하기(10,5); // 15로 반환 되있어
//		System.out.println(더하기); // 15출력해줘 -> 오류 / 저장되지않으 값은 줄이바뀌며 휘발됬음
		
//		홀짝판단(더하기(10,5));
//		System.out.println();
		
//		System.out.println(홀짝판단(더하기(10,5)));	
		
	}

}
