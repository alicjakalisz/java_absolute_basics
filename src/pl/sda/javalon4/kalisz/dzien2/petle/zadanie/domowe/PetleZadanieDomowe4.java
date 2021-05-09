package pl.sda.javalon4.kalisz.dzien2.petle.zadanie.domowe;

import java.util.Scanner;

public class PetleZadanieDomowe4 {
    // rogram  wktórym żytkownikpodajenapoczątkudwieliczby:początekZakresu​​oraz​koniecZakresu​​.
    // Upewnijsięże​początekZakresu<koniecZakresu ​​a następniea.pobierzodużytkownikakolejnąliczbę-​dzielnik.
    // Po pobraniu dzielnika wypisz wszystkie liczby od​ początek Zakresu​​ do​ koniecZakresu któresą podzielne przez ​dzielnik​​.b.
    // *pobierz odużytkownika ​iloscDzielnikow​​, a następnie wczytajwszystkiedzielniki.PowczytaniuwszystkichdzielnikowwypiszwszystkieliczbyodpoczatekZakresu​​do​koniecZakresuktóresąpodzielneprzez​wszystkiedzielniki.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwie liczby jako poczatek i koniec zakresu");
        int poczatekZakresu = scanner.nextInt();
        int koniecZakresu = scanner.nextInt();
        int dzielnik;
        if (poczatekZakresu > koniecZakresu) {
            System.out.println("Poczatek zakresu musimy byc liczba mniejsza od konca zakresu");
        } else {
            System.out.print("Introduce the divident: ");
            dzielnik = scanner.nextInt();
            for (int i = poczatekZakresu; i < koniecZakresu; i++) {
                if (i % dzielnik == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}

