package test;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import application.VariousMethodsClass;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class VariousMethodsClassTest {
	
	VariousMethodsClass vmc = new VariousMethodsClass();

	//1st approach
	@Test
	@Parameters({"2, 5, 7", "1, 1, 2", "2, 3, 5"})
	public void testAddTwoNumbers(int a, int b, int ER) {
		int AR = vmc.addTwoNumbers(a, b);
		assertEquals("Same result!", ER, AR);
	}
	
	//2nd approach
	private Object[] getTwoIntegers(){
		return new Object[] {
				new Object[] {"2", "5", "7"},
				new Object[] {"1", "1", "2"},
				new Object[] {"2", "3", "5"}
				
		};
	}
	@Test
	@Parameters(method = "getTwoIntegers")
	public void testAddTwoNumbers2(int a, int b, int ER) {
		int AR = vmc.addTwoNumbers(a, b);
		assertEquals("Same result!", ER, AR);
	}
	
	//1st approach
	@Test
	@Parameters({"canary, a, 2", "pigeon, p, 1", "zoo, o, 2"})
	public void testCountWordInString(String words, String strFind, int ER) {
		int AR = vmc.countWordInString(words, strFind);
		assertEquals("Same result!", ER, AR);
	}
	
	//2nd approach
	private String[][] getWordToCount(){
		return new String[][] {
				{"canary", "a", "2"},
				{"pigeon", "p", "1"},
				{"zoo", "o", "2"}
				
		};
	}
	@Test
	@Parameters(method = "getWordToCount")
	public void testCountWordInString2(String words, String strFind, int ER) {
		int AR = vmc.countWordInString(words, strFind);
		assertEquals("Same result!", ER, AR);
	}
	
	//1st approach
	@Test
	@Parameters({"Eh I am tired, 2, tired"})
	public void testCombineStrings(String words, int x, String ER) {
		String AR = vmc.combineStrings(words, x);
		assertEquals("Same result!", ER, AR);
	}
	
	//2nd approach
		private String[][] getWord(){
			return new String[][] {
					{"Eh I am tired", "2", "tired"},
					{"I am hungry", "2", "hungry"}
			};
		}
		@Test
		@Parameters(method = "getWord")
		public void testCombineStrings2(String words, int x, String ER) {
			String AR = vmc.combineStrings(words, x);
			assertEquals("Same result!", ER, AR);
		}
		
	//2nd approach
		private Object[] getBigNum(){
			return new Object[] {
					new Object[] {new int[] {1,2,3,4,5},5},
					new Object[] {new int[] {4,5,6,7,8},8}
			};
		}
		@Test
		@Parameters(method = "getBigNum")
		public void testFindLargestNumber(int[] numArray, int ER) {
			int AR = vmc.findLargestNumber(numArray);
			assertEquals("Same result!", ER, AR);
		}
		
		//2nd approach
		private Object[] getAverage(){
			return new Object[] {
					new Object[] {new String[] {"apple", "paple", "baple"}, 3, 5.0},
			};
		}
		@Test
		@Parameters(method = "getAverage")
		public void testAverageStringLength(String[] strArray, int x, double ER) {
			double AR = vmc.averageStringLength(strArray, x);
			assertEquals("Same result!", ER, AR,0.05);
		}
		

}
