package Engine;

import Details.Engine;
import Professions.Driver;

public class Car {
    private String model;
    private String classOfCar;
    private double weight;
    Driver driver;
    Engine engine;

    public Car() {
    }

    public Car(String model, String classOfCar, double weight, Driver driver, Engine engine) {
        this.model = model;
        this.classOfCar = classOfCar;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getClassOfCar() {
        return classOfCar;
    }

    public void setClassOfCar(String classOfCar) {
        this.classOfCar = classOfCar;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        System.out.println("Поехали!");
    }

    public void stop(){
        System.out.println("Останавливаемся!");
    }

    public void turnLeft(){
        System.out.println("Поворот налево!");
    }

    public void turnRight(){
        System.out.println("Поворот направо!");
    }

    @Override
    public String toString() {
        return "Марка: " + model +
                "\nКласс: " + classOfCar +
                "\nВес: " + weight + " кг" +
                driver + engine;
    }
}
