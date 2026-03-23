package ex7;

public class Employee {
    protected String name;
    protected String id;
    protected double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Employee() {
    }

    public double getSalary(){
        return salary;
    }

    public void increaseSalary(double amount){
        salary += amount;
    }

    @Override
    public String toString(){
        return "ten: "+name+", ma so: " +id+", luong: "+salary;
    }


}
