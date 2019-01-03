import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LocalTypeInference {

    public static void main(String[] args) throws IOException {

        // types
        long neverInitialized;
        int number = 5;
        BigDecimal bitNumber = BigDecimal.ONE;
        String String = "Hello World !";
        Boolean var = true;

        // generic type inference
        List<String> list = new ArrayList<>();
        list.add("Hello World!");

        // for loop block-variable
        List<String> list2 = new ArrayList< >();
        for (String string : list2) {
            System.out.println(string);
        }

        // foreach, lambda-expression
        list2.forEach((String string) -> System.out.println(string));

        // return type inference
        Path path = Paths.get("./java/src2/myfile.txt");
        Stream<String> lines = Files.lines(path);
        long length = lines.count();

    }

}
