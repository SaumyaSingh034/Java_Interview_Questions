package February2025;

public class SingletonDesignPattern {
    private static SingletonDesignPattern sp;

    private SingletonDesignPattern(){

    }

    public SingletonDesignPattern getInstance(){
        if (sp == null) {
            sp = new SingletonDesignPattern();
        }
        return sp;
    }
}
