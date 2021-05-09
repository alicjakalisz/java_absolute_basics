package pl.sda.javalon4.kalisz.dzien4;

public class TestMnie {
    public static void main(String[] args) {

        Osoba ja= new Osoba();// klasa Osoba ma puste pola w 3 atrubutach: imie (0), nazwisko (0), anotherDataUrodzenia(Null- bo obiekt klasy Data)
        ja.imie= "Alicja";
        ja.nazwisko="Kalisz";
        Data anotherDataUrodzenia= new Data();// oosbyn obieky klasy Data aby przetestowac roznice
        ja.dataUrodzenia = new Data(); // wczesniej w dataurodzenia byl null (bo obiekt), wiec teraz tworzysz instancje i ponizej uzupelniasz jej pola
        ja.dataUrodzenia.dzien=21;
        ja.dataUrodzenia.miesiac=5;
        ja.dataUrodzenia.rok=1987;
        System.out.println(ja.dataUrodzenia.dzien);// nie dziala
        anotherDataUrodzenia.dzien=24;
        System.out.println(ja.dataUrodzenia.dzien);
        System.out.println(anotherDataUrodzenia.dzien);


    }
}
