package May.FactoryDesignPattern;

public class ChromeDriverManager implements Driver{
    @Override
    public String driver() {
        return  "new ChromeDriver()";
    }
}
