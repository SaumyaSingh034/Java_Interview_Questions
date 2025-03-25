package Static;

public class Test {
    public int x = 20;
    static int y = 30;
    static void display(){
        System.out.println("Display Static Method");
    }

    public static void main(String[] args){
        Test obj = null;
        obj.display();
        Test obj1 = new Test();
        System.out.println(obj1.x);
       // System.out.println(Test.x);
        System.out.println(Test.y);
        display();
    }
}
