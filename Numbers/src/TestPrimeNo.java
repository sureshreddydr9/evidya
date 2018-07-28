import java.util.Scanner;

public class TestPrimeNo {
	public static void main(String[] args) {
		System.out.println("enter a no");
		int num;
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		for(int i=2;i<=num/2;i++)
			if(num%i==0)
				System.out.println("num is prime");
		else
			System.out.println("num is not prime");
	}
	

}
