package creatures;

import device.Car;

import java.time.LocalDateTime;

public abstract class Animal implements Feedable, salleable {

    final protected String spacies;
    final protected String name;
    protected double weight;
    protected int age;
    protected boolean isALive;



    public Animal(String name,boolean isALive){
        this("dog",name,1.0,1,isALive);
    }

    public Animal(String spacies, String name, double weight, int age, boolean isALive) {
        this.spacies = spacies;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.isALive = isALive;
        }

        public abstract void feed();
        void takeAWalk(){
        if (this.weight<=0){
            System.out.println("this animal is dead");
        } else {
            this.weight-=1;
        }
        }

    public abstract void feed(int food, double weight);

    public abstract String toString();

    public static class Human {
        private final String firstname;
        private final String lastname;
        private boolean isALive;
        private String phone;
        private Animal pet;
        private Car car;
        private double salary;
        private LocalDateTime salaryInfoTime;
        private double cash;

        public Human(String firstname, String lastname, boolean isALive, String phone, Animal pet, Car car, double salary,double cash) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.isALive = isALive;
            this.phone = phone;
            this.pet = pet;
            this.car = car;
            this.salary = salary;
            this.salaryInfoTime= LocalDateTime.now();
            this.cash=cash;
        }

        public double getSalary() {
            System.out.println(salaryInfoTime);
            return salary;
        }

        public Car getCar(){
            return this.car;
        }

        public void setCar(Car car){
            if (this.salary>car.getCarValue()){
                System.out.println("udalo sie kupic za gotówke");
                this.car=car;
            }
            else if (this.salary>1/12*car.getCarValue()){
                System.out.println("auto kupisz za kredyt");
                this.car=car;
            } else {
                System.out.println("zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
            }

        }

        public void setSalary(double newSalary){
            if (newSalary<=0){
                System.out.println("nie mozna przypisac zerowej zaplaty");
            }else {
                System.out.println("dane zostały wysłane do systemu księgowego");
                System.out.println("mozliwosc odebrania aneksu do umowy od pani Hani z kadr");
                System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
                this.salary=newSalary;
                this.salaryInfoTime= LocalDateTime.now();
            }
        }


        @Override
        public String toString() {
            return "creatures.Animal.Human{" +
                    "firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", isALive=" + isALive +
                    ", phone='" + phone + '\'' +
                    ", pet=" + pet +
                    ", car=" + car +
                    ", salary=" + salary +
                    ", salaryGetInfoTime=" + salaryInfoTime +
                    '}';
        }
    }
}
