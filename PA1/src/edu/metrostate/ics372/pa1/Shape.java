package edu.metrostate.ics372.pa1;

public interface Shape {
	/**
	 * Draws the pattern of the <code>Shape</code> based off it's parameters
	 */
	public void draw();

	/**
	 * Returns the <code>area</code> of the <code>Shape</code>
	 * 
	 * @return <code>area</code> the area of the <code>Shape</code>
	 */
	public double getArea();

	/**
	 * Returns the <code>perimeter</code> of the <code>Shape</code>
	 * 
	 * @return <code>perimeter</code> the perimeter of <code>Shape</code>
	 */
	public double getPerimeter();

}
