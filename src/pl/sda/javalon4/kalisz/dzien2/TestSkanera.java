package pl.sda.javalon4.kalisz.dzien2;

import java.util.Scanner; // java ma package java util, podstawowa bilbioteka javy z klasami i metodami

public class TestSkanera {

    public static void main(String[] args) {
        System.out.println("magiczna czarna skrzynka"); // system out do konsoli drukuje

        Scanner mojSkaner= new Scanner(System.in); // system in z konsoli odczytuje
        String podanyTekst= mojSkaner.nextLine(); // tworzymy obiekt (zmienna) typu String aby trzymac tam odczyt, przypusjemy skaner tam i po kropce wybieramy funcje tego skanera
        System.out.println(podanyTekst); // podaj teskt


        int liczba=mojSkaner.nextInt(); // aplikacja czeka na liczbe, przejdzie dalej jak podamy liczbe
        System.out.println(liczba); //  przechodzi dalej,do tej lini i drukuje zawartosc uzyskane od uzytniwnika;



    }




}
