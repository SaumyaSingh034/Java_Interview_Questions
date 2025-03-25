package DesignPattern;

public class SingletonPatterm {

    private static SingletonPatterm singletonPatterm;

    private SingletonPatterm(){

    }

    public static SingletonPatterm getInstance(){
        if(singletonPatterm == null){
            singletonPatterm =  new SingletonPatterm();
            return singletonPatterm;
        }
        return null;
    }
}
