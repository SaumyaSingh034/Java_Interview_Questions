package April;

public class StringLargestSmallest {
    public static void main(String[] args){
        String str = "Java is Beautiful programming";
        reverseSmallestLargest(str);
    }

    private static void reverseSmallestLargest(String str) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        String minWord = "";
        String maxWord = "";
        StringBuilder result = new StringBuilder();


        for(String s : str.split("\\s+")){
            StringBuilder reverseWords;
            if(s.length()<min){
                min = s.length();
                minWord = s;
            } else if (s.length() > max) {
                max = s.length();
                maxWord = s;

            }
        }

        for(String s : str.split("\\s+")){
            if(s.equals(minWord) || s.equals(maxWord)){
                result.append(new StringBuilder(s).reverse());
            }else{
                result.append(s);
            }
            result.append(" ");
        }
        System.out.println(minWord);
        System.out.println(maxWord);
        System.out.println(result.toString().trim());
    }
}
