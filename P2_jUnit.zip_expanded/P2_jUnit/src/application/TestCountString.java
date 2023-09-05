package application;

public class TestCountString {

	public static void main(String[] args) {
		CountString rwp = new CountString();
		String words = "The dog is a very funny dog if it is here";
		String strfind = "very"; //expectedResult = 1
		int expectedResult = 1;
		
		if(rwp.countWordInString(words, strfind) == expectedResult) {
			System.out.println("Pass. The expected result is " + expectedResult + " and the actual result is " + rwp.countWordInString(words, strfind));
		}
		else
		{
			System.out.println("Pass. The expected result is " + expectedResult + " and the actual result is " + rwp.countWordInString(words, strfind));
		}

	}

}
