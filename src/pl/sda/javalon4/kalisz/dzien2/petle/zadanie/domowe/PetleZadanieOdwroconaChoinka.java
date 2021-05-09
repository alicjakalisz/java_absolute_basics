package pl.sda.javalon4.kalisz.dzien2.petle.zadanie.domowe;

import java.util.Scanner;

public class PetleZadanieOdwroconaChoinka {

    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        System.out.println("Wpraowdaz liczbe");
        int r=scanner.nextInt();


        for(int x=r-1; x>=0; x--){
            int spacje=r-1-x; // ilosc spacji - pierwsza petla 4 spacje, potem 3 spacje, potem 2
            int gwiazdki=(2*x)+1; // ilosc gwiazdek - pierwsza petla 1 gwiazka, potem 3, potem 5, potem

            for(int i=0; i< spacje; i++){
                System.out.print(" "); // drukujemt spacje

            }// fori
            for (int i = 0; i <gwiazdki; i++) {
                System.out.print("*"); // drukujemy gwiazdki

            }
            System.out.println(); //???????
        }




    }
}
