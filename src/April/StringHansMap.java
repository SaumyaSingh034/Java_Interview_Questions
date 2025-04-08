package April;

import java.util.HashMap;
import java.util.Map;

public class StringHansMap {

    public static void main(String[] args){
        Map<String, String> stringMap = new HashMap<>();
        //Map<String, int> intMap = new HashMap<>();
        Map<StringBuffer, StringBuffer> stringBugger = new HashMap<>();
        StringBuffer sb = new StringBuffer("Saumya");
        stringBugger.put(sb,sb);
        stringBugger.put(sb,sb);
        stringBugger.put(sb,sb);
        stringBugger.put(sb,sb);
        System.out.println(stringBugger);


        String str = "Saumya";
        StringBuffer sb1 = new StringBuffer("Rahul");
        boolean flag = str.equals("Hello");
        sb1.equals(str);
    }
}
