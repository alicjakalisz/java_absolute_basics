package pl.sda.javalon4.kalisz.dzien2;

import java.util.Scanner;

public class DoWhile {

    // ktory sumuje liczby tak dlugo az uzytinok poda 0

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int suma=0; // szufladka na pamiec
        int x;
        do{
            x=scanner.nextInt();
            suma=suma+x;
            System.out.println(suma);
        }while(x!=0);

    }
}
