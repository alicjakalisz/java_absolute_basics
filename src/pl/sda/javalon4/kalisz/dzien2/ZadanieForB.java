package pl.sda.javalon4.kalisz.dzien2;

import java.util.Scanner;

public class ZadanieForB {

    /* 1)wczytanie liczby od uzytkoniwak
    2)jesli mniejsze niz 2, wypisujemy ze za mala liczna
    3)wypisujemy wszystkie dzielniki tej liczby
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbe");
        int liczba = scanner.nextInt();
        if (liczba < 2) {
            System.out.println(" za mala liczba");
        } else {

            for (int i = 1; i < liczba; i++) {
                if (liczba%i == 00) {

                    System.out.println(i);
                }

            }

        }
    }}
