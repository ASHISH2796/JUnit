package com.ashishgupta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		System.out.println("This test ran.");
	}
	
	@Test
	void testUsingAssertMethod() {
		MathUtils obj = new MathUtils();
		int actual=obj.add(1, 2);
		assertEquals(3, actual,"This method will add 2 number");
	}
	
	@Test
	void testComputedAreaofCircle() {
		MathUtils obj = new MathUtils();
		assertEquals(314.1592653589793, obj.areaOfCircle(10),"This method will compute area of circle.");
	}

	@Test
	void testAssertThrow() {
		MathUtils obj = new MathUtils();
		assertThrows(ArithmeticException.class,()->{obj.divide(1, 0);} ,"Divide by zero");
	}
}
