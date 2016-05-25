package lambdas.basics.exercises;

/**
 * Created by kawrobel on 2016-05-05.
 * IDEA- lets you make a function to test a condition
 * BENEFIT- lets you search collections for entry or entryies that match
 *      a condition, with much less repeated code than without lambdas
 */
@FunctionalInterface
public interface Predicate <T> {
    boolean test(T t);
}
