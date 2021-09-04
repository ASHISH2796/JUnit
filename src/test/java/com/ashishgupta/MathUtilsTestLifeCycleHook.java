package com.ashishgupta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MathUtilsTestLifeCycleHook {
	
	private MathUtils obj;
	
	@BeforeAll
	 static void init() {
		System.out.println("***  Before All  ***");
	}
	
	@AfterAll
	 static void destroy() {
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

	
	/**
	 * will execute multiple test case for multiple method using assertAll method 
	 * it will make sure if any assert statement failed it will still execute remaining statement from the list
	 */
	@Test
	@DisplayName("This method will test multiple test case for multiple method")
	void testMultiply() {
		assertAll(
				()->assertEquals(10,obj.mulitply(2, 0),"This method will multiple 2 with 0"), //will failed
				()->assertEquals(10,obj.mulitply(2, 5),"This method will multiple 2 with 5"),
				()->assertEquals(0,obj.mulitply(0, 10),"This method will multiple 0 with 10"),
				()->assertEquals(30,obj.mulitply(2, -15),"This method will multiple 2 with -15") //will failed
				);
	}
	
	@Nested
	@DisplayName("to Add two number")
	class AddTestCase {
		@Test
		@DisplayName("postive number")
		void addPositive() {
			assertEquals(3, obj.add(1, 2),"This method will add 2 positive  number");
		}
		
		@Test
		@DisplayName("negative number")
		void addNegative() {
			assertEquals(-3, obj.add(-1, -2),"This method will add 2 negative  number");
		}
	}
}
