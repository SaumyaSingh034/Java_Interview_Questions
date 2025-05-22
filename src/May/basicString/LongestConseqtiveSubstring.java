package May.basicString;

public class LongestConseqtiveSubstring {
    public static void main(String[] args){
        String str = "baaabbabbb";
        longestValidSubstring3(str);
    }

    private static int longestValidSubstring3(String s) {
      if(s==null || s.length() == 0)
          return 0;
      int maxLength = 0;
      int start = 0;
      int count = 1;

      for(int i=1;i<s.length();i++){
          if(s.charAt(i) == s.charAt(i-1)){
              count++;
          }else {
              count = 1;
          }

          if(count == 3){
              maxLength = Math.max(maxLength, i-start);
              start = i-1;
              count = 2;
          }
      }

return 0;
    }
}
