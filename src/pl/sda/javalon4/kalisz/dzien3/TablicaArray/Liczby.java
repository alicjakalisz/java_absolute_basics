package pl.sda.javalon4.kalisz.dzien3.TablicaArray;

import java.util.Scanner;

public class Liczby {
    //Wczytaj do tablicy 10 liczb wprowadzonych przez uzytkownika.
    //Nastepnie popros go o podanie 2 indeksow i wydrukuje sume elemenetow o podanych indeksach

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz libcze");
        int n = 10;// 10 liczb
        int liczba = 0;
        int[] tablica = new int[10];

        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbe: " + (i + 1));
            liczba = scanner.nextInt();
            {
                tablica[i] = liczba;

            }
        }


        System.out.println("Podaj jakis indeks");
        int indeksA = scanner.nextInt();
        System.out.println("Podaj kolejny indeks");
        int indeksB = scanner.nextInt();
        int a = tablica[indeksA];
        int b = tablica[indeksB];
        System.out.println("Wynik: " + (a + b));

    }
}

