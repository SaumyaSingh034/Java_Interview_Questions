package May.InterviewQuestions2025;

public class NAB_Round1 {
    public static void main(String[] args){
        String str = "This is a sunny day";
        reverseStringPreservingSpaces(str);
    }

    private static void reverseStringPreservingSpaces(String str) {
        String withoutSpacesString = str.replaceAll(" ","");
        //StringBuilder result = new StringBuilder();
       StringBuilder stringReverse = new StringBuilder(withoutSpacesString);
       stringReverse.reverse();
       for(int i=0;i<str.length();i++){
           if(str.charAt(i) == ' ')
               stringReverse.insert(i, ' ');
       }
       System.out.println(stringReverse);


    }
}
