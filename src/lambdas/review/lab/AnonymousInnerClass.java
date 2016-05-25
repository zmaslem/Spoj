package lambdas.review.lab;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by kawrobel on 2016-04-25.
 */
public class AnonymousInnerClass {
	public void doTests()
	{
		String[] testStrings={"one", "two", "three", "four"};
		System.out.println("Ofiginal: ");
		ArrayUtils.printArray(testStrings);
		Arrays.sort(testStrings, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2){
				return o2.length() - o1.length();
			}
		});
		System.out.println("After sorting by length: ");
		ArrayUtils.printArray(testStrings);
		Arrays.sort(testStrings, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2){
				return o1.charAt(o1.length()-1) - o2.charAt(o2.length() -1);
			}
		});
		System.out.println("After sorting by last letter: ");
		ArrayUtils.printArray(testStrings);
	}
}
