package com.yonsai.project.service;

import java.util.HashMap;

// 강아지 입양 정보 관리 
// 강아지마다 강아지 정보를 한꺼번에 묶어서 저장하자

class Dog {
    String dogId;
    String name;
    String breed;
    boolean isAdopted; // 입양 여부
    
    
    
    
    
	 // 클래스 멤버 변수를 한꺼번 자동으로 출력해주는 특별한 
	 // 함수가 있다!
	 // 클래스 안에 변수들을 소개시키는 함수! 
	@Override
	public String toString() { //toString 알아둬! 편리해 !
		return "Dog [dogId=" + dogId + ", name=" + name + ", breed=" + breed + ", isAdopted=" + isAdopted + "]";
	}    
}

public class DogService { // 저는 main이 아닙니다. 혼자 실행이 불가능합니다. ㅜㅜ

	public void 강아지입양테스트() { //새로운 공간,변수 생성하려면 메서드가 무조건 필요하다 ?
		
		// 1. 여러 강아지들 저장하는 공간 만들기, HashMap
				
		HashMap<String, Dog> 강아지들 = new HashMap<>(); //"강아지들" 변수에 메모리 주소를 저장하겠다.
		
		// 2. Dog 객체 1(d001, 초코, 말티즈, false) 생성 후 필드 값 대입
		Dog 강아지1 = new Dog(); // 강아지1 객체 생성
		강아지1.dogId = "d001";
		강아지1.name = "초코";
		강아지1.breed = "말티즈";
		강아지1.isAdopted = false;
		강아지들.put("d001", 강아지1);

		// 3. Dog 객체 2(d002, 몽이, 푸들, false) 생성 후 필드 값 대입
		Dog 강아지2 = new Dog(); // 강아지2 객체 생성
		강아지2.dogId = "d002";
		강아지2.name = "몽이";
		강아지2.breed = "푸들";
		강아지2.isAdopted = false;
		강아지들.put("d002", 강아지2);

		// 4. Dog 객체 3(d003, 보리, 진돗개, false) 생성 후 필드 값 대입
		Dog 강아지3 = new Dog(); // 강아지3 객체 생성
		강아지3.dogId = "d003";
		강아지3.name = "보리";
		강아지3.breed = "진돗개";
		강아지3.isAdopted = false;
		강아지들.put("d003", 강아지3);
		
		// 3개 만들었잖아? 근데 하나씩 찾으려니까 관리가 쉽지않잖아? 그래서 강아지1,2,3,을 한거번에 저장할게 = map
		
		System.out.println(강아지들);
				
		}

		}

////면접!
////이 객체는 참조(메모리의 주소) new를 이용해서 만든 타입
////      값을 저장하고 있느냐? 10 ,0.012,"이서희";
////정확하게 설명할 수있는지?
//}
//
////가장 기본적으로 메모리 구조!
//public void 메모리구조() {
//int num = 0;  // stack 
//
////메모리에 구조는 2개만 확인 
////heap - new를 했을때 생기는 변수!(객체)
////   - new를 해서 만든 객체!
//
//
////stack - new가 붙지 않는 변수들
////    - 변수들이 저장되는 곳!
////      지역변수
//
//
//int num5 = 0;
//double num4 = 0;
//char ch1 = 'ㅁ';
//boolean result; 
//
////Stack에는 위치(주소)를 저장하고 Heap에는 실제
////객체를 저장한다. 서로 다른 공간이라 주소로 
////연결을 해서 사용한다. 
//
////stack 크기가 정해져있는 변수들! (기본타입)
////heap 크기가 정해져있지 않는 변수들! (클래스타입)
////  클래스 멤버 변수들의 개수가 정해져있지 않음