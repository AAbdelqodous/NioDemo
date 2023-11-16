package nio;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ReadFileLineByLine {
    private static final String vowels = "aeiouAEIOU";
    public static void main(String[] args) throws IOException {
        var vCount =
            Files.lines(Paths.get("verse.txt"))
                    .flatMap(line -> Arrays.stream( line.split("")))
                    .filter( c -> vowels.contains(c))
                    .count();

                /* Files.lines( Paths.get("verse.txt"))
                        .flatMap( line -> Arrays.stream( line.split("")))
                        .filter(vowels::contains)
                        .forEach(System.out::println); */
    }
}
