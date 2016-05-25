package lambdas.basics.test;

import lambdas.basics.exercises.Exercises;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kawrobel on 2016-04-27.
 */
public class ExcercisesTest {
    Exercises exercises = new Exercises();
    private String[] strings = {"one", "two", "three", "four"};

    @Test
    public void testSortByLength(){
        String[] result = {"one", "two", "four", "three"};
        Assert.assertArrayEquals("Result: ", result, exercises.sortByLength(strings));
    }

    @Test
    public void testSortByLengthEmpty(){
        String[] result = {};
        String[] test = {};
        Assert.assertArrayEquals("Result: ", result, exercises.sortByLength(test));
    }

    @Test
    public void testSortByLengthReverse(){
        String[] result = {"three", "four", "one", "two"};
        Assert.assertArrayEquals("Result: ", result, exercises.sortByLengthReverse(strings));
    }

    @Test
    public void testSortByLengthReverseEmpty(){
        String[] result = {};
        String[] test = {};
        Assert.assertArrayEquals("Result: ", result, exercises.sortByLengthReverse(test));
    }

    @Test
    public void testSortAlphabetically(){
        String[] result = {"four", "one", "two", "three"};
        Assert.assertArrayEquals("Result: ", result, exercises.sortAlphabetically(strings));
    }

    @Test
    public void testSortAlphabeticallyEmpty(){
        String[] result = {};
        String[] test = {};
        Assert.assertArrayEquals("Result: ", result, exercises.sortAlphabetically(test));
    }

    @Test
    public void testHasE(){
        String[] result = {"one", "three", "two", "four"};
        Assert.assertArrayEquals("Result: ", result, exercises.hasE(strings));
    }

    @Test
    public void testHasEEmpty(){
        String[] result = {};
        String[] test = {};
        Assert.assertArrayEquals("Result: ", result, exercises.hasE(test));
    }

    @Test
    public void testHasEStatic(){
        String[] result = {"one", "three", "two", "four"};
        Assert.assertArrayEquals("Result: ", result, exercises.hasEStatic(strings));
    }

    @Test
    public void testHasEStaticEmpty() {
        String[] result = {};
        String[] test = {};
        Assert.assertArrayEquals("Result: ", result, exercises.hasEStatic(test));
    }

    @Test
    public void testBetterStringLengthFirstLonger(){
        String o1 = "three";
        String o2 = "two";
        Assert.assertEquals("Result: ", "three", exercises.betterString(o1, o2, (s1, s2) -> o1.length() > o2.length()));
    }

    @Test
    public void testBetterStringLengthFirstLonger2(){
        String o1 = "three";
        String o2 = "two";
        Assert.assertEquals("Result: ", "three", exercises.betterString(o1, o2, (s1, s2) -> Exercises.isLonger(o1, o2)));
    }

    @Test
    public void testBetterStringLengthFirstLongerMethodRef(){
        String o1 = "three";
        String o2 = "two";
        Assert.assertEquals("Result: ", "three", exercises.betterString(o1, o2, Exercises::isLonger));
    }

}