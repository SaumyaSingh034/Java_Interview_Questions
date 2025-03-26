package March;

public interface AbstractionInterface {
    void animal();
    static void display(){
        System.out.println("Display Interface");
    }

    default void data(){
        System.out.println("Data");
    }
}
