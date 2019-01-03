import java.util.stream.Stream;

public class Lines {

    public static void main(String[] args) {

        String multiline = " \nHello\n World\n !\n ";

        // before Java 8
        for (String line : multiline.split("\n")) {
            System.out.println(line);
        }

        // Java 8+
        Stream.of(multiline.split("\n")).forEach(System.out::println);

        // Java 11+


    }
}