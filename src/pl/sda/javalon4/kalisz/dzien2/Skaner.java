package pl.sda.javalon4.kalisz.dzien2;

import java.util.Scanner;

public class Skaner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // obiekt scanner stworzony

        System.out.println("Witaj w aplikacji, prosze podaj swoje imie");
        String imie= scanner.nextLine(); // tworzymy variable aby trzymac wynik skanera
        System.out.println("Czesc "+ imie);

        System.out.println("W ktorym roku sie urodzilas");
        int rok=scanner.nextInt();
        System.out.println(" Masz " + (2020- rok) + " lata");

        // alterantyvnie najpierw przypisac wiek do jakiejs zmiennej i potem wydrukkowac



    }
}
