package pl.sda.javalon4.kalisz.dzien2;

public class TestMath {
    public static void main(String[] args) {
        // round(), abs(), floor (double)= doubke, random(), PI, pow(double a, double b) =double(potegowanie)

        System.out.println(Math.round(34.59));
        System.out.println(Math.round(123.36)); // clasa Math ctrl and click to see inside of this class // jak nie mowi aby importanc to sie nie importuje :) to jest pakiet java lang
        System.out.println(Math.abs(149));
        System.out.println(Math.abs(-294));
        System.out.println(Math.random()); //dotajemy liczbe ktora jest zawsze pomiedzy 0(including) a 1 (excluding) , (0.12324355)i mnozymy od n;
        System.out.println(Math.pow(3,2)); // potegowanie , pierwsze liczba druga do ktorej potegi;


        System.out.println("Od 0 do 99 wlacznie");
        System.out.println((int) (Math.random()* 100));// random zwraca double 0-1 wiec jak chcemy int to trzeba rzutowac ale jak nie damy * 100 do nawiasow to bedzie 0, wiec pamietaj.
        // losuje od 0-99
        System.out.println("od 0 do 100 wlacznie");
        System.out.println((int) (Math.random()*101));// losuje od 0 do 100 wlasnie

        System.out.println("Od 5 do 100 wlacznie");

        System.out.println((int)Math.random() * (100-5+1)+5);// od 5-100
        int liczbaOd=100;
        int liczbaDo=1000;
        // LOSOWANIE OD A DO B calkowitych - FORUMLA
        int drugaWylosowanaliczba = (int) (Math.random()* (liczbaDo-liczbaOd+1) + liczbaOd);
        System.out.println(drugaWylosowanaliczba);




    }
}
