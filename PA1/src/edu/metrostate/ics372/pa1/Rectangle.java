package edu.metrostate.ics372.pa1;

/**
 * This class implements the <code>Shape</code> interface which represents a
 * geometric shape. The <code>width</code> and <code>height</code> are of type
 * <code>double</double>.
 * The purpose is to create a <code>Rectangle</code> based of user input for
 * <code>width</code> and <code>height</code> and allow the user to retrieve the
 * <code>area</code> and <code>perimeter</code>, as well as print out the
 * pattern of the <code>Rectangle</code> represented by "*"
 * 
 * @author Gabriel Wallace
 *
 */
public class Rectangle implements Shape {
	private double width = 0.0;
	private double height = 0.0;

	/**
	 * Creates a new <code>Rectangle</code> object with the provided
	 * <code>width</code> and <code>height</code>
	 * 
	 * @param width
	 *            the <code>Rectangle</code> width represented as a
	 *            <code>double</code>
	 * @param height
	 *            the <code>Rectangle</code> height represented as a
	 *            <code>double</code>
	 */
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * Draws the pattern of the <code>Rectangle</code> based off its
	 * <code>width</code> and <code>height</code> parameters
	 */
	@Override
	public void draw() {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			if (i != height) {
				System.out.println();
			}
		}
	}

	/**
	 * Returns the <code>area</code> of the <code>Rectangle</code> (w * h)
	 * 
	 * @return <code>area</code> the area of the <code>Rectangle</code>
	 */
	@Override
	public double getArea() {
		double area = (this.width * this.height);
		return area;
	}

	/**
	 * Returns the <code>perimeter</code> of the <code>Rectangle</code> 2(w + h)
	 * 
	 * @return <code>perimeter</code> the perimeter of the <code>Rectangle</code>
	 */
	@Override
	public double getPerimeter() {
		double perimeter = 2 * (width + height);
		return perimeter;
	}

	/**
	 * Prints the <code>Rectangle</code> <code>width</code>, <code>height</code>,
	 * <code>area</code> and <code>perimeter</code>
	 */
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getArea()=" + getArea() + ", getPerimeter()="
				+ getPerimeter() + "]\n";
	}

	/**
	 * Compares this <code>Rectangle</code> with <code>other</code>
	 * <code>Rectangle</code> and checks to see if this <code>Rectangle</code>
	 * equals <code>other</code> <code>Rectangle</code>
	 * 
	 * @return true if this <code>Rectangle</code> is equal to <code>other</code>
	 *         <code>Rectangle</code>, otherwise false
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height)) {
			return false;
		}
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width)) {
			return false;
		}
		return true;
	}
}
