
public class Primitive2Wrapper {

	public static void main(String[] args) {
		int i =20;
		int j=100;
		Integer obj = Integer.valueOf(i);//boxing,converting to object from primitive
		Integer obj2 = Integer.valueOf(j);
		System.out.println(i+ " " +obj);
		System.out.println(j+" "+ obj2);

	}

}
