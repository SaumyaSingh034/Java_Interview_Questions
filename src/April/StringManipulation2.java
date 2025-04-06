package April;

public class StringManipulation2 {
    public static void main(String[] args){
        String str1 = "I am a Test Automation Engineer";
        String str = "I am a boy";
        reverseStringpreservingSpaces(str);
        
    }

    private static void reverseStringpreservingSpaces(String str) {
        StringBuilder result = new StringBuilder( str.replaceAll(" ", ""));
        result.reverse();

       char[] ch = str.toCharArray();
       for(int i=0;i<ch.length;i++){
           if(ch[i] ==' '){
               result.insert(i,' ');
           }
       }
        System.out.println(result);
    }
}
