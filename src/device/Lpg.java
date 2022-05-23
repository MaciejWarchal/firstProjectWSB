package device;

public class Lpg extends Car{

    private double gasLevel;

    public Lpg(String model, String producer, int yearOfProduction, double millage, double engineVolume,
               String color, double price, double gasLevel) {
        super(model, producer, yearOfProduction, millage, engineVolume, color, price);
        this.gasLevel=gasLevel;
    }


    @Override
    public void reFuel() {
        System.out.println("zatankowano gaz");
    }
}
