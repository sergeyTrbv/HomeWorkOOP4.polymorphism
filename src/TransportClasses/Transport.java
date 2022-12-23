package TransportClasses;

import Driver.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public abstract class Transport {

    private String brand;
    private String model;
    private double engineVolume;  //Мощность двигателя
    private final List<Driver<?>> drivers = new ArrayList<>();                      //Создание пустого списка "Водители"
    private final List<Mechanic<?>> mechanics = new ArrayList<>();                  //Создание пустого списка "Механики"
    private final List<Sponsor> sponsors = new ArrayList<>();                       //Создание пустого списка "Спонсоры"

    public Transport(String brand, String model, double engineVolume) {                                    //Конструктор
        this.brand = validOrDefault(brand, "no name brand");
        this.model = validOrDefault(model, "no name model");
        this.engineVolume = engineVolume >= 0.8d ? engineVolume : 0.8;
    }

    public void addDriver(Driver<?>... drivers) {                                         //метод добавить водителя в список
        this.drivers.addAll(Arrays.asList(drivers));
    }

    public void addMechanic(Mechanic<?>... mechanics) {                                //метод добавить механика в список
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public void addSponsor(Sponsor... sponsors) {                   //метод добавить  какое то кол-во спонсоров в список
        this.sponsors.addAll(Arrays.asList(sponsors));
    }


    public static String validOrDefault(String value, String defaultValue) {                          //Проверка на ноль
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }

    public abstract void repair();                                                             //Метод "Починить машину"

    public abstract void startMoving();                                                           //Метод "Начать заезд"

    public abstract void stopMoving();                                                      //Метод "Закончить движение"

    public abstract void printType();                                                                       //Тип куова?

    public abstract boolean passDiagnostics();                                   //Метод "Пройти диагностику" или СЕРВИС


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }
}
