package creatures;

import device.Car;
import java.time.LocalDateTime;


public abstract class Animal implements salleable,Feedable {

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

    public void sell(creatures.Human saller, creatures.Human buyer, double price) {
        if (saller.getPhone().equals(null)){
            System.out.println("Sprzedający nie posiada zwierzęcia");
        } else {
            if (buyer.getCash()<price){
                System.out.println("kupujący nie ma tyle pieniedzy na zakup");
            } else {
                buyer.setCash(buyer.getCash()-price);
                saller.setCash(saller.getCash()+price);
                buyer.setPhone(saller.getPhone());
                System.out.println("Sprzedano zwierze "+saller.getPhone().toString());
            }
        }
    }


    void takeAWalk(){
        if (this.weight<=0){
            System.out.println("this animal is dead");
        } else {
            this.weight-=1;
        }
    }



    public abstract String toString();



}
