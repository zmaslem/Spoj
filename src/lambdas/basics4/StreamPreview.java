package lambdas.basics4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamPreview {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "bye", "goodbye");
        String s1 = words.stream()
                         .filter(word -> word.contains("y"))
                         .findFirst()
                         .orElse(null);
        System.out.println(s1);
        String s2 = words.stream()
                         .filter(word -> word.length() > 5)
                         .findFirst()
                         .orElse(null);
        System.out.println(s2);
        String s3 = firstAllMatch(words.stream(), word -> word.contains("o"),
                                                word -> word.length() > 5);
        System.out.println(s3);
        String s4 = firstAnyMatch(words.stream(), word -> word.contains("i"),
                                                word -> word.contains("y"));
        System.out.println(s4);

  }

    public static <T> Predicate<T> allPassPredicate(Predicate<T> ... predicates){
        Predicate<T> result = e -> true;
        for(Predicate<T> predicate : predicates){
            result = result.and(predicate);
        }
        return result;
    }

    public static <T> T firstAllMatch(Stream<T> stream, Predicate<T> ... predicates){
        Predicate<T> predicate = allPassPredicate(predicates);
        return stream.filter(predicate)
                .findFirst()
                .orElse(null);
    }

     public static <T> Predicate<T> anyPassPredicate(Predicate<T> ... predicates){
         Predicate<T> result = e-> true;
         for(Predicate<T> predicate : predicates){
             result = result.or(predicate);
         }
         return result;
     }

    public static <T> T firstAnyMatch(Stream<T> stream, Predicate<T> ... predicates){
        Predicate<T> predicate = anyPassPredicate(predicates);
        return stream.filter(predicate)
                .findFirst()
                .orElse(null);
    }
}
