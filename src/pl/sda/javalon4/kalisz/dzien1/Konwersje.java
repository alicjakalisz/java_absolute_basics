package pl.sda.javalon4.kalisz.dzien1;

public class Konwersje {

    public static void main(String[] args) {

        short s= 123; // check scenario with 123 as this is inside of byte as well
        int i= s; // normalnie przypisanie interegerowi mniejszego typu (bo mniejszy we wiekszym)
        byte b= (byte) s; // przypisujemy wieksza objetosc do mniejszej wiec kasting

        System.out.println(s);
        System.out.println(i);
        System.out.println(b); // syf przy 150,

        System.out.println("*********************");



        short s2= 10000; // miescie sie
        int i2= s2; // short przypisany do int- miesci sie bo int wiekszy
        byte b2 =(byte) s2; // byte mniejszy od shorta wiec syf

        System.out.println(s2);
        System.out.println(i2);
        System.out.println(b2);


        System.out.println("**************");

        // short s3=100000;  za duza liczba i podkresla bo bo musimy wrzucic do wiekszego typu
        long l= 1000000000000L; // jak brakuje L na koncu to podkresla

        System.out.println(l);




    }
}
