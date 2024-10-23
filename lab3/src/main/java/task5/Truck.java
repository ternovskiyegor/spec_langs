package task5;

public class Truck extends Car {
    private double cargoWeight;      // вес груза

    public Truck(String name, double fuelConsumption, double pollutionLevel, double cargoWeight) {
        super(name, fuelConsumption, pollutionLevel);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void move(double distance) {
        System.out.println("Truck move " + distance + " km with cargo weight " + cargoWeight + " kg.");
    }

    @Override
    public double fuelConsumptionCalculation(double distance) {
        return (distance * fuelConsumption) / 100;
    }

    @Override
    public double pollutionLevelCalculation(double distance) {
        return (distance * pollutionLevel) / 100;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }
}
