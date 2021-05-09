package pl.sda.javalon4.kalisz.dzien3.TablicaArray;

import java.util.Scanner;

public class Wiek {
    //Stworz i wypelnij tablice imionami, i stworz tablice wiekow z 0. Korzystajac z petli for each popros uzytwkonika o podanice wieku osoby o tym imieniu i zaoisz ten wiek do tabkicy wiekoa.
    //Po wprowadzenniu wszystkich wiekow wydrukuj wszystkie imiona razem z ich wiekami w formacie:
    //"{imie}-{wiek}"
    public static void main(String[] args) {
        String[] imiona = new String[]{"Asia", "Kasia", "Basia", "Ela"};
        Scanner scanner = new Scanner(System.in);
        int[] wiek = new int[imiona.length];
        int i = 0;

        for (String imie : imiona) {
            System.out.println(imie);
            System.out.println("Podaj wiek dla imienia: " + imie);
            wiek[i] = scanner.nextInt();// wczytujemy wiek do tablicy wiek wiec wpisujemy wiek[i] ktory poczatkowo ustalimismy jako 0 czyli pierwsze imie dostnaie przypisany ten wiek co uzytkowbik podal
            i++; // nastepnie zwiekszamy i
        }

        for (int j = 0; j <imiona.length ; j++) {
            System.out.println(imiona[j]+ "-" + wiek[j]);

        }

    }
}