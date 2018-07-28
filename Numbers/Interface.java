package come.java.examples;
import org.omg.Messaging.SyncScopeHelper;
interface Drawable{//1st person declared interface
	void draw();
	//2nd person implements interface with a class or in a class
	 public class Rectangle  implements Drawable{
		public void draw()
		{System.out.println("draw rectanglr");
	 }
	public class Circle implements Drawable{
		public void draw()
		{	System.out.println("draw a circle");
	}
//3rd person user
		public class TestInterface{
	public void main(String args[])
	{
		Drawable Rectangle = new Rectangle();
		Drawable Circle = new Circle();
		Rectangle.draw();
		Circle.draw();

	}

}
