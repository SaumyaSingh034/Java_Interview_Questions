package RestAssuredPayload;

import java.util.HashMap;
import java.util.Map;

public class MapPayloadCreation {
    public static void main(String[] args){
        Map<String, String> data = new HashMap<>();
        data.put("Saumya", "Test Automation Engineer");
        data.put("Rahul", "Senior Cloud Admin Engineer");
        data.put("Nandini", "Senior Software Quality Engineer");

        System.out.println(data);
    }
}
