package device;
import creatures.salleable;

public abstract class Device implements salleable  {

    private final String model;
    private  final String producer;
    private final int yearOfProduction;
    private double price;

    public Device(String model,String producer,int yearOfProduction,double price){
        this.model=model;
        this.producer=producer;
        this.yearOfProduction=yearOfProduction;
        this.price=price;
    }

    public abstract boolean turnOn(boolean syg);

    @Override
    public String toString() {
        return "Device{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
