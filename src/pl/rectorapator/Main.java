package pl.rectorapator;

public class Main {

    public static void main(String[] args) {
        Garnek garnek = new Garnek();

        garnek.średnica = 7;
        garnek.wysokość = 5;
        garnek. kolor = "Srebrny";

        System.out.println(garnek.średnica);
        System.out.println(garnek.wysokość);
        System.out.println(garnek.kolor);
    }
}