package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserName {
    public static void main(String[] args){
        String str1 = "Saumya@299";
        String str2 = "Saumya299";
        System.out.println(validUserName(str1));
    }

    private static boolean validUserName(String str) {
        //Write a program to validate usernames (alphanumeric, no spaces/special characters, no duplicates
        Pattern p = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(str);
        return m.find();
    }
}
