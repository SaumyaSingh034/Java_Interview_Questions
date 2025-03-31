package March;

public class WebBrowerSingleton {

    private static WebBrowerSingleton singleton;

    private WebBrowerSingleton(){

    }

    public WebBrowerSingleton getInstance(){
        if(singleton == null){
            singleton = new WebBrowerSingleton();
        }
        return singleton;
    }
}
