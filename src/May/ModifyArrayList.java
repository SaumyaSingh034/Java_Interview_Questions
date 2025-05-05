package May;

import java.util.ArrayList;
import java.util.List;

public class ModifyArrayList {
    public static void main(String[] args){
        List<String> arrayData = new ArrayList<>();
        arrayData.add("Test1");
        arrayData.add("Test1");
        arrayData.add("Test2");
        arrayData.add("Test3");
        arrayData.add("Test4");
        arrayData.add("Test5");
        arrayData.add("Test6");
        System.out.println(arrayData);
        int index = arrayData.indexOf("Test2");
        arrayData.add(index,"ReplacedTest");
        System.out.println(arrayData);

    }
}
