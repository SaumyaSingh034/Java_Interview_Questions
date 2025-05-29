package MockCodility;

import java.util.*;

public class CountEmployees {
    public static void main(String[] args){
        List<String> departments = Arrays.asList("HR", "IT", "HR", "Finance", "IT", "HR");
        countEmployeesPerDepartment(departments);
    }

    private static void countEmployeesPerDepartment(List<String> departments) {
        Map<String, Integer> dataMap = new LinkedHashMap<>();
        for(String s : departments){
            dataMap.put(s, dataMap.getOrDefault(s,0)+1);
        }

        for(Map.Entry<String, Integer> data : dataMap.entrySet()){
            System.out.println(data.getKey()+": "+data.getValue());
        }
    }
}
