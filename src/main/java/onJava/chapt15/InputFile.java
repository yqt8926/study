package onJava.chapt15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt15
 * @author: yuanqingtao
 * @date: 2024-11-27 21:38
 **/
public class InputFile {
    private BufferedReader in;

    public InputFile(String s) throws Exception {
        try {
            in = new BufferedReader(new FileReader(s));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        } catch (Exception e1) {
            try {
                in.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            throw e1;
        }finally {
            //不要在这里关闭
        }
    }

    public String getLine(){
        String s = null;
        try {
            s = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("in.readLine() failed");
        }
        return s;
    }

    public void dispose(){
        try {
            in.close();
            System.out.println("dispose success");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("in.close() failed");
        }
    }
}
