package lambdas.review.lab;

import java.util.Random;

/**
 * Created by kawrobel on 2016-04-25.
 */
public class RandomUtils {
	private static Random r = new Random();

	public static int randomInt(int range)
	{
		return r.nextInt(range);
	}

	public static int randomIndex(Object[] array){
		return randomInt(array.length);
	}

	public static <T> T randomElement(T[] array){
		return array[randomIndex(array)];
	}
}
