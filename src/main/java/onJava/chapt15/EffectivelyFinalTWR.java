package onJava.chapt15;

import java.io.*;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt15
 * @author: yuanqingtao
 * @date: 2024-11-30 14:41
 **/
public class EffectivelyFinalTWR {
    static void old() {
        try (InputStream rl = new FileInputStream(new File(""));
             InputStream r2 = new FileInputStream(new File(""))) {
            rl.read();
            r2.read();
        } catch (IOException e) {
            //
            System.out.println(e);
        }
    }

//    static void jdk9() throws FileNotFoundException {
//        final InputStream r1 = new FileInputStream(new File(""));
//        final InputStream r2 = new FileInputStream(new File(""));
//        try (r1; r2) {
//            r1.read();
//            r2.read();
//        }
//        r1.read();
//        r2.read();
//        }
}
