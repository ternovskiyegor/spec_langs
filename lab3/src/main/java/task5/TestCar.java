package task5;

import java.util.ArrayList;
import java.util.List;

public class TestCar {

    public static void main(String[] args) {
        Car passengerCar = new PassengerCar("Honda Civic", 8, 1.5, 4);
        Car truck = new Truck("Volvo Truck 540", 15, 3.5, 1000);
        Car electricCar = new ElectricCar("Tesla Model S", 5, 99);

        List<Car> cars = new ArrayList<>();
        cars.add(passengerCar);
        cars.add(truck);
        cars.add(electricCar);

        for (Car car : cars) {
            car.printName();
            car.move(20);
            System.out.println("Pollution: " + car.pollutionLevelCalculation(70));
            if (car instanceof ElectricCar) {
                System.out.println("Level of accum: " + ((ElectricCar) car).getAccumLevel());
                System.out.println("Amount of passengers: " + ((ElectricCar) car).getPassengers());
            } else if (car instanceof PassengerCar) {
                System.out.println("Amount of passengers: " + ((PassengerCar) car).getPassengersAmount());
            } else {
                System.out.println("Cargo: " + ((Truck) car).getCargoWeight());
            }
            System.out.println();
        }
    }
}
