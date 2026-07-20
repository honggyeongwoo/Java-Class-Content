public class ClassTest {

public static void main(String[] args) {
// 고객들이 정보를 저장하는 공간 
// 쇼핑몰 고객 회원가입 1명 

String 손님1이름 = "철수";
String 손님1아이디 = "qwer";
String 손님1패스워드 = "qwer11!";
String 손님1핸드폰번호 = "010-1234-1234";
int 손님1생일 = 1130;

String 손님2이름 = "서수";
String 손님2아이디 = "qwer";
String 손님2패스워드 = "qwer11!";
String 손님2핸드폰번호 = "010-1234-1234";
int 손님2생일 = 1030;

String 손님3이름 = "희수";
String 손님3아이디 = "qwer";
String 손님3패스워드 = "qwer11!";
String 손님3핸드폰번호 = "010-1234-1234";
int 손님3생일 = 1230;

// 100명 손님이 들어오면 위에 처림 직접 변수를 일일이 만드는게
// 힘들어요!

String[] 손님들이름 = {"철수","서수","희수"};
String[] 손님들아이디 = {"qwer","asdf","zxcv"};
String[] 손님들비밀번호 = {"qwer","asdf","zxcv"};
String[] 손님들핸드폰번호 = {"010-1234-1234",
 "010-1234-2510"};
int[] 손님들생일 = {1130,1030,1230};
}
}