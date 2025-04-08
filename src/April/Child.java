package April;

public class Child extends Parent{

    public Child(){
       // super();
        System.out.println("Child Constructor");
    }

    public void display(){
        System.out.println("Child Display");
    }

    public static void main(String[] args){
        Parent parent = new Child();
        
        parent.display();
    }
}
