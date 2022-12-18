package Details;

public class Engine {
    private int power;
    private String performance;

    public Engine() {
        this.power = 200;
        this.performance = "Максимальная";
    }

    public Engine(int power, String performance) {
        this.power = power;
        this.performance = performance;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    public String toString() {
        return  "\nМощность: " + power + " л.с." +
                "\nПроизводительность: " + performance;
    }
}
