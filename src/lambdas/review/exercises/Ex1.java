package lambdas.review.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by kawrobel on 2016-04-25.
 * 1. compare method of Comparator should return a negative number if the first entry
 * is less then second, a positive number if the first entry is greater
 * than second, and 0 if they are the same.
 *
 * 2. to print out an array after sorting, do sout(Arrays.asList(array)). If
 * printing an array directly you'll see only memory addresses, but when printing
 * a List, it shows the elements separated by commas. Easier then loop and printing
 * out the elements.
 */

public class Ex1 {

	public <T> T lastEntry(List<T> list){
		if (list.size() < 1)
			return null;
		return list.get(list.size()-1);
	}

	public <T> T lastEntry(T[] array){
		if(array.length < 1)
			return null;
		return array[array.length - 1];
	}

	public String[] sortByLength(String[] strings){
		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
			    return o2.length() - o1.length();
			}
		});
		return strings;
	}


    public String[] sortByReverseLength(String[] strings){
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        return strings;
    }


    public String[] sortAlphabetically(String[] strings){
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(0) - o2.charAt(0);
            }
        });
        return strings;
    }


    public String[] sortHasE(String[] strings){
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.contains("e") && !o2.contains("e"))
                    return -1;
                else if(o2.contains("e") && !o1.contains("e"))
                    return 1;
                else
                    return 0;
            }
        });
        return strings;
    }

    public String[] sortHasEStaticMethod(String[] strings){
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return eChecker(o1, o2);
            }
        });
        return strings;
    }

    private static int eChecker(String o1, String o2) {
        if(o1.contains("e") && !o2.contains("e"))
            return -1;
        else if(o2.contains("e") && !o1.contains("e"))
            return 1;
        return 0;
    }
}
