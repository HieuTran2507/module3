package ex1;

public class student {
    private String name;
    private int age;
    private double avgScore;

    public student(String name, int age, double avgScore) {
        this.name = name;
        this.age = age;
        this.avgScore = avgScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString(){
        return "ten: " + name + ", tuoi: " + age + ", diem trung binh: " + avgScore;
    }
}
