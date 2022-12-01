package TransportClasses;

public class Trucks extends Transport implements Competing{

    public Trucks(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Проверяю закреплен ли груз, очень медленно начинаю движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Очень медленно и аккуратно заканчиваю движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Заезжаю на пит-стоп для грузовиков");
    }

    @Override
    public double bestLapTime() {
        return 0.9;
    }

    @Override
    public int maxspeed() {
        return 120;
    }
}
