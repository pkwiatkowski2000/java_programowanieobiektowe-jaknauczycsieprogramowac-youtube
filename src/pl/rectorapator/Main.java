package pl.rectorapator;

/*public class Main {

    public static void main(String[] args) {
        Garnek garnek = new Garnek(5, 10);

        String wiadomosc = garnek.gotuj();
        System.out.println(wiadomosc);

        String wiadomosc2 = garnek.gotuj(true);
        System.out.println(wiadomosc2);

        int temperatura = garnek.zwrocTemperatureWrzeniaWody();
        System.out.println(garnek.zwrocTemperatureWrzeniaWody());

        garnek.gotujBezInformacji();*/

public class Main {

    public static void main(String[] args) {
        Uzytkownik mariusz = new Uzytkownik(20, "Mariusz");

        if (mariusz.czyMozeLegalnieKupicAlkohol()) {
            System.out.println("Może kupić");
        } else {
            System.out.println("Nie może kupić");
        }
    }
}