package main.java.nitial;

public class TestNotNull {
    public static void main(String[] args) {
        TestNotNull test = new TestNotNull();
        test.process(null);
    }


    public void process( String input) {
        System.out.println(input);
        System.out.println(input.length());
    }

}
