public class FunctionTest2 {
	
public static void 등급(int 점수,String 과목명) {
if (점수 >= 90 && 점수 <= 100) {
            System.out.println(과목명 +": A등급");
        } else if (점수 >= 80) {
            System.out.println(과목명 +": B등급");
        } else if (점수 >= 70) {
            System.out.println(과목명 +": C등급");
        }else if (점수 >= 60) {
            System.out.println(과목명 +": D등급");
            
        } else if (점수 >= 50) {
            System.out.println(과목명 +": E등급");
            
        }else {
            System.out.println(과목명 +": F등급");
        }
}


public static void main(String[] args) {

// 국어,영어,수학 각각 점수 100,80 90
int 국어 = 100 , 영어 = 80 , 수학 = 90;

// 각각의 등급 90점 이상 A 
//          80점 이상 B
//          70점 이상 C 
//          60점 이상 D
//나머지는 모두 F

// 국어 등급 A 등급
// 영어 등급 B 등급
// 수학 등급 A 등급 
// 국어 등급
        등급(국어,"국어");

        // 영어 등급
        등급(영어,"영어");

        // 수학 등급
        등급(수학,"수학");
        
        // 사회 등급 
        등급(100 ,"사회");
        
        // 과학 등급 
        등급(50, "과학");


}
}