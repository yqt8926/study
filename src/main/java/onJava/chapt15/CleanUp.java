package onJava.chapt15;

import java.io.FileNotFoundException;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt15
 * @author: yuanqingtao
 * @date: 2024-11-27 22:21
 **/
public class CleanUp {
    public static void main(String[] args) {
            try {
                InputFile in = new InputFile("CleanUp.java");
                try {
                    String s;
                    while ((s = in.getLine() ) != null) ;
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("catch exception in main");
                }finally {
                    in.dispose();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("inputfile constructor failed");
            }
    }
}
