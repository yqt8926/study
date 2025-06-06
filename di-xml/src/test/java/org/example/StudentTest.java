package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.Date;

public class StudentTest extends TestCase {
    @Test
    public void testStudent() {
        String resource = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
//        Student student = (Student) ac.getBean("myStudent");
//        System.out.println(student);
//        System.out.println(student.getName());
//        System.out.println(student.getAge());
//        Date myDate = (Date) ac.getBean("myDate");
//        System.out.println(myDate);
        File myFile = (File) ac.getBean("myFile");
        System.out.println(myFile.getAbsolutePath());
        System.out.println(myFile.getName());
    }

    @Test
    public void test04() {
        String resource = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        Student student = (Student) ac.getBean("myStudent");
        System.out.println(student);
    }

    @Test
    public void test05() {
        String resource = "applicationContext2.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        Student student = (Student) ac.getBean("myStudent");
        System.out.println(student);
    }

    @Test
    public void test06() {
        String resource1 = "services.xml";
        String resource2 = "dao.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource1,resource2);
        Student student = (Student) ac.getBean(Student.class);
//        ac.getAutowireCapableBeanFactory().autowireBean(student);
        System.out.println(student);
    }

    @Test
    public void test07() {
        // 创建线程
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000*20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
         System.out.println(thread.getState());
    }



}