package TransportClasses;

public class Car extends Transport implements Competing {

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Быстро начинаю движение с пробуксовкой");
    }

    @Override
    public void stopMoving() {
        System.out.println("Заканчиваю движение, быстро торможу");
    }

    @Override
    public void pitStop() {
        System.out.println("Заезжаю на пит-стоп для легковых авто");
    }


    public double bestLapTime() {
        return  1.2;
    }

    @Override
    public int maxspeed() {
        return 200;
    }
}