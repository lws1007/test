package com.lykj.gm.test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class JunitTest {

	private Calc calc;
	
	@Test
	public void testAdd() {
		calc = new Calc();
		assertEquals((long) 5, calc.add(2, 3));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivideException() {
		calc = new Calc();
		int result = calc.divide(1, 0);
		
	}
	
	@Test
	public void testHamcrest() {
//		assertTrue((40 > 30) && (40 < 50));
		assertThat(40, allOf(greaterThan(30), lessThan(50)));
	}
}
