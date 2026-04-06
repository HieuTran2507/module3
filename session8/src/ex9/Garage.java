package ex9;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void startAll() {
        for (Car car : cars) {
            System.out.println(car.start());
        }
    }

    public void stopAll() {
        for (Car car : cars) {
            System.out.println(car.stop());
        }
    }

    public void refuelAll() {
        for (Car car : cars) {
            if (car instanceof Refuelable) {
                ((Refuelable) car).refuel();
            }
        }
    }
}
