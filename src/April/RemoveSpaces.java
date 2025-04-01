package April;

public class RemoveSpaces {
    public static void main(String[] args){
        String str = "My   name  is                Ram";
        removeSpaces(str);

    }

    private static void removeSpaces(String str) {
        StringBuffer sb = new StringBuffer();
        for(String s : str.split(" ")){
            if(!s.isEmpty()){
                sb.append(s).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
