package creatures;

public class Pet extends Animal {

    public Pet(String name,boolean isALive){
        this("dog",name,1.0,1,isALive);
    }

    public Pet(String spacies, String name, double weight, int age, boolean isALive) {
        super(spacies, name, weight, age, isALive);
    }

    public void feed(){
        this.weight+=1;
        System.out.println("thx for feeding");
    }

    @Override
    public void feed(double foodWeight) {
        this.weight+=foodWeight;
        System.out.println("Nakarmono zwirze domowe");
    }


    public String toString(){
        if (this.weight>0){
            return "To zwirze to "+spacies+" na imie ma "+name+" jego wago to "+weight+" ma "+age+" lat.";
        }else {
            return "To zwirze jest martwe "+spacies+" na imie ma "+name+" jego wago to "+weight+" ma "+age+" lat.";
        }
    }


}
