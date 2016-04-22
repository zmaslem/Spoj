package lambdas;


import java.util.Arrays;

/**
 * Created by kawrobel on 2016-04-22.
 */
public class SeparateClass {
	public static void doTests() {
		String[] testStrings = {"one", "two", "three", "four"};
		System.out.print("Original: ");
		ArrayUtils.printArray(testStrings);
		Arrays.sort(testStrings, new StringLengthComparator());
		System.out.print("After sorting by length: ");
		ArrayUtils.printArray(testStrings);
		Arrays.sort(testStrings, new LastLetterComparator());
		System.out.print("After sorting by last letter: ");
		ArrayUtils.printArray(testStrings);
	}
}
