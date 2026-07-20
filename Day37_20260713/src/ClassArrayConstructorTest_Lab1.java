import java.util.ArrayList;

// 파일명 : ClassArrayConstructorTest_Lab1

// 헬스장 운동기록 
//  에리나 사람이 헬스장 등록을 해서 운동기록을 한다.
//  운동날짜,운동종류,운동시간
//  에리나가 앱에서 혹은 웹에서 확인을 할 때 모든 내용이 보여된다.
// 매개변수 받는 생성자를 이용해서 ArrayList로 저장하는 것까지만
// 해보세요

// "2026-07-10", "런닝", 30
// "2026-07-12", "수영", 40
// "2026-07-11", "필라테스", 50


class 운동{
	String 운동날짜;
	String 운동종류;
	int 운동시간;
	
	public 운동(String 운동날짜, String 운동종류, int 운동시간){
			this.운동날짜 = 운동날짜;
			this.운동종류 = 운동종류;
			this.운동시간 = 운동시간;
		}				
}

public class ClassArrayConstructorTest_Lab1 {

	public static void main(String[] args) {

	ArrayList<운동> 운동기록 = new ArrayList<>();
		
	운동 일지 = new 운동("2026-07-10", "런닝", 30);
	
	System.out.println(운동기록);
		
	운동기록.add(new 운동("2026-07-10", "런닝", 30));
    운동기록.add(new 운동("2026-07-12", "수영", 40));
    운동기록.add(new 운동("2026-07-11", "필라테스", 50));
    
    System.out.println(운동기록);
}
}
