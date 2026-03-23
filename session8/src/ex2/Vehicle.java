package ex2;

public abstract class Vehicle {
    private String name;
    private int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // phuong thuc truu tuong
    public abstract void displayInfo();

    // phuong thuc thong thuong
    public void start(){
        System.out.println("Vehicle is starting ... ");
    }
}
