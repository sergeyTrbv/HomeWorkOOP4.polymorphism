package Driver;

import Driver.Driver;
import TransportClasses.Car;

public class DriverCategoryB extends Driver<Car> {


    public DriverCategoryB(String fioDriver, String driversLicenze, double experienceDriver, Car transport) {
        super(fioDriver, "B", experienceDriver, transport);
    }
}
