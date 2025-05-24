package InterviewQuestions;

public class IRIS_Question2 {
    public static void main(String[] args){
        String str = "010100010110110";
        shiftZeroToLeft(str);
    }

    private static void shiftZeroToLeft(String str) {
        StringBuilder zero = new StringBuilder();
        StringBuilder nonZero = new StringBuilder();

        for(char c : str.toCharArray()){
            if(c == '0')
                zero.append(c);
            else
                nonZero.append(c);
        }

        System.out.println(zero.append(nonZero));
    }
}
