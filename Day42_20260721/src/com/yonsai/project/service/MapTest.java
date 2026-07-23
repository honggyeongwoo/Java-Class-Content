package com.yonsai.project.service;

import java.util.HashMap;

//일반적으로,관례적으로 service 패키지를 쓴 이유? 각자 나눠서 자기 일만 합시다~! (비지니스 로직 담당)
//코드를 이용해서 처리하는 기능을 만들고, 생각 및 처리한다! (계산,판단,저장)
//사용자 대신에 일을 해주는 기능에 service라는 이름을 주로 부여해서 쓰고있다
//login.java? 이렇게만쓰면 화면인지 아이디와 비밀번호 인지 합부여부를 판단하는건지 파일명만 봐서는 모름
// loginservice ? 암묵적으로 아 로그인하는 기능 이구나. 알수있음

// 자바스크립트에서 객체(오브젝트) 타입  let 오브젝트 = {key : value}
// 자바에서도 동일하게 가능 = map




public class MapTest {//main에서 new MapTest(); 로 불러서 사용함
	
	public void mapEx() {
		System.out.println("map에 대해 알아봅시다");
		
		// HashMap? 객체 타입 저장 방법. Key, Value
//		HashMap<K, V> 예제1 = new HashMap<>();
		HashMap<String /* 일반적으로 유저타입 = string */, Integer> 예제1 = new HashMap<>();
		//Key,Value의 저장 타입을 미리 지정하고 들어가야한다! 
		//Hash? 매우 빠르게 찾는 방법 정도..
		//HashMap ? 데이터를 Key를 이용해서 빠르게 찾는 공간이다..
		
		//데이터 저장하려면?
		예제1.put("영희", 101);
		System.out.println(예제1);
		
		예제1.put("철수", 202);
		System.out.println(예제1);
		
		예제1.put("민수", 303);
		System.out.println(예제1);
		
		//저장한 순서랑 출력되는 순서가 다르다!
		//순서대로 저장이 아니다.. (저장 자체는 랜덤 순서로되는
		//한번저장되면 그 위치는 고정 (완전 랜덤은 아니지?)
		
		//쉽게생각하면 이름표(Key)로 아주 빠르게 값을 찾고 저장하는 상자
		//저장한 순서대로? 아니. Hash 본인만의 방식으로 저장관리.
		HashMap<String,String> 예제2 = new HashMap<>();

		예제2.put("moiveNm", "소나기");
		예제2.put("typeNm","장편");

		System.out.println(예제2);

		// 편의점 상품 
		// 이름,가격
		HashMap<String,Integer> 상품목록 = new HashMap<>();

		상품목록.put("콜라", 2000);
		상품목록.put("라면", 1200);
		상품목록.put("삼각김밥", 1500);

		System.out.println(상품목록);

		// 로그인 
		HashMap<String,String> 로그인정보 = new HashMap<>();

		로그인정보.put("admin", "admin1234!");
		로그인정보.put("kim", "kim1234!");
		로그인정보.put("seo", "seo1234!");
		로그인정보.put("hong", "hong1234!");

		// 비밀번호는 입력받으면 암호화(BCrypt)

		System.out.println(로그인정보);

		// 가져올때 ,얻다,받다 get(가져와)
		HashMap<String,String> 냉장고 = new HashMap<>();

		// 냉장고에 음식을 넣다! put
		냉장고.put("멸치볶음", "엄마가 만든 멸치볶음");
		냉장고.put("손질한야채", "손질한 감자, 양파");
		냉장고.put("다진마늘", "손질한 다진 마늘들");

		// 냉장고에서 음식 꺼내기 
		// 다진마늘 꺼내와! 
		System.out.println(냉장고.get("다진마늘"));

		// 멸치볶음 꺼내와!
		System.out.println(냉장고.get("멸치볶음"));

		// 사이즈
		System.out.println(냉장고.size());

		// 버그 유발을 최소로 낮추기 위해서 사용하는 
		// 함수! 
		// 혹시 해당 key가 있는지 먼저 확인
		//  냉장고에 콜라 key가 있니?
		//  있으면 true, 없으면 false
		boolean 키결과 = 냉장고.containsKey("콜라");
		System.out.println(키결과);

		// 삭제
		냉장고.remove("멸치볶음");
		System.out.println(냉장고);

		// 실무에서는 조금 쓰는게 더 있다.
		//  getOrDefault(key,기본값설정)
		//  putIfAbsent() 중복 방지하며 초기값 설정


		}
		// 아이디 중복확인
		public void 아이디중복확인() {

		HashMap<String, String> 가입된회원 = new HashMap<>();
		가입된회원.put("hong123", "홍길동");
		가입된회원.put("kim456", "김철수");
		가입된회원.put("lee789", "이영희");

		// 1. 이미 가입된 아이디 확인
//		    프론트에서 아이디를 입력받았다! 전제!

		String 아이디1 = "hong1234";

		if(가입된회원.containsKey(아이디1)) {
		System.out.println("이미 가입된 아이디 입니다.");
		}else {
		System.out.println("가입 가능한 아이디 입니다.");
		}
		}

		// 상품 조회하는 예제
		//  - 상품의 할인율 저장해서 실제 가격에서 할인하는 금액을
//		    화면에 보여줘야될 때가 있다.

		public void 상품할인률확인() {
		HashMap<String, Object> 상품응답 = new HashMap<>();
		상품응답.put("productId", 1001);
		상품응답.put("productName", "무선 이어폰");
		상품응답.put("price", 89000);

		// 할인률이라는 키가 있니?
		boolean 결과 = 상품응답.containsKey("discountRate");

		if(결과) {
			System.out.println("할인율은 10%입니다.");
			}else {
			System.out.println("할인을 하지 않는 상품입니다!");
			}
			}

			// 회원정보 조회하여 프론트에 응답한다 라고 가정!
			public void 회원정보조회() {
			// 회원정보 
			//  userId , name,age,email

			HashMap<String, String> 회원응답 = new HashMap<>();

			회원응답.put("userId", "hong123");
			회원응답.put("name", "홍길동");
			회원응답.put("age", "28");
			회원응답.put("email", "hong@test.com");

			// 1. "phone"이라는 key가 있는지 확인
			// 만약 전화번호가 있다면 전화번호의 값을 출력하고
			//  없다면 "전화번호가 등록되어있지 않습니다"
			
			boolean 번호유무 = 회원응답.containsKey("phone"); //번호 있어? 물음
			// 전화번호 유무 확인 true/false

			if(번호유무) {//전화번호 있니?
				System.out.println("010-1234-1234"); //있으면 표시
			}else { // 없으면 없다고 콘솔 출력
				System.out.println("전화번호가 등록되어있지 않습니다");
			}
			
			// 2. 회원의 정보가 총 몇개 저장되어있는지 출력
			//  회원정보 개수: 4
//			int 정보갯수 = 회원응답.카운트?
			System.out.println("회원 정보 개수 : " + 회원응답.size()); //size ~

			// 3. email의 값을 출력
			//   email: hong@test.com
			boolean 이메일유무 = 회원응답.containsKey("email");
			
			System.out.println(회원응답.get("email"));

			// 4. 이름을 삭제 후 전체 출력!
			회원응답.remove("name");
			System.out.println(회원응답);

			}





			}