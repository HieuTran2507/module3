package ex7;

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer() {
    }

    public Developer(String name, String id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Language: " + programmingLanguage;
    }
}
