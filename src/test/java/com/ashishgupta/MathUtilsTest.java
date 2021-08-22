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
		assertEquals(3, actual);
	}

}
