package com.ashishgupta;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

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
	
	@Test
	@Disabled
	void testDisabled() {
		//fail("Not yet implemented");
		System.out.println("Test disabled.");
	}
	
	
	/**
	 *  test execute only on linux os
	 *  similarly we can execute test based on jre, env prop, variable, OS etc
	 */
	@Test
	@EnabledOnOs(OS.LINUX)
	void testEnable() {
		//fail("Not yet implemented");
		System.out.println("Test disabled.");
	}
	
	/**
	 *  based on assumption test execution will execute
	 *  
	 */
	@Test
	@DisplayName("Based on Assumpion test case will execute")
	void testAssumeThat() {
		//fail("Not yet implemented");
		boolean isServerup= true;
		
		assumeTrue(isServerup);
		MathUtils obj = new MathUtils();
		assertThrows(ArithmeticException.class,()->{obj.divide(1, 0);} ,"Divide by zero");
	}
	
	
	
	
	
}
