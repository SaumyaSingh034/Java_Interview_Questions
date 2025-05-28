package Codility;

public class ValidPassWord {
    public static void main(String[] args){
        String str = "test 5 a0A pass007 ?xy1";
        checkTheValidPassword(str);
    }

    private static int checkTheValidPassword(String str) {
        String[] words = str.split("\\s+");
        int maxLength = -1;
        for(String word : words){
          if(isAlphanumeric(word)){
              int letterCount = 0;
              int digitCount = 0;
              for(char c : word.toCharArray()){
                  if(Character.isLetter(c))
                      letterCount++;
                  else if (Character.isDigit(c)) {
                      digitCount++;
                  }
              }
              if(letterCount % 2 ==0  && digitCount%2==1)
                  maxLength = Math.max(maxLength, word.length());
          }
        }
        return maxLength;
    }

    private static boolean isAlphanumeric(String word) {
        for(char c : word.toCharArray()) {
            if (!Character.isLetterOrDigit(c))
                return false;
        }
            return true;
    }
}
