package test;

import static org.junit.Assert.*;

import org.junit.Test;

import application.CombineString;

public class CombineStringTest {

	@Test
	public void testCombine() {
		CombineString csp = new CombineString();
		String s1 = "This is a good dog for testing purposes in centre";
		assertEquals("testing purposes centre", csp.combineStrings(s1,4));
	}

}
