package org.example.configfile;

import org.jetbrains.annotations.NotNull;

public class TestAnnotation {
    public static void main(String[] args) {
        TestAnnotation test = new TestAnnotation();
        test.process(null);
    }


    public void process(@NotNull String input) {
        System.out.println(input);
//        System.out.println(input.length());
    }
}
