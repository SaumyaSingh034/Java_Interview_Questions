package Strings;

public class PrintOnlyInitials {
    public static void main(String[] args){
        String str = "Saumya Singh Bist";
        printOnlyIntials(str);
    }

    private static void printOnlyIntials(String str) {
        StringBuffer result = new StringBuffer();
        String[] data = str.split(" ");

        for(int i = 0;i< data.length-1;i++){
            result.append(data[i].substring(0,1).toUpperCase()).append(". ");
        }

        result.append(data[data.length-1].substring(0,1).toUpperCase()).append(
                data[data.length-1].substring(1).toLowerCase());

        System.out.println(result.toString().trim());
    }
}
