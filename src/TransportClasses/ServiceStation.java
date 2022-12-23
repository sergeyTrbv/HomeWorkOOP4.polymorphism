package TransportClasses;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Transport> transports = new ArrayDeque<>();

    private void add(Transport transport) {           //Метод добавить все виды транспортов в очередь,но метод приватный
        transports.offer(transport);
    }

    public void addCar(Car car) {                                                       //Добавляются только легковые
        add(car);
    }

    public void addTruck(Trucks trucks) {                                              //Добавляются только грузовики
        add(trucks);
    }

    public void service(){                                //Метод, в котором "удаляем" первый оюъект по списку и "чиним"
        if(!transports.isEmpty()){
            Transport transport = transports.poll();
            boolean result = transport.passDiagnostics();
            if (!result){
                transport.repair();
            }
        }
    }


}
