package TransportClasses;

public class Trucks extends Transport implements Competing {

    private Tonnage tonnage;

    public Trucks(String brand, String model, double engineVolume, Tonnage tonnage) {
        super(brand, model, engineVolume);
        this.tonnage = tonnage;
    }

    public String toString() {
        return "Грузовой автомобиль: " + getBrand() +
                " " + getModel() +
                "; объем двигателя: " + getEngineVolume() + "; Грузоподъёмность: " + getTonnage();
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

    public void printType() {
        if (tonnage == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            String from = tonnage.getFrom() == null ? "" : "от " + tonnage.getFrom() + " т., ";
            String to = tonnage.getTo() == null ? "" : "до " + tonnage.getTo() + " т.";
            System.out.println("Грузоподъемность авто: " + from + to);
        }
    }

    @Override
    public boolean passDiagnostics() {
        return Math.random() > 0.75;
    }

    public Tonnage getTonnage() {
        return tonnage;
    }

    public void setTonnage(Tonnage tonnage) {
        this.tonnage = tonnage;
    }
}
