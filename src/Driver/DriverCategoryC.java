package Driver;

import Driver.Driver;
import TransportClasses.Trucks;

public class DriverCategoryC extends Driver<Trucks> {


    public DriverCategoryC(String fioDriver, String driversLicenze, double experienceDriver, Trucks transport,String category) {
        super(fioDriver, "C", experienceDriver, transport,category);
    }
}
