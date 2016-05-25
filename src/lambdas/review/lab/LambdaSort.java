package lambdas.review.lab;

import java.util.Arrays;

/**
 * Created by kawrobel on 2016-04-25.
 */
public class LambdaSort {
	public void doTest(){
		String[] testStrings={"one", "two", "three", "four"};
		System.out.println("Ofiginal: ");
		ArrayUtils.printArray(testStrings);
		Arrays.sort(testStrings, (o1, o2) -> o1.length() - o2.length());
		System.out.println("After sorting by length: ");
		ArrayUtils.printArray(testStrings);
	}
}
