package May.InterviewQuestions2025;

public class ReverseStringCustomized {
    public static void main(String[] args){
        String str = "I LOVE JAVA";
        reverseStringWithCustomization(str);
    }

    private static void reverseStringWithCustomization(String str) {
        StringBuilder result = new StringBuilder();
        for(String s : str.split("\\s+")){
            result.append(s);
        }
        result.reverse();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                result.insert(i, ' ');
            }
        }
        System.out.println(result);
    }
}
