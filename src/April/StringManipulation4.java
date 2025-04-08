package April;

import java.util.ArrayList;
import java.util.List;

public class StringManipulation4 {
    public static void main(String[] args){
        String input = "abc-2019";
        int i = 9;
        int j = 9;

        stringManipulation4(input);
    }

    private static void stringManipulation4(String input) {
        StringBuilder stringData = new StringBuilder();
        StringBuilder digitData = new StringBuilder();
        stringData.append("[");
        digitData.append("[");
        for(char c : input.toCharArray()){
            if(Character.isAlphabetic(c))
                stringData.append(c);
            else if (Character.isDigit(c)) {
                digitData.append(c);

            }
        }
        stringData.append("]");
        digitData.append("]");
        System.out.println(stringData);
        System.out.println(digitData);
    }
}
