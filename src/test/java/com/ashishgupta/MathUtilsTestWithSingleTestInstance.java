/**
 * 
 */
package com.ashishgupta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

/**
 * @author Ashish Gupta
 *@TestInstance(Lifecycle.PER_CLASS) will make sure only one instance of class is created
 *and if only one instance of class is created no need to create static method for before all lifecycle method
 */
@TestInstance(Lifecycle.PER_CLASS)
class MathUtilsTestWithSingleTestInstance {

private MathUtils obj;
	
	@BeforeAll
	 void init() {
		System.out.println("***  Before All  ***");
	}
	
	@AfterAll
	  void destroy() {
		System.out.println("***  After All  ***");
	}
	
	@BeforeEach
	void beforeEach() {
		obj = new MathUtils();
		System.out.println("***  Before Each  ***");
	}
	
	@AfterEach
	void AfterEach() {
		System.out.println("***  After Each  ***");
	}
	
	@Test
	void testUsingAssertMethod() {
		
		int actual=obj.add(1, 2);
		assertEquals(3, actual,"This method will add 2 number");
	}
	
	@Test
	void testComputedAreaofCircle() {
		assertEquals(314.1592653589793, obj.areaOfCircle(10),"This method will compute area of circle.");
	}

	@Test
	void testAssertThrow() {
		assertThrows(ArithmeticException.class,()->{obj.divide(1, 0);} ,"Divide by zero");
	}

}
