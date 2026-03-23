package ex2;

public class Bike extends Vehicle{
    public Bike(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void displayInfo(){
        System.out.println("Car name: "+getName()+", Speed: "+getSpeed()+" km/h");
    }
}
