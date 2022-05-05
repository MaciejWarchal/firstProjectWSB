public class Animal {

    final private String spacies;
    final private String name;
    private double weight;
    private int age;
    private boolean isALive;



    public Animal(String name,boolean isALive){
        this("dog",name,1.0,1,isALive);
    }

    public Animal(String spacies, String name, double weight, int age, boolean isALive) {
        this.spacies = spacies;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.isALive = isALive;
        }

        void feed(){
        this.weight+=1;
            System.out.println("thx for feeding");
        }
        void takeAWalk(){
        if (this.weight<=0){
            System.out.println("this animal is dead");
        } else {
            this.weight-=1;
        }
        }
        public String toString(){
            if (this.weight>0){
            return "To zwirze to "+spacies+" na imie ma "+name+" jego wago to "+weight+" ma "+age+" lat.";
            }else {
            return "To zwirze jest martwe "+spacies+" na imie ma "+name+" jego wago to "+weight+" ma "+age+" lat.";
        }
        }

}
