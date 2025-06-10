package June;

public class Interview1 {
    public static void main(String[] args){
        int number = 5;
        createDynamicString(number);
    }

    private static void createDynamicString(int number) {
        StringBuilder result = new StringBuilder();
        while(number>0){
            result.append("+");
            --number;
            if(number>0) {
                result.append("-");
                --number;
            }

        }
        System.out.println(result);
    }
}
