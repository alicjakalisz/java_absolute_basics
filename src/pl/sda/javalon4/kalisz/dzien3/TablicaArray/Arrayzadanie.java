package pl.sda.javalon4.kalisz.dzien3.TablicaArray;

import java.util.Scanner;

public class Arrayzadanie {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Wpisz dlugosc tablicy");
        int n=scanner.nextInt(); // pobieramy dlugosc tablicy od uzytkownika

        int[] array=new int[n]; // tablica o dlogisc n - liczba elementow n o wartosc 0 wsszystkie narazie

        for (int i = 0; i < n ; i++) {// wpisywanie 1,2,3,4...n
            array[i] = i+1; // wpisywanie wartosc do tablicy pod indeskem i
            System.out.println(array[i]);
        }


    }

}
