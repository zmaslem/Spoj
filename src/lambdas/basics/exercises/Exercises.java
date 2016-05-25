package lambdas.basics.exercises;

import java.util.Arrays;

/**
 * Created by kawrobel on 2016-04-27.
 * 1. compare method of Comparator should return a negative number if the first entry
 * is less then second, a positive number if the first entry is greater
 * than second, and 0 if they are the same.
 *
 * 2. to print out an array after sorting, do sout(Arrays.asList(array)). If
 * printing an array directly you'll see only memory addresses, but when printing
 * a List, it shows the elements separated by commas. Easier then loop and printing
 * out the elements.
 */
public class Exercises {
    private String[] strings = {"one", "two", "three", "four"};


    public String[] sortByLength(String[] array) {
        Arrays.sort(array, (s1, s2) -> s1.length() - s2.length());
        return array;
    }

    public String[] sortByLengthReverse(String[] array) {
        Arrays.sort(array, (s1, s2) -> s2.length() - s1.length());
        return array;
    }

    public String[] sortAlphabetically(String[] array) {
        Arrays.sort(array, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
        return array;
    }

    public String[] hasE(String[] array) {
        Arrays.sort(array, (s1, s2) -> eChecker(s1, s2));
        return array;
    }

    private int eChecker(String o1, String o2){
        if(o1.contains("e")&&!o2.contains("e"))
            return-1;
        else if(o2.contains("e")&&!o1.contains("e"))
            return 1;
        return 0;
    }

    public String[] hasEStatic(String[] array) {
        Arrays.sort(array, (s1, s2) -> Exercises.eCheckerStatic(s1, s2));
        return array;
    }

    private static int eCheckerStatic(String o1, String o2) {
        if(o1.contains("e")&&!o2.contains("e"))
            return-1;
        else if(o2.contains("e")&&!o1.contains("e"))
            return 1;
        return 0;
    }

    public String betterString(String o1, String o2, TwoStringPredicate lambda){
        if(lambda.lambda(o1, o2))
            return o1;
        else
            return o2;
    }

    public <T> T betterElement(T t1, T t2, TwoElementPredicate lambda){
        if(lambda.lambda(t1, t2))
            return t1;
        else
            return t2;
    }

    public static boolean isLonger(String o1, String o2){
        return o1.length() > o2.length();
    }


}
