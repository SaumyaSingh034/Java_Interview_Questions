package March;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidUserName {
    public static void main(String[] args){
        List<String> userNames = new ArrayList<>();
        userNames.add("saumya@123");
        userNames.add("saumya@123");
        userNames.add("hello test");
        userNames.add("Saumya123");
        validUserNames(userNames);
    }

    private static void validUserNames(List<String> userNames) {
        Set<String> uniqueUserNames = new HashSet<>(userNames);
        List<String> validUserNames = new ArrayList<>();
       // System.out.println(uniqueUserNames);
        for(String user : uniqueUserNames){
            if(user.matches("^[a-zA-Z][a-zA-Z_0-9]{7,29}$")){
                validUserNames.add(user);
                System.out.println("Valid --> "+user);
            }else{
                System.out.println("Invalid --> "+user);
            }
        }
        System.out.println(validUserNames);
    }
}
