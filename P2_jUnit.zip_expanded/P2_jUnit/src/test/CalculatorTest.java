package test;

import static org.junit.Assert.*;

import org.junit.Test;

import application.Calculator;

import org.junit.Test;

public class CalculatorTest {
	Calculator cal = new Calculator();
	@Test
	public void testAddTwoNumbers() {
		double number1 = 6;
		double number2 = 4;
		double expectedResult = 10;
		double actualResult = cal.add(number1, number2);
		assertEquals(expectedResult, actualResult,0);
		
	}
	
	//add method with 2 parameter
	@Test
	public void testAddTwoNumbers_() {
		assertTrue(cal.add(2,2)==4);
	}

	//add method with array
	@Test
	public void testAdd2() {
		double[] num = {1,2,3,4,5};
		double expectedResult = 15;
		double actualResult = cal.add(num);
		assertEquals(expectedResult,actualResult,0);
	}
}
