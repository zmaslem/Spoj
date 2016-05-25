package lambdas.basics.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kawrobel on 2016-05-10.
 */
public class LambdaEx3 <T, R>{
    public static <T> List allMatches(List<T> list, java.util.function.Predicate<T> predicate){
        List<T> newList = new ArrayList<>();
        for(T word : list){
            if(predicate.test(word)){
                newList.add(word);
            }
        }
        return newList;
    }

    public static <T> List transformedList(List<T> list, Function<T, T> function){
        List<T> newList = new ArrayList<>();
        for(T word : list){
            newList.add(function.apply(word));
        }
        return newList;
    }
}
