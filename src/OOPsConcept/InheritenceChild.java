package OOPsConcept;

public class InheritenceChild extends InheritenceParent{

    public void display(){
        super.display();
        System.out.println("Display from Child");
    }


    public InheritenceChild(){
        System.out.println("Constructor Child");
    }


    public static void main(String[] args){
        InheritenceChild child = new InheritenceChild();
        child.display();
    }
}
