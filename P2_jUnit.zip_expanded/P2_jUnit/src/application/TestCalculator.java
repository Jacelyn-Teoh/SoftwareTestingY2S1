package application;

public class TestCalculator {
	public static void main(String[] args){
		//double result=0;
		
		Calculator cal = new Calculator();
		
		double numberA = 6;
		double numberB = 4;
		double expectedResult = 10;
		
		if (cal.add(numberA, numberB)==expectedResult) {
			System.out.println("Add result Pass. The expected result is" + expectedResult);
		}
		else
		{
			System.out.println("Add result Fail. The expected result is" + expectedResult);
		}
		
		//Test Add method
		double[] num = {1,2,3,4,5,};
		double expectedResultAdd = 15;
		
		if (cal.add(num) == expectedResultAdd) {
			System.out.println("Add result Pass. The expected result is" + expectedResult);
		}
		else {
			System.out.println("Add result Pass. The expected result is" + expectedResult);
		}
		
			
		// Test the Subtract method here
		
		
		// Test the Multiply method here
		
		
		// Test the Divide method here
	}
}
