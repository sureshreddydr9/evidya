package come.java.examples;
public class oddeveninanarray {
	public static void main(String[]args)
	{
		int x;
		/*Scanner in = new Scanner(System.in);
			x=in.nextInt();*/
			//System.out.println("Enter any number");
		for(x=1;x<=10;x++)
			if((x/2)*2==x)
			System.out.println(x+ " is even");
			else
				System.out.println(x+" is odd");
		
	}
}

