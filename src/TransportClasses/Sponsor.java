package TransportClasses;


public class Sponsor {

    private final String name;
    private final int amount;              //сумма поддержки

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return name +" , сумма поддержки: " + amount;
    }

    public void toSponsorRace() {         //Метод "Спонсировать заезд"
        System.out.printf("Спонсор \"%s\" проспонсировал заезд на %d%n", name, amount);
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

}
