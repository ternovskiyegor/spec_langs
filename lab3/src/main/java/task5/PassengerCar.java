package task5;

public class PassengerCar extends Car {
    private int passengersAmount;

    public PassengerCar(String name, double fuelConsuming, double pollutionLevel, int passengersAmount) {
        super(name, fuelConsuming, pollutionLevel);
        this.passengersAmount = passengersAmount;
    }

    public int getPassengersAmount() {
        return passengersAmount;
    }

    @Override
    public void move(double distance) {
        System.out.println(name + " moved " + distance + " km.");
    }

    @Override
    public double fuelConsumptionCalculation(double distance) {
        return (distance * fuelConsumption) / 100;
    }

    @Override
    public double pollutionLevelCalculation(double distance) {
        return (distance * pollutionLevel) / 100;
    }
}
