package lab;

public class Lab1 {
	
	public static int 기초1(int num1) {
		int num2 = (num1 * 2);
		
		System.out.println(num2);
		
		return num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		기초1(500);
		
		
		기초1(기초1(500));
		

//		
	}

}
//int num1 = 100;
//System.out.println(num1);
//
//기초1(500);
//System.out.println(기초1);
//
//int 계산값 = 기초1(500);
//System.out.println();