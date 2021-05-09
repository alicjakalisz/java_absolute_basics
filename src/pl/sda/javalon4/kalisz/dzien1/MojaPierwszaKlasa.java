package pl.sda.javalon4.kalisz.dzien1;

public class MojaPierwszaKlasa { // definujemy klase i podajemy nazwe, rzeczy pomiedzyn klmaerkami


    public static void main(String[] args) { // psvm skrot ; kazda klasa aby ja odpalac musi miec metode, wewnatrz metody code to execute


        System.out.println("Alicja Kalisz");
        System.out.println("Alicja");
        System.out.println("");
        System.out.println("Kalisz");

       // lub mozna tak  - ESCAPE CHAR  \n - new line
        System.out.println("Alicja \n\n\n\nKalisz");


        // napisz Piotr\\Gawronski
        System.out.println("Piotr\\Gawronski");

        //Piotr Gawrosnki z tabulatorem
        System.out.println("Piotr\tGawronski");
        System.out.println("Piotr\t\tGawronski");
        System.out.println("Piotr\t\tGawronski");


        //cuddzyslow  \ dajesz przed tym co chcesz wyecapowac

        System.out.println("Piotr \"Gawronski\"");

        /*jfghf
        fghkghf
         */

        System.out.println(132);
        System.out.println("132");
        System.out.println(8+13);
        System.out.println("8 "+"13");


        // tworenie zmiennej - declare variable
        int liczba; //zmienna typu integer o nazwie liczba, does not have a value
        //initialiation of the variable
        liczba=5; // we are storing 5 into liczba variable
        System.out.println(liczba);

        String imie = " Kasia";
        System.out.println(imie);

        String zmienna; // zmienna piszemy z malej litery
        zmienna="moj pierwszy tekst"; // przypisujemy do zmiennej wartosc tekstowa
        System.out.println(zmienna);
        System.out.println("**********************");
        String a = "Hello World";
        String b= "Mam na imie";
        String c= "Alicja";
        //String a="Hello world", b="Mam na imie", c="Alicja";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a+" "+ b+" "+c);
        String d= "Hello World\nMam na imie \nAlicja";
        System.out.println(d);
        String jednaSklejona=a+"\n"+b+"\n"+c;
        System.out.println(jednaSklejona);





    }

}
