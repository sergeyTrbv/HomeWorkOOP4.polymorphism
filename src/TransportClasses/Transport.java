package TransportClasses;

public abstract class Transport {

    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = validOrDefault(brand,"no name brand");
        this.model = validOrDefault(model, "no name model");
        this.engineVolume = engineVolume >= 0.8d ? engineVolume : 0.8;
    }

    @Override
    public String toString() {
        return "Транспорт: " + brand + ". Модель: " + model + ". Объем двигателя: " + engineVolume;
    }

    public static String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }

    public abstract void startMoving();

    public abstract void stopMoving();

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
}
