package device;

public class Diesel extends Car{

    private double tankLevel;

    public Diesel(String model, String producer, int yearOfProduction, double millage, double engineVolume,
                  String color, double price,double tankLevel) {
        super(model, producer, yearOfProduction, millage, engineVolume, color, price);
        this.tankLevel=tankLevel;
    }

    @Override
    public void reFuel() {
        System.out.println("zatankowano rope");
    }
}
