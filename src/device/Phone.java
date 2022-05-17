package device;


public class Phone extends Device  {
    private int number;
    public Phone(String model, String producer, int yearOfProduction,int number,double price) {
        super(model, producer, yearOfProduction,price);
        this.number=number;
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
