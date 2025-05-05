package May;

public class RevsereWords {
    public static void main(String[] args){
        String str = "Java is awesome";
        reverseWords(str);
        reverseWordsinReverseOrder(str);
    }

    private static void reverseWordsinReverseOrder(String str) {

        StringBuilder result = new StringBuilder();

        String[] arr = str.split("\\s+");
        for(int i= arr.length-1;i>=0;i--){
            StringBuilder reverse = new StringBuilder(arr[i]);
            result.append(reverse.reverse()).append(" ");
        }
        System.out.println(result.toString().trim());
    }

    private static void reverseWords(String str) {
        StringBuilder reverse = new StringBuilder();
        String[] strArr = str.split("\\s+");
        for(int i= strArr.length-1;i>=0;i--){
            reverse.append(strArr[i]).append(" ");
        }
        System.out.println(reverse.toString().trim());
    }
}
