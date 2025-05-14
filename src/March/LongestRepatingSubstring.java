package March;

public class LongestRepatingSubstring {
    public static void main(String[] args){
        String str = "aab";
        String str1 = "pwwkew";
        String str2 = "abcabcd";
        //findLongestRepeatingSubstring(str);
        findLongestRepeatingSubstring1(str);
        findLongestRepeatingSubstring1(str1);
        findLongestRepeatingSubstring1(str2);
        //usingHashSet(str);
    }

    private static void findLongestRepeatingSubstring1(String str) {
        //String sub = "";
        String longest = "";
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                String sub = str.substring(i, j);
                if(str.indexOf(sub, j) != -1){
                    if(sub.length()>longest.length()){
                        longest = sub;
                    }
                }
            }

        }
        System.out.println(longest);
    }

    private static void usingHashSet(String str) {
    }

    private static void findLongestRepeatingSubstring(String str) {
        String longestSubstring = "";
        for(int i=0;i<str.length();i++){
            for(int j=i+1; j<str.length();j++){
                String sub = str.substring(i,j);
                if(str.indexOf(sub,j) !=-1){
                    if(sub.length()>longestSubstring.length()){
                        longestSubstring = sub;
                    }
                }
            }
        }
        System.out.println(longestSubstring);
    }
}
