package ex1_4;

public class Dogs extends Animals {
    private final String breed;

    // constructor
    public Dogs(String name, int age, String breed) {
        super(name, age); // goi constructor lop cha
        this.breed = breed;
    }

    @Override
    public String makeSound(){
        return "woof woof";
    }

    @Override
    public void displayInfo(){
        super.displayInfo(); // goi phuong thuc display info lop cha
        System.out.println("giong cho: "+breed);
    }
}
