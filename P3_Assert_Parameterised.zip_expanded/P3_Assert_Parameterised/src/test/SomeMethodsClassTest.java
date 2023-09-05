package test;

import static org.junit.Assert.*;

import org.junit.Test;

import application.SomeMethodsClass;

public class SomeMethodsClassTest {
	
	SomeMethodsClass smc = new SomeMethodsClass();
	
	@Test
	public void testAddSomeStrings() {
		String[] strArray = {"Test", "Design", "Do"};
		String strToAdd = "ing";
		String[] ER = {"Testing", "Designing", "Doing"};
		String[] AR = smc.addSomeStrings(strArray, strToAdd);
		
		assertArrayEquals("Arrays are not equal!!", ER, AR);
		assertNotSame("Arrays are not equal!!", ER, AR);
	}
	
	@Test
	public void testCheckHumanAge50() {
		int age = 50;
		boolean AR = smc.checkHumanAge(age);
		
		assertTrue("Error! should be True.",AR);
	}
	
	@Test
	public void testCheckHumanAgeMinus10() {
		int age = -10;
		boolean AR = smc.checkHumanAge(age);
		
		assertFalse("Error! should be False.",AR);
	}
	
	@Test
	public void testCheckHumanAge200() {
		int age = 200;
		boolean AR = smc.checkHumanAge(age);
		
		assertFalse("Error! should be False.",AR);
	}
	
	@Test
	public void testGetAStringNull() {
		String[] strArray = {"Test", "Software", "Web"};
		int strLength = 20;
		String ER = null;
		String AR = smc.getAString(strArray, strLength);
		
		assertNull("Error! should be null", AR);
		
	}
	
	@Test
	public void testGetAStringNotNull() {
		String[] strArray = {"Test", "Software", "Web"};
		int strLength = 4;
		String ER = "Software";
		String AR = smc.getAString(strArray, strLength);
		
		assertNotNull("Error! should be not null", AR);
		assertEquals("Error! should be equal", ER, AR);
	}
	
	@Test
	public void testGetStringAtPosSame() {
		String[] strArray = {"Test", "Software", "Web"};
		int pos = 1;
		String ER = "Software";
		String AR = smc.getStringAtPos(strArray, pos);
		
		assertSame("reference variables refer to the same object",ER,AR);
		
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testGetStringAtPosNotSame() {
		String[] strArray = {"Test", "Software", "Web"};
		int pos = 17;
		String ER = "Software";
		String AR = smc.getStringAtPos(strArray, pos);
		
		assertNotSame("reference variables not refer to the same object",ER,AR);
		
	}

}
