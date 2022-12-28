package TransportClasses;


import java.util.Objects;

public class Sponsor {

    private final String name;
    private final int amount;              //сумма поддержки

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return name + " , сумма поддержки: " + amount;
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

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return amount == sponsor.amount && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount);
    }

}
