import Details.Engine;
import Engine.Car;
import Engine.SportCar;
import Engine.Lorry;
import Professions.Driver;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW X7", "Внедорожник", 4569.5, new Driver(), new Engine());
        System.out.println(bmw);
        System.out.println("------------------------");
        SportCar sportCar = new SportCar("Ferrari 488", "Спортивный автомобиль", 1475, new Driver("Jo Baiden", 20), new Engine(670, "Невероятная"), 330 );
        System.out.println(sportCar);
        System.out.println("------------------------");
        Lorry lorry = new Lorry("MAN TGX", "Грузовик", 20000, new Driver("Bob Marli", 10), new Engine(560, "Грузовая"), 41000);
        System.out.println(lorry);

    }
}