package TransportClasses;

public class Bus extends Transport implements Competing {

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Медленно набираю скорость");
    }

    @Override
    public void stopMoving() {
        System.out.println("Оттормаживаюсь, заканчиваю движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Заезжаю на пит-стоп для автобусов");
    }

    @Override
    public double bestLapTime() {
        return 1.1;
    }

    @Override
    public int maxspeed() {
        return 160;
    }
}