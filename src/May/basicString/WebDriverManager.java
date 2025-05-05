package May.basicString;

public class WebDriverManager {

    private static WebDriverManager driver = null;

    private WebDriverManager(){

    }
    public WebDriverManager getInstance(){
        if(driver == null){
            //WebDriverManager.setup().chrome();
            driver = new WebDriverManager();

        }
        return driver;
    }
}
