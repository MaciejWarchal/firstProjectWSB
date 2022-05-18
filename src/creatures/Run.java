package creatures;
import device.*;

public class Run {
    public static void main(String[] args){

        Pet kotRex= new Pet("cat","rex",1.0, 1, true);
        Pet piesReksio= new Pet("reksio", true);

        Phone Nokia3310= new Phone("3310","Nokia",2000 , 011001010, 25);

        Car confortableCar=new Car("607","Peugeot", 2002, 240000, 2.2
                , "black",8000);


        Human Grzegorz = new Human("Grzegorz","Brzenczyszczykiewicz",true,
                null, kotRex,confortableCar,5000.1,100000.1);


        Human Stefan= new Human("Stefan","Spalina", true, null,null,
                null,5000 , 25000);

        FarmAnimal cow= new FarmAnimal("cow", null,400, 2, true);
        cow.feed(10);
        cow.beEaten();










    }
}
