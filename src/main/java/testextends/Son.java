package testextends;

/**
 * @version V1.0.0
 * @description:
 * @packagename: testextends
 * @author: yuanqingtao
 * @date: 2024-11-21 22:45
 **/
public class Son extends Father {

    private String third;

    public Son(String first, String second) {
        super(first, second);
    }

    public Son(String first, String second, String third) {
        super(first, second);
        this.third = third;
    }
}
