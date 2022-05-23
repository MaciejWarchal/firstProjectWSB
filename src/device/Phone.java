package device;
import creatures.Animal;
import creatures.Human;
import creatures.salleable;

import java.net.URL;
import java.net.http.*;

import java.time.LocalDateTime;





public class Phone extends Device implements salleable  {
    private int number;
    private static final String DEFAULT_SERVER_ADDRES= "www.apps/install";
    private static final String DEFAULT_APP_VERSION="Lastest";



    public Phone(String model, String producer, int yearOfProduction,int number,double price) {
        super(model, producer, yearOfProduction,price);
        this.number=number;
    }


    @Override
    public void sell(creatures.Human saller, creatures.Human buyer, double price) throws Exception {
        if (!(saller.getPhone().equals(this))) {
            throw new Exception("Sprzedający nie posiada telefonu");
        }
        if (buyer.getCash()<price){
            throw new Exception("kupujący nie ma tyle pieniedzy na zakup");
        } else {
                buyer.setCash(buyer.getCash()-price);
                saller.setCash(saller.getCash()+price);
                buyer.setPhone(saller.getPhone());
                System.out.println("Sprzedano telefon "+saller.getPhone().toString());
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

    public boolean installAnnApp(String nazwaAplikacji){
        System.out.println("instaluję aplikacje "+nazwaAplikacji);
            return true;
    }
    public boolean installAnnApp(String nazwaAplikacji,String wersja) {
        System.out.println("instaluję aplikacje " + nazwaAplikacji+" "+wersja);
        return true;
    }

    public boolean installAnnApp(URL add){
        System.out.println("instaluję aplikacje o adresie URL "+add);
        return true;
    }








}
