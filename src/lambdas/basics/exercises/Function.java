package lambdas.basics.exercises;

/**
 * Created by kawrobel on 2016-05-05.
 * IDEA- lets you make a function that takes in a T and returns an R
 * BENEFIT- lets you transform a value or collection of values,
 *      with much less repeated code than without lambdas.
 */
@FunctionalInterface
public interface Function <T, R> {
    R apply(T t);
}
