package pl.sda.javalon4.kalisz.dzien2.petle.zbior;

import java.util.Scanner;

public class Zbior4 {

    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        int silnia=1;
        int liczba;
        System.out.println("Wprowadz liczba dla ktorej obliczamy silnie");
        liczba=scanner.nextInt();

        for(int i=2; i<=liczba; i++){// i od 2 bo nie ma sensu mnozylc przez 1 and np dla liczby 6- silnia to  1* 2*3 *4*5*6
            silnia=silnia * i;
        }
        System.out.println("Silnia dla " + liczba+ " to "+ silnia);
    }
}
