import java.util.stream.Stream;

public class Not {
    public static void main(String[] args) {

        Stream<String> strings = Stream.of("a", "b", "c");

        strings
                .filter(string -> !string.isBlank())
                .forEach(System.out::println);

    }
}
