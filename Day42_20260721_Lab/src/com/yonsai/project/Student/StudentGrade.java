package com.yonsai.project.Student;

import java.util.HashMap;

// 기초 문제 1. 학생 성적 관리

class Student { // 기본 class 부여
    String studentId;
    String name;
    int score;
}

/**/

public class StudentGrade {
	
	public void 학생정보저장() {
		// 메서드를 안만들고 
        // public class StudentGrade 여기에 바로 하니까 오류 발생

	// 1. HashMap<String, Student> 타입의 학생들이라는 Map을 만드세요.

		HashMap<String, Student /* Value는 Class Student 형태를 가진다*/> 학생들 = new HashMap<>();
		//"학생들" 이라는 Map을 만들었다.
		// String 문자열 타입의 Key를 가지고
		// 'class로 만들어놓은 구조의' Student 라는 Value를 가진다.
		
	// 2. 학생 2명을 각각 new Student()로 생성하고, studentId, name, score 필드에 직접 값을 대입하세요. 
	// (예: "s001", "김민지", 95 /
			
		// 새로운 변수 생성하기
		Student 김민지 = new Student(); // class Student 형태를 가진 객체 만들게 - 객체 저장소 이름은 김민지
		
			// 필드에 값(데이터) 저장
			김민지.studentId = "s001";
			김민지.name = "김민지";
			김민지.score = 95;
			
			// "학생들" 공간에 값 추가하기			
			
			학생들.put(김민지.studentId, 김민지); // 김민지 라는 객체저장소를 찾을때 김민지의 studentId 값으로 찾을게
			// put 안하면 ?
			
			//학생들.put(김민지.name, 김민지); 가능하지만 비권장(이름은 중복 위험)
			//학생들.put(김민지.score, 김민지); 불가능! score는 int라 String Key 규칙 위반(컴파일 에러)
			
//			System.out.println(학생들.get("s001"));
			
			System.out.println("studentId = " + 김민지.studentId); // 객체 김민지의 studentId value
			System.out.println("name = " + 김민지.name); // 객체 김민지의 name value
			System.out.println("score = " + 김민지.score); // 객체 김민지의 score value
			
			System.out.println(학생들.get("s001").studentId); // 이렇게 쓰기위해 map 에 저장한다?
			System.out.println(학생들.get("s001").name); // 객체변수가 많이지면 많아질수록?
			System.out.println(학생들.get("s001").score);
			
		// 새로운 변수 생성하기 - 반복
			
		// "s002", "이도현", 88)	
		Student 이도현 = new Student(); // class Student 형태를 가진 객체 만들게 - 객체 저장소 이름은 이도현
		
			// 필드에 값(데이터) 저장
			이도현.studentId = "s002";
			이도현.name = "이도현";
			이도현.score = 88;
			
//			학생들.put(이도현.studentId, 이도현); // put을 안해도 아래에 이도현.studentId 직접 불러오면 가능
											// 100, 1000명가도 이러기는 쉽지않음?
			
			System.out.println("studentId = " + 이도현.studentId); // 객체 이도현 studentId value
			System.out.println("name = " + 이도현.name); // 객체 이도현 name value
			System.out.println("score = " + 이도현.score); // 객체 이도현 score value
			
			System.out.println(학생들.get("s002").studentId); // put을 안했으니 당연하게 안됨

	}
}
