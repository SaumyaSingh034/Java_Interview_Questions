package March;

import java.util.HashMap;
import java.util.Map;

public class StringHashMapChaching {
    public static void main(String[] args){
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        map1.put("value", 25);
        map2=map1;
        System.out.println(map1);
        System.out.println(map2);

        map1.put("value", 42);
        System.out.println(map1);
        System.out.println(map2);

    }
}
