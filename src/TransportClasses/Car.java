package TransportClasses;

public class Car extends Transport implements Competing {

    private TypeOfBody typeOfBody;

    public Car(String brand, String model, double engineVolume, TypeOfBody typeOfBody) {     //Конструктор
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    public String toString() {
        return "Легковой автомобиль: " + getBrand() +
                " " + getModel() +
                "; Объем двигателя: " + getEngineVolume() + "; Тип Кузова: " + getTypeOfBody();
    }


    @Override
    public void startMoving() {                          //Переопределенный метод "Начать движение"
        System.out.println("Быстро начинаю движение с пробуксовкой");
    }

    @Override
    public void stopMoving() {                      //Переопределенный метод "Закончить движение"
        System.out.println("Заканчиваю движение, быстро торможу");
    }

    @Override
    public void pitStop() {                       //Переопределенный метод "Пит-стоп"
        System.out.println("Заезжаю на пит-стоп для легковых авто");
    }


    public double bestLapTime() {            //Переопределенный метод "Лучшее время круга"
        return 1.2;
    }

    @Override
    public int maxspeed() {                   //Переопределенный метод "Максимальная скорость"
        return 200;
    }

    public void printType() {                   //Переопределенный метод "Тип кузова"
        if (typeOfBody == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип кузова авто: " + typeOfBody.getName());
        }
    }

    @Override
    public boolean passDiagnostics() {       //Метод "Пройти диагностику". Рандомный шанс пройти её
        return Math.random() > 0.5;
    }

    public void repair() {                    //Метод "Починить машину"
        System.out.println("Машина " + getBrand() + " " + getModel() + " починена");
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }


}