package ex2;

public class ex2 {
    public static void main(String[] args){
        Vehicle car = new Car("toyota",120);
        Vehicle bike = new Bike("Honda", 80);

        car.start();
        car.displayInfo();

        bike.start();
        bike.displayInfo();
    }
}
