package pl.sda.javalon4.kalisz.dzien2.petle.zadanie.domowe;

import java.util.Scanner;

public class PetleZadanieDomowe3 {

    //wypisuje Hello World dopoki uzytkownik podaje liczby wieksz od 0


    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        int number=scanner.nextInt(); // pierwszy number
        while(number>0){        // wchodzi w petle, sprawdza czy number spelnia warunek i jak tak to wykonuje kod
            System.out.println("Hello World"); // wykonanie kodu
            number=scanner.nextInt();// przed wyjsciem z petli pyta spowrotem o kolejny numer, jesli nie prezczytac ponownie tego numeru to bedziesz miec nieskoczona petle
        }


    }
}
