
public class OperatorTest {

	public static void main(String[] args) {
		
		// 조건 ? true 태그보여줘 : false 태그보여줘
		// 삼항연산자 
		//  조건에 따라 두 가지 결과 중 하나를 선택하는 연산자		
		
		System.out.println(10 >= 5 ? "참" : "부");
		
		int 내가구매한금액 = 80000;
		System.out.println(내가구매한금액 >= 10000 ? 
							"무료배송" : 
							"배송비 3000원");
		    
//		코드 정렬 단축키   
//		ctrl + a
//		ctrl + shift + f
		
		
		
		
		
		
// 		값을 "1" 씩만 증가,감소하는 연산자
//		++변수명 or --변수명
		int 숫자 = 10;
		
		System.out.println("초기값: " + 숫자);
		System.out.println("1증가: " + (++숫자));
//		숫자 = 숫자 +1;  <> 숫자 += 1; <>  ++숫자
		int 숫자2 = 10;
		
		System.out.println("초기값: " + 숫자2);
		System.out.println("1감소: " + (--숫자2));

	}

}
