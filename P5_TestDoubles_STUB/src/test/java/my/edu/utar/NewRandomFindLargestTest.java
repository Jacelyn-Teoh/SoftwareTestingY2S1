package my.edu.utar;

import static org.junit.Assert.*;

import org.junit.Test;

public class NewRandomFindLargestTest {

	@Test
	public void testNRFLv1() {
		int[] fixedNumbers = {1,2,3,4,5};
		int ER = 5;
		
		ArrayGeneratorClass ags = new ArrayGeneratorClass(fixedNumbers);
		NewRandomFindLargest nrfl = new NewRandomFindLargest(ags);
		
		int AR = nrfl.findLargestNumberInRandomArray(5, 8);
		
		assertEquals(ER, AR);
		
	}
	
	@Test
	public void testNRFLv2() {
		int[] fixedNumbers = {1,2,3,4,5,6,75,8,9,107,11,122,13,14,157,16,17,18,19,20};
		int ER = 157;
		
		ArrayGeneratorClass ags = new ArrayGeneratorClass(fixedNumbers);
		NewRandomFindLargest nrfl = new NewRandomFindLargest(ags);
		
		int AR = nrfl.findLargestNumberInRandomArray(20, 8);
		
		assertEquals(ER, AR);
		
	}

	@Test
	public void testNRFLv3() {
		int ER = 7;
	
		NewRandomFindLargest nrfl = new NewRandomFindLargest();
		
		int AR = nrfl.findLargestNumberInRandomArray(5, 8);
		
		assertEquals(ER, AR);
		
	}
	
}
