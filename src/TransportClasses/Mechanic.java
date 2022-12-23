package TransportClasses;

import TransportClasses.Transport;

public class Mechanic<T extends Transport> {

    private final String name;
    private final String surname;
    private final String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
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
}
