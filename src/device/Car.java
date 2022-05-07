package device;

public class Car {

    private final String model;
    private  final String producer;
    private double millage;
    private double engineVolume;
    private String color;
    private double value;

    public Car(String model,String producer,double millage,double engineVolume,String color,double value){
        this.model=model;
        this.producer=producer;
        this.millage=millage;
        this.engineVolume=engineVolume;
        this.color=color;
        this.value=value;
    }
    public double getCarValue(){
        return this.value;
    }
    /*public String toString(){
        return "device.Car model is "+model+" producer "+producer+" millage "+millage+" engine volume is "+engineVolume+" end color is "+color;
    }*/
}
