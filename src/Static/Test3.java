package Static;

public class Test3 {
    static int x = 5;

    Test3(){
        x++;
    }

    public static void main(String[] args){
        Test3 obj1 = new Test3();
        System.out.println(x);
        Test3 obj2 = new Test3();
        System.out.println(x);
        Test3 obj3 = new Test3();
        System.out.println(x);
    }
    }
