package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class EPAM_CheckUsername {
    public static void main(String[] args){
        //String str = "Saumya@299";
        String str1 = "Saumya";
        String str2= "Saumya299";
        String str3 = "Saumya    299";
        //checkUserName(str);
        checkUserName(str1);
//        checkUserName(str2);
//        checkUserName(str3);
    }

    private static void checkUserName(String str) {
        List<String> userNameList = new ArrayList<>();
        if(validUsername(str)){
            userNameList.add(str);
            System.out.println("Valid User Name : "+str);
        }else{
            System.out.println("Invalid UserName : "+str);
        }
    }

    private static boolean validUsername(String str) {
        return str.toLowerCase().matches("[^a-z0-9]");
    }
}
