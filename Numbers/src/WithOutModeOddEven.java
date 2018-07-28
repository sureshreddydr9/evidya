import java.util.Scanner;

public class WithOutModeOddEven {

	public static void main(String[] args) {
		
		System.out.println("eneter a no");
		Scanner input =new Scanner(System.in);
		int num =input.nextInt();
		int result=((num/2)*2);
		if (result==num)
			System.out.println("no is even");
		else
			System.out.println("num is odd");
	}

}
