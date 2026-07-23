package com.yonsai.project;

import com.yonsai.project.service.DogService;
import com.yonsai.project.service.MapTest; // new MapTest(); 의 import
import com.yonsai.project.service.MapTest2; // MapTest2() import

//java 패키지명 관례는 회사/조직의 도메인 주소를 거꾸로 뒤집에서 짓는다 ?
//-이름충돌방지
//-소유권/출처 구분
//-도메인? 숫자로 된 IP를 사람이 외우기 쉽게 만든 인터넷 주소

//-자바에서는 디폴트 패키지 폴더에 있는 클래스는 IMPORT가 불가하다!! / 다른 패키지에서 이걸 불러와서 쓸수없다!
//디폴트 패키지? 패키지 선언이 없는 상태!


public class Main {

	public static void main(String[] args) { //main + space bar 로 부를수도 있음
		
//		new MapTest(); //리렇게만쓰면 경로를 못 불러옴. 상단에 import로 경로 불러와야함.

//		new MapTest(); // 이렇게만쓰면 왜 public void mapEx() {} 요 내용까지 안되지?
		
		MapTest map = new MapTest();
		// 메모리 공간 확보? 
		// 무슨 타입으로 불러올지 ????
		// 공간을 확보하고 종료 ?
		// main 파일과 MapTest 파일이 연결 됨.
		
		//		map.mapEx(); //maptest안에 mapEx()함수 실행해
				
		//		map.아이디중복확인();
				
		//		map.회원정보조회();
		
		MapTest2 test2 = new MapTest2(); //import 해야해
		
		//			test2.테스트();
						// 1. 자바 실행 - main 찾음
						// 2. new MapTEST2() 있네? 메모리 확보해라
							// test2에 저장해라!
						// 3. test2안에 있는 테스트를 함수를 실행해라!
							
		//		test2.테스트2();
		
		DogService test3 = new DogService();
		
//		DogService().강이지입양테스트(); 이렇게는 안되네 ?
		
		test3.강아지입양테스트();
		
	}
	}


