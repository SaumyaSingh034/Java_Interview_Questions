package Collections;

public class SingletonDesignPattern {
    private static SingletonDesignPattern sp;
    private SingletonDesignPattern(){

    }

    public static SingletonDesignPattern getInstance(){
        if(sp==null){
            sp = new SingletonDesignPattern();
        }
        return sp;
    }
}
