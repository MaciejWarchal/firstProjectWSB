public class Run {
    public static void main(String[] args){

        Animal rex= new Animal("cat","rex",1.0, 1, true);
        Animal reksio= new Animal("reksio",true);
        Car secondCar= new Car("607","Peugeot",240.455 ,2.2 ,"black" , 8500);
        Human Grzegorz = new Human("Grzegorz","Brzenczyszczykiewicz",true,null, rex, secondCar,5000.1);

        System.out.println(Grzegorz.toString());







    }
}
