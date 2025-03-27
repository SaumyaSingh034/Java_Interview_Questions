package March;

import java.util.HashMap;
import java.util.Map;

public class GetMinimumData {
    public static void main(String[] args){
        Map<String, Integer> data = new HashMap<>();
        Integer min = Integer.MAX_VALUE;
        String name = "";
        data.put("Rohit",30);
        data.put("Virat",27);
        data.put("Jadega",25);
        data.put("Ashwin",34);
        data.put("Shuman",31);

        for(String str : data.keySet()){
            if(data.get(str) < min){
                min = data.get(str);
                name = str;
            }
        }
        System.out.println(name+" --> "+min);



    }
}
