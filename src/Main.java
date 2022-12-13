import Driver.DriverCategoryB;
import Driver.DriverCategoryC;
import Driver.DriverCategoryD;
import TransportClasses.*;

public class Main {
    public static void main(String[] args) {

        Car chevrolet = new Car("Chevrolet", "Lacetti", 1.4d, TypeOfBody.HATCHBACK);
        Car skoda = new Car("Skoda", "Fabia", 1.2, TypeOfBody.HATCHBACK);
        Car renault = new Car("Renault", "Sandero Stapway", 1.6, TypeOfBody.HATCHBACK);
        Car lada = new Car("Lada", "2114", 1.6, TypeOfBody.SEDAN);

        Bus manBus = new Bus("Man", "Lion`s Coach", 12.0, Capacity.EXTRA_SMALL);
        Bus volgaBus = new Bus("Волгабас", "5270", 6.8, Capacity.LARGE);
        Bus hyundaiBus = new Bus("Hyundai", "Universe", 12.3, Capacity.MEDIUM);
        Bus volvoBus = new Bus("Volvo", "B10M", 9.6, Capacity.EXTRA_LARGE);

        Trucks kamazTruck = new Trucks("КамАЗ", "4325", 6.7, Tonnage.N1);
        Trucks manTruckTruck = new Trucks("Man", "TGS 6x6", 12.4, Tonnage.N2);
        Trucks mersedesBenzTruck = new Trucks("Mersedes-Benz 6x6", "Arocs", 10.7, Tonnage.N3);
        Trucks renaultTruck = new Trucks("Renault", "Premium", 7.2, null);

        passDiagnostics(
                chevrolet, skoda, renault, lada,
                kamazTruck, manTruckTruck, mersedesBenzTruck, renaultTruck,
                manBus, volgaBus, hyundaiBus, volgaBus
        );


//        System.out.println(chevrolet);
//        System.out.println(skoda);
//        System.out.println(renault);
//        System.out.println(lada);
//
//        System.out.println(manBus);
//        System.out.println(volgaBus);
//        System.out.println(hyundaiBus);
//        System.out.println(volvoBus);
//
//        System.out.println(kamazTruck);
//        System.out.println(manTruckTruck);
//        System.out.println(mersedesBenzTruck);
//        System.out.println(renaultTruck);
//
//        chevrolet.pitStop();
//        System.out.println(chevrolet.bestLapTime());
//        System.out.println(chevrolet.maxspeed());
//
//        DriverCategoryB man1 = new DriverCategoryB("Иванов Иван", "B",2,chevrolet);
//        System.out.println(man1);
//        chevrolet.startMoving();
//        chevrolet.pitStop();
//        chevrolet.stopMoving();
//
//        DriverCategoryC man2 = new DriverCategoryC("Сергей Сергеевич","C", 3,kamazTruck);
//        System.out.println(man2);
//
//        DriverCategoryD man3 = new DriverCategoryD("Корней Корнеич", "D", 5, volgaBus);
//        System.out.println(man3);
//
//        System.out.println(chevrolet.getTypeOfBody());
//        System.out.println(volgaBus.getCapacity());
//        System.out.println(kamazTruck.getTonnage());

        manBus.passDiagnostics();


    }

    private static void passDiagnostics(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }
private static void serviceTransport(Transport transport){
    try {
        if (!transport.passDiagnostics()){
        throw new RuntimeException("Автомобиль " + transport.getBrand() +" "+  transport.getModel()
                + " не прошёл дианостику");
        }
    }catch (RuntimeException e){
        System.out.println(e.getMessage());
    }
}

}