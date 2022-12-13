package TransportClasses;

public class Car extends Transport implements Competing {

    private TypeOfBody typeOfBody;

    public Car(String brand, String model, double engineVolume, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    public String toString() {
        return "Легковой автомобиль: " + getBrand() +
                " " + getModel() +
                "; Объем двигателя: " + getEngineVolume() + "; Тип Кузова: " + getTypeOfBody();
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
        return 1.2;
    }

    @Override
    public int maxspeed() {
        return 200;
    }

    public void printType() {
        if (typeOfBody == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип кузова авто: " + typeOfBody.getName());
        }
    }

    @Override
    public boolean passDiagnostics() {
        return Math.random() > 0.5;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }


}