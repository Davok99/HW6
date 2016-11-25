import shapes.Squares;
import shapes.Rectangle;
import utils.Math;
public class Driver {

	public static void main(String[] args) {
		double d = 15.6;
		Rectangle r = new Rectangle(80,50);
		Squares s = new Squares(100);
		Math m = new Math();
		System.out.println(s.getArea());
		System.out.println(r.getArea());
		System.out.println(m.factorial((int)d));
		System.out.println(m.factorialLoop((int)d));
	}

}
