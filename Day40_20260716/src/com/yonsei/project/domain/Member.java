package com.yonsei.project.domain;

//데이터를 담는 클래스를 모아놓은 폴더 = domain
// model? mvc? vo?
// vo(value object) - 데이터만 저장하는 객체 ? 변수 , 생성자, private이 걸리면 접근할 수있는 set/get함수

// 클래스 다이어그램?
// 프로그램에서 사용하는 클래스들을 정리해놓은 그림
// 프로그램의 구조가 어떻게 되어있는지 확인

public class Member {
	String name; // 회원명
	int age; // 나이
	char gender; // 성별 F or M
	int couponCount; // 요리책 쿠폰 갯수, 요리쿠폰은 책을 대여하거나 구매했을 때 추가 
	
	
	public Member(String name, int age, char gender) { // couponCount 뺐네?
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.couponCount = 0; // 회원가입 했다고 쿠폰이 있는건 아니니까~
	}

	}


