package onJava.chapt15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt15
 * @author: yuanqingtao
 * @date: 2024-11-28 21:08
 **/
public class InputFile2 {
    private String fname;

    public InputFile2(String fname) {
        this.fname = fname;
    }
    public Stream<String> getLines() throws IOException {
        return Files.lines(Paths.get(fname));
    }

    public static void main(String[] args) throws IOException {
        new InputFile2("InputFile2.java").getLines()
                .skip(15)
                .limit(1)
                .forEach(System.out::println);
    }
}
