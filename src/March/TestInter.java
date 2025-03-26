package March;

public class TestInter implements AbstractionInterface{

    @Override
    public void animal() {
        System.out.println("Animal");
    }

    public static void main(String[] args){
        TestInter in = new TestInter();
        in.animal();
        AbstractionInterface.display();
        in.data();
    }
}
