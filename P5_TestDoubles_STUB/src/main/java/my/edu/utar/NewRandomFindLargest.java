package my.edu.utar;

import java.util.Random;

//#1:
interface RandomNumberFunctionalityFLN{
	public int getRandomInteger(int numLimit);
}

//#2: Ori DOC
class NewRandomGeneratorClassV1 implements RandomNumberFunctionalityFLN {

	Random randomGenerator = new Random();
	
	public int getRandomInteger(int numLimit) {
		int randomInt = randomGenerator.nextInt(numLimit);
		return randomInt;
	}
}

//#3: Test Double = STUB
class ArrayGeneratorClass implements RandomNumberFunctionalityFLN{
	
	int[] fixedNumbers;
	int index = 0;
	
	public ArrayGeneratorClass(int[] fixedNumbers) {
		this.fixedNumbers = fixedNumbers;
	}

	public int getRandomInteger(int numLimit) {
		int numToReturn = fixedNumbers[index];
		index++;
			return numToReturn;
	}
}


//#4: SUT
public class NewRandomFindLargest {
	RandomNumberFunctionalityFLN rnf;
	
	public NewRandomFindLargest() {
		rnf = new NewRandomGeneratorClassV1();
	}
	
	public NewRandomFindLargest(RandomNumberFunctionalityFLN rnf) {
		this.rnf = rnf;
	}

	//MUT
	public int findLargestNumberInRandomArray(int arrLength, int numLimit) {

		// first create an integer array of the desired size
		// then populate array with random integers

		int[] numArray = new int[arrLength];//5
		/**
		 * [0] - 0-3
		 * [1] - 0-3
		 * [2] - 0-3
		 * [3] - 0-3
		 * [4] - 0-3
		 */
		System.out.println();
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = rnf.getRandomInteger(numLimit);//4 = random 0-3
			System.out.println("numArray[" + i + "] = " + numArray[i]);
		}

		// then go through this array to find the largest number

		int bigNum = numArray[0];
		for (int i = 0; i < numArray.length; i++)
			if (bigNum < numArray[i])
				bigNum = numArray[i];
		return bigNum;
	}

}
