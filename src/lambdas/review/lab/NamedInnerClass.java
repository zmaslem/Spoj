package lambdas.review.lab;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by kawrobel on 2016-04-22.
 */
public class NamedInnerClass {
	public void doTests(){
		 String[] testString = {"one", "two", "three", "four"};
		System.out.printf("Original: ");
		ArrayUtils.printArray(testString);
		Arrays.sort(testString, new StringLengthComparator2());
		System.out.println("After sorting by length: ");
		ArrayUtils.printArray(testString);
		Arrays.sort(testString, new LastLetterComparator2());
		System.out.println("After sorting by last letter: ");
		ArrayUtils.printArray(testString);

	}

	private class StringLengthComparator2 implements Comparator<String> {
		@Override
		public int compare(String o1, String o2) {
			return (o1.length() - o2.length());
		}
	}

	private class LastLetterComparator2 implements Comparator<String>{
		@Override
		public int compare(String o1, String o2) {
			return (o1.charAt(o1.length()-1) - o2.charAt(o2.length()-1));
		}
	}
}
