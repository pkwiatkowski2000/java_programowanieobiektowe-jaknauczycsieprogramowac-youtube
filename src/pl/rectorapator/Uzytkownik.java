package pl.rectorapator;

public class Uzytkownik {
    private int wiek;
    private String imie;

    public Uzytkownik(int wiek, String imie) {
        this.wiek = wiek;
        this.imie = imie;

    }

    public boolean czyMozeLegalnieKupicAlkohol() {
        if (wiek >= 18) {
            return true;
        } else {
            return false;
        }
    }
}


