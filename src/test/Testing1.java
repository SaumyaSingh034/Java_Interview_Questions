package test;

public class Testing1 {
    public static void main(String[] args){
        String str = "Today is a sunny day";
      //o/p-->   " yadyn nu s asiya doT"

        reverseStringManipulation(str);
    }

    private static void reverseStringManipulation(String str) {
        StringBuilder result = new StringBuilder();
        for(String s : str.split("\\s+")){
            result.append(s);
        }
        result.reverse();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                result.insert(i,' ');
            }
        }
        System.out.println(result.toString());

    }
}
