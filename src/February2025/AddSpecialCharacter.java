package February2025;

public class AddSpecialCharacter {
    public static void main(String[] args){
        String str = "tomorrow";
        addCharacterSpecial(str);
    }

    private static void addCharacterSpecial(String str) {
        StringBuffer sb = new StringBuffer();
        int count = 0;
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            count++;
            for(int j=0;j<count;j++){
                sb.append('$');
                i++;
            }


        }
        System.out.println(sb);
    }
}
