
public class FunctionTest2_BMI2 {
	
	public static void FBmi(String F이름, double Fbmi) {
		if(Fbmi >= 30 && Fbmi <= 100) {
			System.out.println(F이름 + "비만");
		}else if(Fbmi >= 25 && Fbmi < 30) {
			System.out.println(F이름 + "과체중");
		}else if(Fbmi >= 18.5 && Fbmi < 25) {
			System.out.println(F이름 + "정상");
		}else if(Fbmi < 18.5) {
			System.out.println(F이름 + "저체중");
		}else {
			System.out.println("잘못된 입력값");
		}		
	}

	public static void main(String[] args) {

		// 병원에서 건강검진
		// BMI 지수 100번 판단!
		// 비만,과체중 , 정상 , 저체중
		String 이름 = "철수";
		double bmi = 22.5;

		String 이름2 = "영희";
		double bmi2 = 18.3;

		String 이름3 = "민수";
		double bmi3 = 25;
		
//		철수
		if(bmi >= 30 && bmi <= 100) {
			System.out.println(이름 + "비만");
		}else if(bmi >= 25 && bmi < 30) {
			System.out.println(이름 + "과체중");
		}else if(bmi >= 18.5 && bmi < 25) {
			System.out.println(이름 + "정상");
		}else if(bmi < 18.5) {
			System.out.println(이름 + "저체중");
		}else {
			System.out.println("잘못된 입력값");
		}
		
//////////////////////////////////////////////////////////
		//철수함수
		FBmi("철수", 22.5);
		FBmi("영희", 18.3);
		FBmi("민수", 25);
		FBmi("경우", 150);
		
		
		// 30이상 비만
		// 25이상 ~ 30미만 과체중
		// 18.5이상 ~ 25미만 정상
		// 18.5미만 저체중 

		// 1. 함수 쓰지마시고! if문 

		// 2. 함수로 변경해서 장점 파악!
		
//////////////////////////////////////////////////////////
		
//		가격 계산 함수 
//			출력 -> 상품스캔
//			출력 -> 가격계산
//			출력 -> 영수증 출력
//			출력 -> 봉투 담기
//		
////////////////////////////////////////////////////////////
//		함수분리	
//		함수-공격
//			공격해라
//			데미지 입혔다
//			죽였다
//			점수 얻었다
//		
//		int 목숨 =0 이면?
//				목숨이 <0 ? -> 게임오버
//				그게 아니면 ? -> 계속 싸워라
//						
//			공격()
//				
////////////////////////////////////////////////////////////
//			
//			
//		주문메뉴 = 아메리카노?
//				메뉴가 == 아메리카노 ->
//				
//				아메리카노() /위에 따로 빼놓은 
	
		

	}

}
