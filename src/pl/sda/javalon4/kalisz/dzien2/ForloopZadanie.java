package pl.sda.javalon4.kalisz.dzien2;

import java.util.Scanner;

public class ForloopZadanie {
   /* 1) PObiera liczbe od uzytkownica

   2) jeszeli n jest  wieksza niz 100 , zwraca komunikat " za duza libcza"
   3)jezelie n nie jest wieksza od 100 to n razy wypisuje "Javaol4"
   */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pobierz liczbe od uzytkownika");
        int n= scanner.nextInt();

        if(n>100){
            System.out.println("Za duza liczba");
        }else{

            for(int i=0;i<n;i++ ){ // jezeli liczba n od uzytkownika nie jest wieksza od 100 to wtedy wypisujemy tyle razy co n napis Javalon, czyli np 5 razy (n=5)
                                    // wiec i to liczba petli, zaczynamy od poczatku, i liczba petli nie moze przekraczac liczby n bo mowi ilez razy mamy wrzucic kod

                System.out.println("Javalon4");
            }
        }


    }





}
