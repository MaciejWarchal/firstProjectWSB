package device;
import creatures.Animal;
import creatures.Human;
import creatures.salleable;

import java.time.LocalDateTime;

public class Phone extends Device implements salleable  {
    private int number;
    public Phone(String model, String producer, int yearOfProduction,int number,double price) {
        super(model, producer, yearOfProduction,price);
        this.number=number;
    }


    @Override
    public void sell(creatures.Human saller, creatures.Human buyer, double price) {
        if (saller.getPhone().equals(null)){
            System.out.println("Sprzedający nie posiada telefonu");
        } else {
            if (buyer.getCash()<price){
                System.out.println("kupujący nie ma tyle pieniedzy na zakup");
            } else {
                buyer.setCash(buyer.getCash()-price);
                saller.setCash(saller.getCash()+price);
                buyer.setPhone(saller.getPhone());
                System.out.println("Sprzedano telefon "+saller.getPhone().toString());
            }
        }
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
