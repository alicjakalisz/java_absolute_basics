package pl.sda.javalon4.kalisz.dzien2.petle.zadanie.domowe;

import java.util.Scanner;

public class PetleZadaniaDomowe6 {
    //pobrac liczbe calkowieta dodatka od yztkownika a a nastepnie wystwietlic na ekranie wszystkie potegi liczby 2 nie wieksze niz podana liczba
    //71: 2 4 8 16 32 64
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe dodatnia calkowita");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Podaj liczbe dodatnia");
        } else {
            for (int i = 1; i < n; i = i * 2) {
                System.out.println(i);
            }
        }
    }
}

