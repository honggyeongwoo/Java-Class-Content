//import java.util.ArrayList;
//
//// 파일명 : InheritanceTest_Lab1.java
//
///*
// * 동물병원 
// *   강아지
// *   고양이
// *   도마뱀
// *   토끼
// * 
// *   공통적으로 이름,나이,품종 기본 클래스!
// *   각각의 동물들한테 물려줘서 강아지 객체를 만들었을때 이름,나이,품종
// *   사용할수있는 변수를 출력!
// *   
// * 
//	강아지 → 이름: 초코, 나이: 3살, 품종: 말티즈
//	고양이 → 이름: 나비, 나이: 2살, 품종: 페르시안
//	도마뱀 → 이름: 레오, 나이: 1살, 품종: 레오파드게코
//	토끼 → 이름: 토순이, 나이: 2살, 품종: 앙고라
// * 
// * 
// */
//
//class 동물 {
//	String 이름;
//	int 나이;
//	String 품종;
////	public 동물(String 이름, int 나이, String 품종) {
////		super();
////		this.이름 = 이름;
////		this.나이 = 나이;
////		this.품종 = 품종;
////	}
//		
//}
//
//class 강아지 extends 동물{
//	String 이름;
//	int 나이;
//	String 품종;
//}
//
//class 고양이 extends 동물{
//	String 이름;
//	int 나이;
//	String 품종;
//}
//
//class 도마뱀 extends 동물{
//	String 이름;
//	int 나이;
//	String 품종;
//}
//
//class 토끼 extends 동물{
//	String 이름;
//	int 나이;
//	String 품종;
//}
//
//public class InheritanceTest_Lab1 {
//
//	public static void main(String[] args) {
//
//		ArrayList<강아지> 강이지목록 = new ArrayList<>();
//		
//		강아지 초코 = new 강아지();
//		초코.이름 = "초코";
//		초코.나이 = 3;
//		초코.품종 = "말티즈";
//		
//		System.out.println(초코.이름);
//		System.out.println(초코.나이);
//		System.out.println(초코.품종);
//		
//	}
//}
