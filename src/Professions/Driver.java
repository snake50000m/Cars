package Professions;

public class Driver {
    private String fio;
    private int drivingExperience;

    public Driver() {
        this.fio = "Bob";
        this.drivingExperience = 5;
    }

    public Driver(String fio, int drivingExperience) {
        this.fio = fio;
        this.drivingExperience = drivingExperience;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return  "\nФИО: " + fio +
                "\nСтаж вождения: " + drivingExperience + " лет";
    }
}
