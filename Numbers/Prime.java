package come.java.examples;

public class Prime {
public static void main(String[]args){
	int num = 29;
	boolean isprime =true;
	for(int i=2;i<=num/2;i++){
		if(num%i==0){
			isprime =false;
			break;
		}
		}
		if(isprime)
		{
		System.out.println("no isprime");
		}
		else
		{
			System.out.println("no is not prime");
		}
}
}