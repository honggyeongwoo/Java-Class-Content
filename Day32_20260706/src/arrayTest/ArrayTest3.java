package arrayTest;

public class ArrayTest3 {

public static void main(String[] args) {
// 배열을 쓰는 이유?
//  - 여러개의 값을 한꺼번에 저장하려고!
String[] 상품들 = {"나이키운동화","티셔츠","청바지","일자바지"};

System.out.println(상품들[0]);
System.out.println(상품들[1]);
System.out.println(상품들[2]);
System.out.println(상품들[3]);

// 배열을 손가락으로 짚어가며 읽는다!
// 마켓컬리에서 전체 상품을 화면에 보일 때 반복! 
// 배열에서 하나씩 꺼내서 화면에 보이기 
int 손가락 = 0;
System.out.println(상품들[손가락]);

//손가락 = 1;
++손가락;
System.out.println(상품들[손가락]);
//손가락 = 2;
++손가락;
System.out.println(상품들[손가락]);
//손가락 = 3;
++손가락;
System.out.println(상품들[손가락]);

// --------------------------------------
System.out.println();
System.out.println();

int[] 숫자들 = {10,20,30,40,50,60};

// 반복문 쓰지 말고! 
// 숫자들 배열에 40이 있니?
if(숫자들[0] == 40) {
System.out.println("찾았다.");
}else {
System.out.println("다음 칸으로 이동!");
}
if(숫자들[1] == 40) {
System.out.println("찾았다.");
}else {
System.out.println("다음 칸으로 이동!");
}
if(숫자들[2] == 40) {
System.out.println("찾았다.");
}else {
System.out.println("다음 칸으로 이동!");
}

if(숫자들[3] == 40) {
System.out.println("찾았다.");
}else {
System.out.println("다음 칸으로 이동!");
}

////////////////////////////////////////

double[] heights = {
	    165.3,
	    172.8,
	    180.5,
	    158.7,
	    169.4,
	    175.2,
	    182.1,
	    160.9,
	    167.6,
	    171.0
	};

if (heights[0] >= 180) {
    System.out.println("0번: 빙고!");
} 
else if (heights[1] >= 180) {
    System.out.println("1번: 빙고!");
} 
else if (heights[2] >= 180) {
    System.out.println("2번: 빙고!");
} 
else if (heights[3] >= 180) {
    System.out.println("3번: 빙고!");
}    
else if (heights[4] >= 180) {
    System.out.println("4번: 빙고!");
}
else if (heights[5] >= 180) {
    System.out.println("5번: 빙고!");
}
else if (heights[6] >= 180) {
    System.out.println("6번: 빙고!");
}
else if (heights[7] >= 180) {
    System.out.println("7번: 빙고!");
}
else if (heights[8] >= 180) {
    System.out.println("8번: 빙고!");
}
else if (heights[9] >= 180) {
    System.out.println("9번: 빙고!");
}else {
    System.out.println("아무도 180이 넘지 않았습니다.");
}










/////////////////////////////////////////
}
}