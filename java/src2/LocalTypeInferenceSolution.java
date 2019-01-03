import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LocalTypeInferenceSolution {

    public static void main(String[] args) throws IOException {

        // types
        long neverInitialized; // initial value must be provided when using "var" !
        var number = 5;
        var bitNumber = BigDecimal.ONE;
        var String = "Hello World !";
        var var = true;

        // generic type inference
        var list = new ArrayList<String>();
        list.add("Hello World!");

        // for loop block-variable
        var list2 = new ArrayList< >();
        for (var string : list2) {
            System.out.println(string);
        }

        // foreach, lambda-expression
        list2.forEach((var string) -> System.out.println(string));

        // return type inference
        var path = Paths.get("./java/src2/myfile.txt");
        var lines = Files.lines(path);
        var length = lines.count();
    }

}
