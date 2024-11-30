package onJava.chapt15;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt15
 * @author: yuanqingtao
 * @date: 2024-11-28 21:15
 **/
public class TryWithResource {
    public static void main(String[] args) {
        try (InputStream in = new FileInputStream(new File("")) ) {
            int contents = in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
