package onJava.chapt15;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt15
 * @author: yuanqingtao
 * @date: 2024-11-28 21:23
 **/
public class StreamAreAutoCloseable {
    public static void main(String[] args) throws IOException {
        try (
                Stream<String> in = Files.lines(Paths.get(""));
                PrintWriter outfiles = new PrintWriter("");
        ) {
            System.out.println("shenme都不做也是可以的");
            in.skip(5).limit(1).map(String::toLowerCase).forEach(System.out::println);
        }
    }
}
