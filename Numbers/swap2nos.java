package come.java.examples;

public class swap2nos {
	public static void main(String[]args)
	{
		int num1=10;int num2 =20;
		System.out.println("nos before swaping"+ num1);
		System.out.println("nos before swaping"+ num2);
	}
		public static  void swap(int num1,int num2){
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println("nos afer swaping"+ num1);
		System.out.println("nos after swaping"+ num2);
		
		
	}

}
