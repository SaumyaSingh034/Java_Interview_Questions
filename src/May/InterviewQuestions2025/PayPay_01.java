package May.InterviewQuestions2025;

public class PayPay_01 {
    public static void main(String[] args){
        String str = "icodeinpython";
        int[] space = {1,5,7,9};

        customizedStringUsingIndexing(str, space);
    }

    private static void customizedStringUsingIndexing(String str, int[] space) {
        StringBuilder result = new StringBuilder(str);

        for(int i=0;i<space.length;i++){
            result.insert(space[i],' ');
        }
        System.out.println(result);
    }
}
