package May;

public class CapitalizeString {
    public static void main(String[] args){
        String str = "java automation engineer";
       StringBuilder result = new StringBuilder();
       for(String s : str.split("\\s+")){
           result.append(s.substring(0, 1).toUpperCase())
                   .append(s.substring(1).toLowerCase()).append(" ");
       }
       System.out.println(result);
    }
}
