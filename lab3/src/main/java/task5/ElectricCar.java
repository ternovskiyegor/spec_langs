package task5;

public class ElectricCar extends Car {
    private int passengers;
    public double accumLevel;

    public ElectricCar(String name, int passengers, double accumLevel) {
        super(name, 0, 0);
        this.passengers = passengers;
        this.accumLevel = accumLevel;
    }

    @Override
    public void move(double distance) {
        System.out.println(name + " moved " + distance + " km.");
    }

    @Override
    public double fuelConsumptionCalculation(double distance) {
        return 0;
    }

    @Override
    public double pollutionLevelCalculation(double distance) {
        return 0;
    }

    public int getPassengers() {
        return passengers;
    }

    public double getAccumLevel() {
      return accumLevel;
    }
}
