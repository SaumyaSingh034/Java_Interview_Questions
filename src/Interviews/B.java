package Interviews;

import java.util.HashMap;
import java.util.Map;

public class B extends  A{
    public void display(){
        System.out.println("I am from B");
    }

    public static void main(String[] args){
        A a = new B();
        a.display();

        Map<String, Integer> dataMap = new HashMap<>();

        dataMap.put("Saumya", 1);
        dataMap.put("Deepak", 3);
        dataMap.put("Raj", 4);
        dataMap.put("James", 5);

        System.out.println(dataMap);
        for(Map.Entry data : dataMap.entrySet()){
            System.out.println(data.getKey()+" ---> "+data.getValue());
        }

    }
}
