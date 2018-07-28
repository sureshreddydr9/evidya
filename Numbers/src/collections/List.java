package collections;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		
		Student s1 = new Student(101,"suresh",22);
		Student s2 = new Student(102,"ramesh",24);
		
		ArrayList<Student> sl = new  ArrayList<Student>();
		/*names.add("suresh");
		names.add("ramesh");
		names.add("anil");
		names.add("hari");
		names.add("snu");
		*/
for(Student obj:sl)
		System.out.println( obj);

	}

}
