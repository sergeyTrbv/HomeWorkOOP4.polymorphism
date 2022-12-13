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

       public static String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }
    public abstract boolean passDiagnostics();

    public abstract void startMoving();

    public abstract void stopMoving();
    public abstract void printType();

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
