package junit.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import junit.testing.junit.MyMath;

class MyMathTest {
	MyMath myMath = new MyMath();
	
	@After		//After Every Test CAse
	public void after() {
		System.out.println("After");
	}
	@Before    // Before Every Test CAse
	public void before() {
		System.out.println("Before");
	}
	
	
	@AfterClass// After Every Test Class
	@Test
	void sum_with_3numbers() {
		System.out.println("Test1");
		assertEquals(6, myMath.sum(new int[] {1,2,3})); // Compares the actual and outcome result
		System.out.println(myMath.sum(new int[] {1,2,3}));
	}

	@Test
	void sum_with_1numbers() {
		System.out.println("Test2");
		assertEquals(3, myMath.sum(new int[] {3})); // Compares the actual and outcome result
		System.out.println(myMath.sum(new int[] {3}));
	}
	
}
  