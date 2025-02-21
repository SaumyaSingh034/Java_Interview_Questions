package February2025;

@FunctionalInterface
public interface FITest {


    void execute();

    default void message(){
        System.out.println("Hello");
    }

    public static void test(){
        System.out.println("Static Method");
    }
}
