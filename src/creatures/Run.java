package creatures;
import device.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Pet kotRex = new Pet("cat", "rex", 1.0, 1, true);
        Pet piesReksio = new Pet("reksio", true);

        Phone Nokia3310 = new Phone("3310", "Nokia", 2000, 011001010, 25);

        Diesel confortableCar= new Diesel("607","Peugeot", 2002,
                240000, 2.2, "black", 8000, 80);


        Human Grzegorz = new Human("Grzegorz", "Brzenczyszczykiewicz", true,
                Nokia3310, kotRex, confortableCar, 5000.1, 100000.1);


        Human Stefan = new Human("Stefan", "Spalina", true, null, null,
                null, 5000, 25000);

        FarmAnimal cow = new FarmAnimal("cow", null, 400, 2, true);
        cow.feed(10);
        cow.beEaten();
/*
        try {
            Nokia3310.sell(Grzegorz, Stefan, 100);
        } catch (Exception e){
            System.out.println("nie udało się sprzedać "+Nokia3310);
            e.printStackTrace();

        }
        try {
            confortableCar.sell(Grzegorz,Stefan, 12000);
        } catch (Exception e){
            System.out.println("nie udało się sprzedać "+confortableCar);
            e.printStackTrace();
        }

 */
        int[] numbers = new int[11];


        for (int i = 0; i < 11; i++) {
            numbers[i] = i;
        }
        for (int i = 10; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        String[] miesiace = {"styczen", "luty", "marzec", "kwiecien", "maj", "czerwiec", "lipec", "sierpien",
                "wrzesien", "pazdziernik", "listopad", "grudzien" };
        for (int i = 0; i <= 11; i++) {
            if (i % 2 == 0) {
                System.out.println(miesiace[i]);
            }
        }

        int[] numbers2=new int[10];

        System.out.println("podaj dowolne liczby");
        for (int i=0; i<=9; i++){
            System.out.println("podaj liczbe nr."+i);
            int a= getInt();
            numbers2[i]=a;
        }

        System.out.println(numbers2);


        Arrays.sort(numbers2);

        for (int number : numbers2) {
            System.out.println(number);
        }

        System.out.println("[1] podaj nazwe zwierzecia zapisz w liście");
        System.out.println("[2] wypisz zwierzęta i zakończ program");



    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}
