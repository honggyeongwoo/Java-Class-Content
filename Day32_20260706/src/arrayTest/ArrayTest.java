package arrayTest;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String stu1 = "민지";
		String stu2 = "영희";
		String stu3 = "민수";
		String stu4 = "철수";
		String stu5 = "지수";
		
		
		
//		배열로 가자
//		ArrayIndexOut 버그 <> 공간의 번호를 넘어갔다.
		
		
		String[] students = {"민지", "영희", "민수", "철수", "지수"};
		
		System.out.println(students[1]);
		
		
//		정수 5개의 배열
		
		int[] nums = {1,2,3,4,5};
		
		System.out.println(nums[1] + nums[4]);
		
		
		
		double[] nums2 = {1.1,1.23,12.2,1.54612,9.1213267};
		
		System.out.println(nums2[2]);
	}

}
