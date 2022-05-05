import java.time.LocalDateTime;

public class Human {
    private final String firstname;
    private final String lastname;
    private boolean isALive;
    private String phone;
    private Animal pet;
    private Car car;
    private double salary;
    private LocalDateTime salaryGetInfoTime;

    public Human(String firstname, String lastname, boolean isALive, String phone, Animal pet, Car car, double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.isALive = isALive;
        this.phone = phone;
        this.pet = pet;
        this.car = car;
        this.salary = salary;
        this.salaryGetInfoTime= java.time.LocalDateTime.now();
    }

    public double getSalary() {
        System.out.println(salaryGetInfoTime);
        return salary;
    }

    public void setSalary(double newSalary){
        if (newSalary<=0){
            System.out.println("nie mozna przypisac zerowej zaplaty");
        }else {
            System.out.println("dane zostały wysłane do systemu księgowego");
            System.out.println("mozliwosc odebrania aneksu do umowy od pani Hani z kadr");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
            this.salary=newSalary;
        }
    }


    @Override
    public String toString() {
        return "Human{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", isALive=" + isALive +
                ", phone='" + phone + '\'' +
                ", pet=" + pet +
                ", car=" + car +
                ", salary=" + salary +
                ", salaryGetInfoTime=" + salaryGetInfoTime +
                '}';
    }
}

