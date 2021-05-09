package pl.sda.javalon4.kalisz.dzien2;

import java.util.Scanner;
// suma cyfr liczby
public class PetlaWhile {


    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Podaj liczbe");
        int n= scanner.nextInt();


        //for (int i =0; i<=n; i++)
        int suma=0;
        int i=1;
        while(i<=n){

           suma = suma + i;
           i++;

        }
        System.out.println("Suma to "+ suma);
    }
}
