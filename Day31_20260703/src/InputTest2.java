import java.util.Scanner;

public class InputTest2 {

	public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	
	System.out.println("나이: ");
	int 나이 = a.nextInt();
	
	if(나이 >= 20) {
		System.out.println("성인");
	}else {
		System.out.println("청소년");
	}

	}

}
