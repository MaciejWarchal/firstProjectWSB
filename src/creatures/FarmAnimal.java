package creatures;

public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String spacies, String name, double weight, int age, boolean isALive){
        super(spacies, name, weight, age, isALive);
    }

    @Override
    public void feed() {
        this.weight+=1;
        System.out.println("nakarmiono");

    }
    @Override
    public void feed(double foodWeight){
        this.weight+=foodWeight;
        System.out.println("thx for feeding");
        System.out.println("Now weight of animali is "+this.weight);
    }




    public String toString(){
        if (this.weight>0){
            return "To zwirze to "+spacies+" na imie ma "+name+" jego wago to "+weight+" ma "+age+" lat.";
        }else {
            return "To zwirze jest martwe "+spacies+" na imie ma "+name+" jego wago to "+weight+" ma "+age+" lat.";
        }
    }

    @Override
    public void beEaten() {
        this.isALive= false;
        System.out.println("zwierze zjedzono");
    }
}
