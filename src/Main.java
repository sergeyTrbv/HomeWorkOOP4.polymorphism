import Driver.Driver;
import Driver.DriverCategoryB;
import Driver.DriverCategoryC;
import Driver.DriverCategoryD;
import TransportClasses.*;
import java.util.Iterator;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Mechanic<Car> petr = new Mechanic<>("Петр", "Петров", "Pirelle");
        Mechanic<Transport> vasya = new Mechanic<>("Василий", "Васькович", "Pirelle");

        Sponsor lukoil = new Sponsor("Лукойл", 2_000_000);
        Sponsor michlen = new Sponsor("Мишлен", 3_000_000);

        Car chevrolet = new Car("Chevrolet", "Lacetti", 1.4d, TypeOfBody.HATCHBACK);

//        chevrolet.addDriver(new DriverCategoryB("Иванов Иван", "B", 2,
//                chevrolet, "категория 1"));
        chevrolet.addMechanic(petr);
        chevrolet.addSponsor(lukoil, michlen);

        Car skoda = new Car("Skoda", "Fabia", 1.2, TypeOfBody.HATCHBACK);
        Car renault = new Car("Renault", "Sandero Stapway", 1.6, TypeOfBody.HATCHBACK);
//        Car lada = new Car("Lada", "2114", 1.6, TypeOfBody.SEDAN);

        Bus manBus = new Bus("Man", "Lion`s Coach", 12.0, Capacity.EXTRA_SMALL);

        manBus.addDriver(new DriverCategoryD("Корней Корнеич", "D", 5,
                manBus, "категория 3"));
        manBus.addMechanic(vasya);
        manBus.addSponsor(michlen);

//        Bus volgaBus = new Bus("Волгабас", "5270", 6.8, Capacity.LARGE);
//        Bus hyundaiBus = new Bus("Hyundai", "Universe", 12.3, Capacity.MEDIUM);
//        Bus volvoBus = new Bus("Volvo", "B10M", 9.6, Capacity.EXTRA_LARGE);

        Trucks kamazTruck = new Trucks("КамАЗ", "4325", 6.7, Tonnage.N1);

        kamazTruck.addDriver(new DriverCategoryC("Сергей Сергеевич", "C", 3,
                kamazTruck, "категория 2"));
        kamazTruck.addMechanic(vasya);
        kamazTruck.addSponsor(lukoil);

//        Trucks manTruckTruck = new Trucks("Man", "TGS 6x6", 12.4, Tonnage.N2);
//        Trucks mersedesBenzTruck = new Trucks("Mersedes-Benz 6x6", "Arocs", 10.7, Tonnage.N3);
//        Trucks renaultTruck = new Trucks("Renault", "Premium", 7.2, null);

//        passDiagnostics(
//                chevrolet, skoda, renault, lada,
//                kamazTruck, manTruckTruck, mersedesBenzTruck, renaultTruck,
//                manBus, volgaBus, hyundaiBus, volgaBus
//        );


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
//        DriverCategoryB man1 = new DriverCategoryB("Иванов Иван", "B", 2,
//                chevrolet, "категория 1");
//        System.out.println(man1);
//        chevrolet.startMoving();
//        chevrolet.pitStop();
//        chevrolet.stopMoving();
//
//        DriverCategoryC man2 = new DriverCategoryC("Сергей Сергеевич", "C", 3,
//                kamazTruck, "категория 2");
//        System.out.println(man2);
//
//        DriverCategoryD man3 = new DriverCategoryD("Корней Корнеич", "D", 5,
//                volgaBus, "категория 3");
//        System.out.println(man3);
//
//        System.out.println(chevrolet.getTypeOfBody());
//        System.out.println(volgaBus.getCapacity());
//        System.out.println(kamazTruck.getTonnage());

//        manBus.passDiagnostics();


