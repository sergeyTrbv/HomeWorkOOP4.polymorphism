package TransportClasses;

public class Trucks extends Transport implements Competing {

    private Tonnage tonnage;   //Грузоподъёмность

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
    public void startMoving() {                               //Переопределенный метод "Начать движение"
        System.out.println("Проверяю закреплен ли груз, очень медленно начинаю движение");
    }

    @Override
    public void stopMoving() {                               //Переопределенный метод "Закончить движение"
        System.out.println("Очень медленно и аккуратно заканчиваю движение");
    }

    @Override
    public void pitStop() {                                  //Переопределенный метод "Пит-стоп"
        System.out.println("Заезжаю на пит-стоп для грузовиков");
    }

    @Override
    public double bestLapTime() {                          //Переопределенный метод "Лучшее время круга"
        return 0.9;
    }

    @Override
    public int maxspeed() {                             //Переопределенный метод "Максимальная скорость"
        return 120;
    }

    public void printType() {                        //Переопределенный метод "Тип кузова" но сделан как "грузоподъёсность"
        if (tonnage == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            String from = tonnage.getFrom() == null ? "" : "от " + tonnage.getFrom() + " т., ";
            String to = tonnage.getTo() == null ? "" : "до " + tonnage.getTo() + " т.";
            System.out.println("Грузоподъемность авто: " + from + to);
        }
    }

    @Override
    public boolean passDiagnostics() {              //Метод "Пройти диагностику". Рандомный шанс пройти её
        return Math.random() > 0.75;
    }

    public void repair() {                             //Метод "Починить грузовик"
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " починен");
    }


    public Tonnage getTonnage() {
        return tonnage;
    }

    public void setTonnage(Tonnage tonnage) {
        this.tonnage = tonnage;
    }
}
