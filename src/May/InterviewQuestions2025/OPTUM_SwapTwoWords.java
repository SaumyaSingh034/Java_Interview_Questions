package May.InterviewQuestions2025;

public class OPTUM_SwapTwoWords {
   public static void main(String[] args){
       String str = "Hello World";
       swapTwoWords(str);
   }

    private static void swapTwoWords(String str) {
       StringBuilder result = new StringBuilder();
       String[] words = str.split("\\s+");
       for(int i = words.length-1;i>=0;i--){
           result.append(words[i]).append(" ");
       }
       System.out.println(result.toString().trim());
    }
}
