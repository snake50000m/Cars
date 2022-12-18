package Engine;

import Details.Engine;
import Professions.Driver;

public class SportCar extends Car{
    private int maxSpeed;

    public SportCar() {
    }

    public SportCar(String model, String classOfCar, double weight, Driver driver, Engine engine, int maxSpeed) {
        super(model, classOfCar, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + "\nМаксимальная скрость: " + maxSpeed + " км/ч";
    }
}
