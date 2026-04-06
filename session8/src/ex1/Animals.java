package ex1;

public class Animals {
    private String name;
    private int age;

    // constructor

    public Animals(String name, int age) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Ten khong duoc de trong");
        }
        if(age < 0){
            throw new IllegalArgumentException("tuoi khong duoc am");
        }

        this.name = name;
        this.age = age;
    }

    // getter va setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Ten khong duoc de trong");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if(age < 0){
            throw new IllegalArgumentException("tuoi khong duoc am");
        }
    }

    // phuong thuc hien thi thong tin
    public void displayInfo(){
        System.out.println("Ten: "+name+", Tuoi: "+age);
    }

    // phuong thuc am thanh
    public String makeSound(){
        return "Some generic sound";
    }

}
