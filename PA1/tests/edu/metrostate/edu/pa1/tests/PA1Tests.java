package edu.metrostate.edu.pa1.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.metrostate.ics372.pa1.Rectangle;

public class PA1Tests {

	@Test
	public void test() {
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println(rectangle.toString());
		rectangle.draw();

		assertEquals(200.00, rectangle.getArea(), 0.0);
		assertEquals(60.00, rectangle.getPerimeter(), 0.0);
	}

}
