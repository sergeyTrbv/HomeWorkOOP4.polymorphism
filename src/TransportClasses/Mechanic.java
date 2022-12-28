package TransportClasses;

import TransportClasses.Transport;

import java.util.Objects;

public class Mechanic<T extends Transport> {

    private final String name;
    private final String surname;
    private final String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Механик: " + name+" "+ surname;
    }

    public boolean service(T t) {         //Переопределенный метод "Обслужить машину"
        return t.passDiagnostics();
    }

    public void repair(T t){           //Переопределенный метод "Починить машину"
        t.repair();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(surname, mechanic.surname) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, company);
    }
}
