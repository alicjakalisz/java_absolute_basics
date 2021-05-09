package pl.sda.javalon4.kalisz.dzien4;

public class MiesiacewDacie {

    public static void main(String[] args) {
        Data wczesniejsza= new Data(); // tworzymy obiekt typu Data , narazie pola (atrybuty 0 bo nic nie bylo nadpisane w klasie
        wczesniejsza.rok=2001;// wpisujemy wartosci dla kazdego pola obietku
        wczesniejsza.miesiac=9;// wpisujemy wartosci dla kazdego pola obiektu
        wczesniejsza.dzien=11; // wpisujemy wartosci dla kazdego pola obiektu
        Data pozniejsza = new Data(); // drugi obiekt
        pozniejsza.rok=2010;
        pozniejsza.miesiac=4;
        pozniejsza.dzien=10;
        System.out.println(miesiaceMiedzy(wczesniejsza,pozniejsza)/12);// uzywamy metody ponizej ktora uzywa parametorw klasy Data i potrzbeuje dwoch obietkorw
    }

    public static int miesiaceMiedzy(Data wczesniejsza, Data pozniejsza){

        return ((pozniejsza.rok-wczesniejsza.rok) * 12) + pozniejsza.miesiac-wczesniejsza.miesiac;
    }
}
