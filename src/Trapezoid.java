public class Trapezoid {

	/**
	 * @param args
	 */

	private double height, base1, base2, side1, side2;
	Trapezoid trap1;

	public Trapezoid(double ht, double b1, double b2, double s1, double s2) {
		height = ht;
		base1 = b1;
		base2 = b2;
		side1 = s1;
		side2 = s2;
	}

	public void setHeight(double ht) {
		if (ht > 0.0)
			height = ht;
	}

	public void setBase1(double b1) {
		if (b1 > 0.0)
			base1 = b1;
	}

	public void setBase2(double b2) {
		if (b2 > 0.0)
			base2 = b2;
	}

	public void setSide1(double s1) {
		if (s1 > 0.0)
			side1 = s1;
	}

	public void setSide2(double s2) {
		if (s2 > 0.0)
			side2 = s2;
	}

	public double getHeight() {
		return height;
	}

	public double getBase1() {
		return base1;
	}

	public double getBase2() {
		return base2;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double calcArea(double ht, double b1, double b2) {

		double area = ((b1 + b2) / 2) * ht;
		return area;
	}

	public double calcPerim(double b1, double b2, double s1, double s2) {

		double perimeter = b1 + b2 + s1 + s2;
		return perimeter;
	}

}
