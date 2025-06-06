package main.java.thread.demo01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSleep {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2   );
        for (int i = 0; i < 2; i++) {
            executorService.submit(()->{
                try {
                    Thread.sleep(5000);
                    System.out.println("执行完成");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
