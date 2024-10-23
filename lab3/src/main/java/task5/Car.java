package task5;

public abstract class Car {
    public String name;
    public double fuelConsumption;  // расход на 100 км
    public double pollutionLevel;   // загрязнение на 100 км

    public Car(String name, double fuelConsumption, double pollutionLevel) {
        this.name = name;
        this.fuelConsumption = fuelConsumption;
        this.pollutionLevel = pollutionLevel;
    }

    public void printName() {
        System.out.println(this.name);
    }

    // пересування на певну відстань
    public abstract void move(double distance);

    // розрахунок спожитого палива
    public abstract double fuelConsumptionCalculation(double distance);

    public abstract double pollutionLevelCalculation(double distance);

}
