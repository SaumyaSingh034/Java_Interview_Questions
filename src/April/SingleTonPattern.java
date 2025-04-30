package April;

public class SingleTonPattern {
    private static SingleTonPattern webDriverInstance = null;

    private SingleTonPattern(){

    }

    public SingleTonPattern getInstance(){
        if(webDriverInstance == null){
            webDriverInstance = new SingleTonPattern();
        }
        return webDriverInstance;
    }
}
