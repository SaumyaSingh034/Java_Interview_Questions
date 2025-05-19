package May;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class AppendCharacters {
    /*
     WAP to get a new array from 2 arrays-

 Output- {a,C,b,D,c,E,d,F,e,t,z}
     */

    public static void main(String[] args){
        char[] s1= {'A','B','C','D','E','t','Z'};
        char[] s2= {'c','d','e','f'};
        createNewArray(s1, s2);
    }

    private static void createNewArray(char[] s1, char[] s2) {
       List<Character> result = new ArrayList<>();
       int maxLength = Math.max(s1.length, s2.length);
       for (int i=0;i<maxLength;i++){
           if(i< s1.length){
               result.add(Character.toLowerCase(s1[i]));
           }
           if(i<s2.length){
               result.add(Character.toUpperCase(s2[i]));
           }
       }
       System.out.println(result);
    }
}
