package May;

public class CountVowelsAndConsonant {
    public static void main(String[] args){
        String str = "Saumya Singh";
        countVowelsAndConsoants(str);
    }

    private static void countVowelsAndConsoants(String str) {
        int vowels = 0;
        int cons = 0;
        str = str.toLowerCase();

        for(char c : str.toCharArray()){
            if(Character.isLetter(c)){
                if("aeiou".indexOf(c) != -1 )
                    vowels++;
                else
                    cons++;
            }
        }
        System.out.println("Vowels :"+vowels);
        System.out.println("Constant :"+cons);
    }
}
