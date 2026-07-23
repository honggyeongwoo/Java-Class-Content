package com.yonsai.project.service;

import java.util.HashMap;

class Member{ // class로 처음에 묶고 만들어서 사용하자
	String userId;
	String name;
	String age;
	String email;
	
		// 이렇게 쓰면 너무 중복이고 어려워!
		//	HashMap<String, String> 회원 = new HashMap<>();
		//	회원.put("userId", "hong123");
		//	회원.put("name", "홍길동");
		//	회원.put("age", "28");
		//	회원.put("email", "hong@test.com");	
}


public class MapTest2 {

	
public void 테스트2() {
	HashMap<String, Member> 회원들 = new HashMap<>();
	
	// 첫번째 멤버가 회원가입을 하면? // 실행 로직 [변수생성 -> 데이터 저장 -> 목록에 추가]
	// 1. 새로운 변수 생성
	Member 첫번째회원 = new Member();
	
	// 2. 데이터 저장
	첫번째회원.userId = "eryna11";
	첫번째회원.name = "에리나";
	첫번째회원.age = "20";
	첫번째회원.email = "eryna11@gmail.com";
	
	// 3. "회원들"에 추가하기
	회원들.put(첫번째회원.userId, 첫번째회원);
	
	
	
	// 두번째 멤버가 회원가입을 하면?
	// 1. 새로운 변수 생성
	Member 두번째회원 = new Member();
	
	// 2. 데이터 저장
	두번째회원.userId = "eryna111";
	두번째회원.name = "에리나2";
	두번째회원.age = "202";
	두번째회원.email = "eryna11@gmail.comm";
	
	// 3. "회원들"에 추가하기
	회원들.put(두번째회원.userId, 두번째회원);	
	
//	회원들.put
//	
//	System.out.println(회원들);
	
	
	
}	
	
	
	
	
public void 테스트() {
//System.out.println("MapTest2실행");

HashMap<String, String> 회원 = new HashMap<>();
회원.put("userId", "hong123");
회원.put("name", "홍길동");
회원.put("age", "28");
회원.put("email", "hong@test.com");

System.out.println(회원);

// 두번째 회원가입을 한다. 
회원.put("userId", "eryna123");
회원.put("name", "에리나");
회원.put("age", "28");
회원.put("email", "eryna@test.com");


System.out.println(회원);

// 확인 
System.out.println(회원.get("name"));

// 문제점 
//  - key 중복되면 안된다. 
//  - key 를 다 각각 만들게 되면 검색을 할때 
//    일일이 변수를 만들어서 각각 이름을 부여한거랑똑같다
//    검색하기가 어렵다. 
//  - 우리가 변수이름으로 그냥 숫자로 계속 만들다보면
//    실제 이름이 userId와 일치하는지도 잘 모른다.
//  - 숫자를 붙이면 중간에 누군가 삭제되거나 추가되면
//    문제 생김.






}
}