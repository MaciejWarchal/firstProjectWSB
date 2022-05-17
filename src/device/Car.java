package device;
import creatures.*;

public class Car extends Device {


    private double millage;
    private double engineVolume;
    private String color;
    private double value;

    public Car(String model,String producer,int yearOfProduction, double millage,double engineVolume,String color,
               double price ){
        super(model,producer,yearOfProduction,price);
        this.millage=millage;
        this.engineVolume=engineVolume;
        this.color=color;
        this.value=value;
    }

    @Override
    public void sell(Human saller, Human buyer, double price) {
       if (saller.getCar().equals(null)){
           System.out.println("tranzakcja nie mozliwa");
       }
       else {
           if (buyer.getCash()<price){
               System.out.println("kupujący nie ma dosc pieniedzy");
           }
           else {
               buyer.setCash(buyer.getCash()-price);
               saller.setCash(saller.getCash()+price);
               Car sealledCar= saller.getCar();
               buyer.setCar(sealledCar);
               saller.setCar(null);
               System.out.println("Sprzedający "+saller+" sprzedał samochod "+sealledCar+" osobie "+buyer+" za "+price+ "zl.");
           }
       }

    }

    public double getCarValue(){
        return this.value;
    }

    @Override
    public boolean turnOn(boolean syg) {
        if (syg==true){
            System.out.println("włączono urządzenie");
            return true;}
        else {
            System.out.println("wyłączono urządzenie");
            return false;
        }
    }


}
