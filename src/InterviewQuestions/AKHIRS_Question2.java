package InterviewQuestions;


public class AKHIRS_Question2 {
    public static void main(String[] args){
        String str = "saumya23456&*^yu2";
        fetchNumberAndSum(str);
    }

    private static void fetchNumberAndSum(String str) {
        int sum = 0;
        int digit = 0;
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                digit = Character.getNumericValue(c);
                sum += digit;
            }
        }
        System.out.println(sum);
    }




}
