package Static;

public class Test4 {
    static int x = 4;
    int y = 9;

    static void display(){
        System.out.println(x);
       // System.out.println(y); //error
    }

    public static void main(String[] args){
        display();
    }
}
