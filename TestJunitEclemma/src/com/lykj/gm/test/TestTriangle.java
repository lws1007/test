package com.lykj.gm.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriangle {

	private Triangle triangle;
	@Test
	public void testTriangleType() {
		triangle = new Triangle();
		System.out.println(triangle.testTriangleTyle(3, 3, 3));
		System.out.println(triangle.testTriangleTyle(3, 4, 5));
		System.out.println(triangle.testTriangleTyle(3, 3, 4));
		System.out.println(triangle.testTriangleTyle(1, 1, 5));
		System.out.println(triangle.testTriangleTyle(-1, 1, 2));
	}

}
