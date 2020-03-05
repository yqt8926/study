import java.util.ArrayList;
import java.util.List;

public class First {

    public static void main(String[] args) {

        List<String> stringArrayList = new ArrayList<String>();
        List<Integer> integerArrayList = new ArrayList<Integer>();

        Class classStringArrayList = stringArrayList.getClass();
        Class classIntegerArrayList = integerArrayList.getClass();

        System.out.println(classStringArrayList+"------------------"+classIntegerArrayList);
        System.out.println(classStringArrayList.equals(classIntegerArrayList));
//        if(classStringArrayList.equals(classIntegerArrayList)){
//            Log.d("泛型测试","类型相同");
//        }




//        System.out.println("hello world!");
    }
}
