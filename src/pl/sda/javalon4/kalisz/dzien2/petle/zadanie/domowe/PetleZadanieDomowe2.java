package pl.sda.javalon4.kalisz.dzien2.petle.zadanie.domowe;

import java.util.Scanner;

public class PetleZadanieDomowe2 {
    public static void main(String[] args) {


        // napisz aplikacja ktora przyjmuje ilosc powtorzen od skanera i ta ilosc wypisuje na ekan Hellow world - for i while petla

        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj ilosc powtorzen");
        int n= scanner.nextInt();

        for(int i=0; i<n;i++){
            System.out.println("Hello World");
        }

        int i=0;
        while(i<n){
            System.out.println("Hellow World");
            i++;
        }

        }
    }

