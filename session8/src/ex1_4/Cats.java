package ex1_4;

public class Cats extends Animals {
    private final String furColor;

    public Cats(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public String makeSound(){
        return "mew mew";
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("mau long: "+furColor);
    }
}
