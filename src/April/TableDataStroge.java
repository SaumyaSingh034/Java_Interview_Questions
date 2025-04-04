package April;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableDataStroge {
    public static void main(String[] args){
        List<String> dataname = new ArrayList<>();
        dataname.add("Saumya");
        dataname.add("Anshika");
        dataname.add("Joe");
        dataname.add("Harish");
        List<String> designation = new ArrayList<>();
        designation.add("Test Automation Engineer");
        designation.add("Developer");
        designation.add("BA");
        designation.add("PM");

        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("Name",dataname);
        dataMap.put("Designation", designation);
        System.out.println(dataMap);



    }
}
