package pl.sda.javalon4.kalisz.dzien4;

public class TestDat {

    public static void main(String[] args) {
        Data dataUrodzenia = new Data(); // powolanie obiektu typu Data // nie podalismy w atrubutach tej klasy niczego wiec domyslnie 0// Data
        // Data ma takie pola, miejca w sobie jak je zadeklarowalismy
        // Data ma 3 pola, atrybuty - dzien, miesiac , rok
        System.out.println(dataUrodzenia.dzien); // wyciagamy co jest w srodku dzien
        System.out.println(dataUrodzenia.miesiac);
        System.out.println(dataUrodzenia.rok);
        dataUrodzenia.dzien= 15; // wpisywanie wartosci do int dzien
        dataUrodzenia.miesiac=11;
        dataUrodzenia.rok=1993;
        System.out.println(dataUrodzenia.dzien); //po napisaniu wartosci
        System.out.println(dataUrodzenia.miesiac);
        System.out.println(dataUrodzenia.rok);

        Data dzisiaj= new Data();
        dzisiaj.dzien=8;
        dzisiaj.miesiac=3;
        dzisiaj.rok=2020;

        System.out.println(dataUrodzenia.dzien); // dataUrodzenia i dzisiaj to sa dwa rozne obiekty Klasy
        System.out.println(dataUrodzenia.miesiac);
        System.out.println(dataUrodzenia.rok);

        System.out.println(dzisiaj.dzien);
        System.out.println(dzisiaj.miesiac);
        System.out.println(dzisiaj.rok);




    }
}
