package lambdas.review.test;

import lambdas.review.exercises.Ex1;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kawrobel on 2016-04-26.
 */
public class Ex1Test {
    Ex1 ex1 = new Ex1();
    @Test
    public void testLastEntryNonEmptyList() throws Exception {
        String[] testStrings = {"one", "two", "three", "four"};
        List<String> testList = Arrays.asList(testStrings);
        Assert.assertEquals("Result list: ", "four", ex1.lastEntry(testList));
    }

    @Test
    public void testLastEntryEmptyList() throws Exception{
        String[] testStrings = {};
        List<String> testList = Arrays.asList(testStrings);
        Assert.assertEquals("Result list: ", null, ex1.lastEntry(testList));
    }

    @Test
    public void testLastEntryOneElementList() throws Exception{
        String[] testStrings = {"one"};
        List<String> testList = Arrays.asList(testStrings);
        Assert.assertEquals("Result list: ", "one", ex1.lastEntry(testList));
    }

    @Test
    public void testLastEntryNonEmptyArray() throws Exception {
        String[] testStrings = {"one", "two", "three", "four"};
        Assert.assertEquals("Result array: ", "four", ex1.lastEntry(testStrings));
    }

    @Test
    public void testLastEntryEmptyArray() throws Exception{
        String[] testStrings = {};
        Assert.assertEquals("Result array: ", null, ex1.lastEntry(testStrings));
    }

    @Test
    public void testLastEntryOneElementArray() throws Exception{
        String[] testStrings = {"one"};
        Assert.assertEquals("Result array: ", "one", ex1.lastEntry(testStrings));
    }

    @Test
    public void testSortByLength() throws Exception{
        String[] testStrings = {"one", "two", "three", "four"};
        String[] resultStrings = {"three", "four", "one", "two"};
        Assert.assertArrayEquals("Result: ", resultStrings, ex1.sortByLength(testStrings));
    }

    @Test
    public void testSortByLengthEmptyList() throws Exception{
        String[] testStrings = {};
        String[] resultStrings = {};
        Assert.assertArrayEquals("Result: ", resultStrings, ex1.sortByReverseLength(testStrings));
    }

    @Test
    public void testSortByReverseLength() throws Exception{
        String[] testStrings = {"one", "two", "three", "four"};
        String[] resultStrings = {"one", "two", "four", "three"};
        Assert.assertArrayEquals("Result: ", resultStrings, ex1.sortByReverseLength(testStrings));
    }

    @Test
    public void testSortByReverseLengthEmptyList() throws Exception{
        String[] testStrings = {};
        String[] resultStrings = {};
        Assert.assertArrayEquals("Result: ", resultStrings, ex1.sortByReverseLength(testStrings));
    }

    @Test
    public void testSortAlphabetically() throws Exception{
        String[] testStrings = {"one", "two", "three", "four"};
        String[] resultStrings = {"four", "one", "two", "three"};
        Assert.assertArrayEquals("Result: ", resultStrings, ex1.sortAlphabetically(testStrings));
    }

    @Test
    public void testSortAlphabeticallyEmptyList() throws Exception {
        String[] testStrings = {};
        String[] resultStrings= {};
        Assert.assertArrayEquals("Result: ", resultStrings, ex1.sortAlphabetically(testStrings));
    }

    @Test
    public void testHasE() throws Exception{
        String[] testStrings = {"one", "two", "three", "four"};
        String[] resultStrings = {"one", "three", "two", "four"};
        Assert.assertArrayEquals("Result: ", resultStrings, ex1.sortHasE(testStrings));
    }

    @Test
    public void testHasEEmptyList() throws Exception{
        String[] testString = {};
        String[] resultStrings = {};
        Assert.assertArrayEquals("Result: ", resultStrings, ex1.sortHasE(testString));
    }

    @Test
    public void testHasEStaticMethod() throws Exception{
        String[] testStrings = {"one", "two", "three", "four"};
        String[] resultStrings = {"one", "three", "two", "four"};
        Assert.assertArrayEquals("Result: ", resultStrings, ex1.sortHasEStaticMethod(testStrings));
    }


    @Test
    public void testHasEEmptyListStaticMethod() throws Exception{
        String[] testString = {};
        String[] resultStrings = {};
        Assert.assertArrayEquals("Result: ", resultStrings, ex1.sortHasEStaticMethod(testString));
    }
}