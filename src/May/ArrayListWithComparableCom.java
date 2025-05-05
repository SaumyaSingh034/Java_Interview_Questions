package May;

public class ArrayListWithComparableCom implements Comparable<ArrayListWithComparableCom>{

    private String name;
    private int empId;
    private int age;

    public ArrayListWithComparableCom(String name, int empId, int age){
        this.name = name;
        this.empId = empId;
        this.age = age;
    }



    @Override
    public int compareTo(ArrayListWithComparableCom o) {
        return this.age - o.age;
    }

    @Override
    public String toString(){
        return "Name= "+name+" ,Employee Id = "+empId+" , Employee age = "+age;
    }
}
