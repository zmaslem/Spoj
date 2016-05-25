package lambdas.basics.exercises;

/**
 * Created by kawrobel on 2016-04-29.
 */
@FunctionalInterface
public interface TwoElementPredicate <T>{
    boolean lambda(T t1, T t2);
}
