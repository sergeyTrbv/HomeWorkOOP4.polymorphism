package Driver;

import Driver.Driver;
import TransportClasses.Bus;

public class DriverCategoryD extends Driver<Bus> {


    public DriverCategoryD(String fioDriver, String driversLicenze, double experienceDriver, Bus transport,String category) {
        super(fioDriver, "C", experienceDriver, transport,category);
    }
}