//        Set<Transport> setOfCars = new HashSet<>();                                 //Список автомобилей
//
//        setOfCars.add(kamazTruck);
//        setOfCars.add(manBus);
//        setOfCars.add(chevrolet);
//        setOfCars.add(chevrolet); //повторил автомобиль 2 раза чтобы убедиться что при выводе в консоль выдаст только одно значение
//
//        System.out.println(Arrays.toString(setOfCars.toArray()));
//
//
//        Map<Mechanic, Transport> mapOfMechanic = new LinkedHashMap<>();
//
//        mapOfMechanic.put(petr, chevrolet);
//        mapOfMechanic.put(vasya, manBus);
//
//        for (Map.Entry<Mechanic, Transport> mechanic : mapOfMechanic.entrySet()) {
//            System.out.println("Механик: " + mechanic.getKey() + " будет чинить: " + mechanic.getValue());
//        }


//        );
//        ServiceStation serviceStation= new ServiceStation();
//        serviceStation.addCar(chevrolet);
//        serviceStation.addTruck(kamazTruck);
//        serviceStation.service();
//        serviceStation.service();
//
//
//      List<Transport> transports = List.of(chevrolet,kamazTruck,manBus);
//
//        for (Transport transport: transports){
//          printInfo(transport);
//      }



        //создаю новых водителей
        DriverCategoryB mixail = new DriverCategoryB("Михаил", "гоночная лицензия", 2, chevrolet, "есть категория");
        DriverCategoryB olga = new DriverCategoryB("Ольга", "гоночная лицензия", 1, chevrolet, "есть категория");
        DriverCategoryB sergey = new DriverCategoryB("Сергей", "гоночная лицензия", 3, chevrolet, "есть категория");

        //Добавляю водителей в список водителей  к объектам из класса машин
        chevrolet.addDriver(mixail);
        chevrolet.addDriver(mixail); //специльно добавляю 2 раз для проверки
        chevrolet.addDriver(olga);
        renault.addDriver(olga);
        skoda.addDriver(sergey);

        System.out.println(chevrolet.getDrivers());
        System.out.println(renault.getDrivers());
        System.out.println(skoda.getDrivers());

        //Добавляю механиков в список механиков к объектам из класса машин
        chevrolet.addMechanic(petr);
        chevrolet.addSponsor(lukoil, michlen);
        System.out.println(chevrolet.getMechanics());

        System.out.println(" ");

        //Итерирую список водителей
        Iterator<Driver<?>> driverIteratorChevrolet = chevrolet.getDrivers().iterator();
        while (driverIteratorChevrolet.hasNext()) {
            System.out.println(driverIteratorChevrolet.next());
        }
        System.out.println(" ");
        Iterator<Driver<?>> driverIteratorSkoda = skoda.getDrivers().iterator();
        while (driverIteratorSkoda.hasNext()) {
            System.out.println(driverIteratorSkoda.next());
        }
        System.out.println(" ");
        Iterator<Driver<?>> driverIteratorRenault = renault.getDrivers().iterator();
        while (driverIteratorRenault.hasNext()) {
            System.out.println(driverIteratorRenault.next());
        }
    }


    private static void printInfo(Transport transport) {                             //Метод инфо об авто( модель, водитель)
        System.out.println("Информация по авто " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители: ");
        for (Driver<?> driver : transport.getDrivers()) {
            System.out.println(driver.getFioDriver());
        }
        System.out.println("Механик: ");
        for (Mechanic<?> mechanic : transport.getMechanics()) {
            System.out.println(mechanic.getName() + " " + mechanic.getSurname() + " из " + mechanic.getCompany());
        }
        System.out.println("Спонсор: ");
        for (Sponsor sponsor : transport.getSponsors()) {
            System.out.println(sponsor.getName() + ", сумма поддержки: " + sponsor.getAmount());
        }
        System.out.println(" ");
    }

    private static void passDiagnostics(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }

    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.passDiagnostics()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel()
                        + " не прошёл дианостику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}