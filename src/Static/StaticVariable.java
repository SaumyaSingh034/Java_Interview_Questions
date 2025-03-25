package Static;

public class StaticVariable {
    static int x = 10;
    public static void main(String[] args){
        Test obj1 = new Test();
        Test obj2 = new Test();
        obj1.x = 20;
        System.out.println(obj2.x);


    }
}
