public class Run {
    public static void main(String[] args){
        Animal rex= new Animal("cat","rex",1.0, 1, true);
        Animal reksio= new Animal("reksio",true);
        System.out.println(rex.toString());
        System.out.println(reksio.toString());
        rex.feed();
        System.out.println("nakarmiono kota");
        System.out.println(rex.toString());
        rex.takeAWalk();
        System.out.println("kot po spacerze");
        System.out.println(rex.toString());

        reksio.takeAWalk();
        System.out.println("pise po spacerze");
        System.out.println(reksio.toString());
        reksio.takeAWalk();
        System.out.println("pise po spacerze");
        System.out.println(reksio.toString());




    }
}
