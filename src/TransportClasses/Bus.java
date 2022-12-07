package TransportClasses;

public class Bus extends Transport implements Competing {

    private Capacity capacity;
    public Bus(String brand, String model, double engineVolume,Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity=capacity;
    }

    @Override
    public String toString() {
        return "Легковой автомобиль: " + getBrand() +
                " " + getModel() +
                "; объем двигателя: " + getEngineVolume() + "; Вместимость: " + capacity;
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
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Вместимость автобуса: от " + capacity.getFrom() + " человек, до " + capacity.getTo() + " человек");
        }
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

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }
}