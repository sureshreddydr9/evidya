
public class Immutable {

	public static void main(String[] args) {

		String s = new String("sachin");
		s.concat( "tendulkar");
		s=s.concat(" tendulkar");
		System.out.println(s);
		
	}

}

