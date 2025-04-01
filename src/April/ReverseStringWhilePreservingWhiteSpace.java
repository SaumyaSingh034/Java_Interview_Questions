package April;

public class ReverseStringWhilePreservingWhiteSpace {
    public static void main(String[] args){
//        String str = "hi welcome to Tutorials Point";
//        String[] array = str.split(" ");
//        StringBuffer sb = new StringBuffer(str);
//        sb.reverse();
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i) == ' '){
//                sb.insert(i, " ");
//            }
//        }
//        sb.append("");
//        System.out.println(sb);

        String str = "hi welcome to Tutorialspoint";
        String strArray[] = str.split(" ");
        StringBuffer sb= new StringBuffer(str);
        sb.reverse();
        for(int i=0 ; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                sb.insert(i, " ");
            }
        }
        sb.append("");
        System.out.println(sb);
    }
}
