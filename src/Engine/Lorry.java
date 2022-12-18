package Engine;

import Details.Engine;
import Professions.Driver;

public class Lorry extends Car{
    private double loadCapacity;

    public Lorry() {
    }

    public Lorry(String model, String classOfCar, double weight, Driver driver, Engine engine, double loadCapacity) {
        super(model, classOfCar, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "\nГрузоподъемность: " + loadCapacity + " кг.";
    }
}
