package Codility;

public class FindShortestChar {
    public static void main(String[] args){
        String str = "adobe";
        getSmallestCombo(str);
        getCombo(str);
    }

    private static void getCombo(String str) {
        String min = null;
        for(int i=0;i<str.length();i++){
            char first = str.charAt(i);
            for(int j = i+1; j<str.length();j++){
                char second = str.charAt(j);
                String combo = ""+first+second;
                if(min == null || combo.compareTo(min) < 0){
                    min = combo;
                }
            }
        }
        System.out.println(min);
    }

    private static void getSmallestCombo(String str) {
        String min = null;
        for(int i=0;i<str.length();i++){
            char first = str.charAt(i);
            for(int j=i+1; j<str.length();j++){
                char second = str.charAt(j);
                String combo = ""+first+second;
                if(min == null || combo.compareTo(min) < 0){
                    min = combo;
                }
            }
        }
        System.out.println(min);
    }
}
