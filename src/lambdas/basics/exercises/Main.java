package lambdas.basics.exercises;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kawrobel on 2016-05-10.
 */
public class Main {
    public static void main(String[] args){
        List<String> shortWords = LambdaEx3.allMatches(Arrays.asList(Employee.names), s->s.length() < 5);
        System.out.println(shortWords);
    }

}
