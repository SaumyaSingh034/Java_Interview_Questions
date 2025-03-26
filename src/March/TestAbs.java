package March;

public class TestAbs extends Abstraction{
    @Override
    public void animal() {
        System.out.println("Animal");
    }

    public static void main(String[] args){
        TestAbs abs = new TestAbs();
        abs.display();
        abs.animal();
    }
}
