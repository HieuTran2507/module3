package ex7;

public class ex7 {
    public static void main(String[] args){
        Employee emp = new Employee("An", "E01", 5000);
        Manager mgr = new Manager("Binh", "M01", 7000, 2000);
        Developer dev = new Developer("Cuong", "D01", 6000, "Java");

        System.out.println("--- LUONG CO BAN ---");
        System.out.println("Employee Salary: " + emp.getSalary());
        System.out.println("Manager Salary: " + mgr.getSalary());
        System.out.println("Developer Salary: " + dev.getSalary());

        System.out.println("--- THONG TIN NHAN VIEN ---");
        System.out.println(emp);
        System.out.println(mgr);
        System.out.println(dev);

        emp.increaseSalary(1000);
        System.out.println("After increase:");
        System.out.println(emp);

    }
}
