package com.yonsai.project.service;

import java.util.ArrayList;

import com.yonsai.project.domain.Crop;
import com.yonsai.project.domain.Fruit;
import com.yonsai.project.domain.Nut;
import com.yonsai.project.domain.Vegetable;

public class FramService {
// 실제 농작물들을 저장하는 배열
// 채소,견과류,과일? 모른다.
	ArrayList<Crop> farmList = new ArrayList<>();

// FramService 메인에서 딱 한번 객체를 생성할때
// 기존에 농작물들을 저장하는 생성자
	public FramService() {
		farmList.add(new Fruit("사과", 50, 15));
		farmList.add(new Fruit("바나나", 30, 18));
		farmList.add(new Vegetable("당근", 100, "유기농"));
		farmList.add(new Vegetable("양파", 80, "일반"));
		farmList.add(new Nut("호두", 40, "미국"));
	}

// 요구사항 2. 전체 재고 목록 조회
// farmList 안에 있는 모든 농산물을 화면에 보여주기!
// main 에서 2번을 선택하면 니가 된다.
	public void printFarm() {
		// 코드를 작성하시오!
		
		System.out.println();

		// 1. farmList에서 농산물을 하나씩 꺼내기
		// (ArrayList에서 자동으로 하나씩 꺼내온다 → for문 사용)
		for (농산물 f : farmList) {

			// 2. farmList에서 하나 꺼내온 객체 안에 있는 내용을 출력하기
			// 농산물 클래스야 다른 폴더라 변수에 직접 접근이 불가능하니
			// showFarm() 함수를 이용해서 농산물 클래스 안에 있는
			// 변수들을 출력해 줄래?
			f.showFarm();
		}

		System.out.println();
	}

// 요구사항 3. 새 품목 추가
// 사용자가 종류를 선택하면 그에 맞는 정보를 입력받아서
// farmList에 새 농산물을 추가하기!
	public void addNewKind() {
		// 코드를 작성하시오!

		// 1. 사용자에게 추가할 품목 종류를 안내하고 입력받기
		// (1.과일 2.채소 3.견과류)
		// (키보드.nextInt() 사용)

		// 2. nextInt() 뒤에는 개행문자가 남아있어서
		// 다음 nextLine()이 제대로 입력받지 못할 수 있다
		// → 개행문자를 없애주는 코드가 필요하지 않을까? (키보드.nextLine())

		// 3. 공통으로 필요한 정보(품목명, 재고수량) 입력받기
		// (키보드.nextLine(), 키보드.nextInt() 사용,
		// nextInt() 뒤에는 또 개행문자 처리 필요)

		// 4. 입력받은 종류(1, 2, 3)에 따라 분기하기
		// (if - else if - else if 구조 사용)

		// 4-1. 종류가 1(과일)이면
		// → 과일만의 고유 정보(당도) 추가로 입력받기
		// → new 과일(품목명, 수량, 당도) 객체를 만들어서
		// farmList에 추가하기 (add 메서드 사용)

		// 4-2. 종류가 2(채소)이면
		// → 채소만의 고유 정보(재배방식) 추가로 입력받기
		// → new 채소(품목명, 수량, 재배방식) 객체를 만들어서
		// farmList에 추가하기

		// 4-3. 종류가 3(견과류)이면
		// → 견과류만의 고유 정보(원산지) 추가로 입력받기
		// → new 견과류(품목명, 수량, 원산지) 객체를 만들어서
		// farmList에 추가하기

		// 5. 추가가 끝나면 "OO 추가 완료!" 라는 안내 메시지 출력하기
		// (입력받은 품목명을 함께 출력)
	}

}