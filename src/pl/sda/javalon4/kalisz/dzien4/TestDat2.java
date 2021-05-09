package pl.sda.javalon4.kalisz.dzien4;

public class TestDat2 {
    public static void main(String[] args) {

        Data dataUrodzenia= new Data(); // obiekt Data
        dataUrodzenia.dzien= 15;
        dataUrodzenia.miesiac=11;
        dataUrodzenia.rok=1993;
        Data dzis= new Data(); // obiekt Data
        dzis.dzien=8;
        dzis.miesiac=3;
        dzis.rok=2020;

        System.out.println(dataUrodzenia.przerobNaTekst());// metoda przerobNaTekst z klasy Data, uzyta na obiekcie klasy Data
        System.out.println(dzis.przerobNaTekst());
    }
}
