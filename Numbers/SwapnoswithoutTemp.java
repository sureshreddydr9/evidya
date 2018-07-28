package come.java.examples;

public class SwapnoswithoutTemp {
public static void main(String[]args){
	int a=10;
	int b=20;
	System.out.println("before swap a="+a);
	System.out.println("before swap b="+b);
	swap( a, b);
}
	private static void swap(int a, int b) {
	
		a=a+b;//a=10+20=30
		b=a-b;//b=30-20=10
		a=a-b;//a=30-10=20
		System.out.println("after swap a="+a);
		System.out.println("after swap b="+b);
	}	
}

