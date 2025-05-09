package May;

public final class Employee {



    private final int emp_id;
    private final String emp_name;

    public Employee(int emp_id, String emp_name){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }

    public String getName(){
        return emp_name;
    }

    public int getEmpId(){
        return emp_id;
    }
}
