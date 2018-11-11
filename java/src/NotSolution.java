import java.util.stream.Stream;

import static java.util.function.Predicate.not;

public class NotSolution {
    public static void main(String[] args) {

        Stream< String > strings = Stream.of("a", "b", "c");

        strings
                .filter(not(String::isBlank))
                .forEach(System.out::println);

    }
}
