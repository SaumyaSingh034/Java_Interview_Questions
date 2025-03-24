package March;

public class SumOfIntegerInString {
    public static void main(String[] args){
        String input = "Automation1234testing";
        //Expected output: "automation10testing"
        System.out.println(sumOfIntegerInString(input));
    }

    private static String sumOfIntegerInString(String input) {
      StringBuilder fistWod = new StringBuilder();
      StringBuilder remaining = new StringBuilder();
      int sum = 0;
      boolean numberFound = false;

      for(char ch : input.toLowerCase().toCharArray()){
          if(Character.isDigit(ch)){
              sum += Character.getNumericValue(ch);
              numberFound = true;
          } else{
              if(numberFound) {
                  remaining.append(ch);
              } else{
                  fistWod.append(ch);
              }
          }
      }
      return fistWod.append(sum).append(remaining).toString();
    }
}
