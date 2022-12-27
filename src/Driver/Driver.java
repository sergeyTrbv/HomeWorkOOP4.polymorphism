package Driver;

import TransportClasses.Transport;

public abstract class Driver<T extends Transport> {

    private String fioDriver;
    private String driversLicenze;
    private double experienceDriver;
    private T transport;
    private String category;


    public Driver(String fioDriver, String driversLicenze, double experienceDriver, T transport,String category) {
        this.fioDriver = validOrDefault(fioDriver, "no name");
        this.driversLicenze = validOrDefault(driversLicenze, "no licenze");
        this.experienceDriver = experienceDriver >= 0 ? experienceDriver : 0;
        this.transport = transport;
        setCategory(category);
    }


    public void driverStartMoving() {
        System.out.println("Водитель " + getFioDriver() + " начал движение");
    }

    public void driverStopMoving() {
        System.out.println("Водитель " + getFioDriver() + " остановился");
    }

    public void driverRefuelCar() {
        System.out.println("Водитель " + getFioDriver() + " заправил автомобиль" + transport.getBrand() +
                " " + transport.getBrand());
    }

    public static String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }

    public String toString() {
        return "Водитель: " + getFioDriver() +
                " управляет автомобилем " + transport.getBrand() +
                " " + transport.getModel() +
                " и будет участвовать в заезде";
    }

    public String getFioDriver() {
        return fioDriver;
    }

    public String getDriversLicenze() {
        return driversLicenze;
    }

    public void setDriversLicenze(String driversLicenze) {
        this.driversLicenze = driversLicenze;
    }

    public double getExperienceDriver() {
        return experienceDriver;
    }

    public void setExperienceDriver(double experienceDriver) {
        this.experienceDriver = experienceDriver;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category == null){
            throw new IllegalArgumentException("Необходимо указать категорию прав!");
        }
        this.category = category;
    }
}
