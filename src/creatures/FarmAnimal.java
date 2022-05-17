package creatures;

public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String spacies, String name, double weight, int age, boolean isALive){
        super(spacies, name, weight, age, isALive);
    }


    public void feed(){
        this.weight+=1;
        System.out.println("thx for feeding");
    }



    @Override
    public void feed(int food, double weight) {
        this.weight+=food;
        System.out.println("waga zwierzęcia wzrosła");

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
        this.weight-=1;
        System.out.println("Smacznego");
    }
}
