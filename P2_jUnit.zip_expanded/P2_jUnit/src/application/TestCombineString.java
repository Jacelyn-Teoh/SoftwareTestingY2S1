package application;

public class TestCombineString {
	public static void main(String[] args) {
		CombineString csp = new CombineString();
		
		String s1 = "This is a good dog for testing purposes is centre";
		String expectedResult = "testing purposes centre";
		
		if (csp.combineStrings(s1,4).equals(expectedResult)) {
			System.out.println("Pass. The expected result is " + expectedResult + " and the actual result is " + csp.combineStrings(s1, 4));
		}
		else
		{
			System.out.println("Fail. The expected result is " + expectedResult + " and the actual result is " + csp.combineStrings(s1, 4));
		}
		
	}

}
