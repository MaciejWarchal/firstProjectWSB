package device;
import creatures.*;

public abstract class Car extends Device {


    private double millage;
    private double engineVolume;
    private String color;
    private double value;

    public Car(String model, String producer, int yearOfProduction, double millage, double engineVolume, String color,
               double price) {
        super(model, producer, yearOfProduction, price);
        this.millage = millage;
        this.engineVolume = engineVolume;
        this.color = color;
        this.value = value;
    }

    public abstract void reFuel();

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public void sell(Human saller, Human buyer, double price) throws Exception {
        if (!(saller.getCar().equals(this)))
            throw new Exception("tranzakcja nie mozliwa");

       if(buyer.getCash()<price)
            throw new Exception("kupujący nie ma dosc pieniedzy");


       else {
               buyer.setCash(buyer.getCash()-price);
               saller.setCash(saller.getCash()+price);
               Car sealledCar= saller.getCar();
               buyer.setCar(sealledCar);
               saller.setCar(null);
               System.out.println("Sprzedający "+saller+" sprzedał samochod "+sealledCar+" osobie "+buyer+" za "+price+ "zl.");
       }
    }

    public double getCarValue(){
        return this.value;
    }

    @Override
    public boolean turnOn(boolean syg) {
        if (syg==true){
            System.out.println("włączono urządzenie");
            return true;
        } else {
            System.out.println("wyłączono urządzenie");
            return false;
        }
    }


}
