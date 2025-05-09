package May;

public class SingletonPattern {
    private static SingletonPattern driver;

    private SingletonPattern(){

    }


    public SingletonPattern getInstanceDriver(){
        if(driver==null){
            driver = new SingletonPattern();
        }
        return driver;
    }
}
