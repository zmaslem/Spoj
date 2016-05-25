package lambdas.review.lab;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by kawrobel on 2016-04-22.
 */
public class MainAppImplementsInterface implements Comparator<String> {
	public void doTests(){
		String[] testStrings = {"one", "two", "three", "four"};
		System.out.println("Original: ");
		ArrayUtils.printArray(testStrings);
		Arrays.sort(testStrings, this);
		System.out.println("After sorting by length");
		ArrayUtils.printArray(testStrings);
		System.out.println("NO sorting by last letter");
	}


	@Override
	public int compare(String o1, String o2) {
		return (o1.length() - o2.length());
	}
}
