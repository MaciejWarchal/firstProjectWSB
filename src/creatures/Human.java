package creatures;
import device.*;
import java.time.LocalDateTime;

public class Human {
    private final String firstname;
    private final String lastname;
    private boolean isALive;
    private String phone;
    private Animal pet;
    private Car car;
    private double salary;
    private LocalDateTime salaryInfoTime;
    private double cash;

    public Human(String firstname, String lastname, boolean isALive, String phone, Animal pet,
                 Car car, double salary, double cash) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.isALive = isALive;
        this.phone = phone;
        this.pet = pet;
        this.car = car;
        this.salary = salary;
        this.salaryInfoTime = LocalDateTime.now();
        this.cash=cash;
    }

    public double getSalary() {
        System.out.println(this.salaryInfoTime);
        return this.salary;
    }

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        if (this.salary > car.getCarValue()) {
            System.out.println("udalo sie kupic za gotówke");
            this.car = car;
        } else if (this.salary > 0.0 * car.getCarValue()) {
            System.out.println("auto kupisz za kredyt");
            this.car = car;
        } else {
            System.out.println("zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }

    }

    public void setSalary(double newSalary) {
        if (newSalary <= 0.0) {
            System.out.println("nie mozna przypisac zerowej zaplaty");
        } else {
            System.out.println("dane zostały wysłane do systemu księgowego");
            System.out.println("mozliwosc odebrania aneksu do umowy od pani Hani z kadr");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
            this.salary = newSalary;
            this.salaryInfoTime = LocalDateTime.now();
        }

    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public String toString() {
        return "Human{firstname='" + this.firstname + "', lastname='" + this.lastname + "', isALive=" + this.isALive + ", phone='" + this.phone + "', pet=" + this.pet + ", car=" + this.car + ", salary=" + this.salary + ", salaryGetInfoTime=" + this.salaryInfoTime + "}";
    }
}

