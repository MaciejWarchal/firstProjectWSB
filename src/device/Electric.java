package device;

public class Electric extends Car{
    private double chrgeLevel;

    public Electric(String model, String producer, int yearOfProduction, double millage, double engineVolume,
                    String color, double price,double chrgeLevel) {
        super(model, producer, yearOfProduction, millage, engineVolume, color, price);
        this.chrgeLevel=chrgeLevel;
    }

    @Override
    public void reFuel() {
        System.out.println("naładowano");
    }

    }


