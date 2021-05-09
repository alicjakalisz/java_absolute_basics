package pl.sda.javalon4.kalisz.dzien2.petle.zbior;

import java.util.Scanner;

public class Zbior3 {

    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        int a;
        int b;
        int result=1;
        System.out.println("Wpisz wartosc a: ");
        a=scanner.nextInt();
        System.out.println("Wpisz wartosc b: ");
        b=scanner.nextInt();

        for(int i=0; i<b; i++){
            result=result*a;

        }
        System.out.println(" Wartosc a: " + a + "podniesiona do potegi b: "+ b + " wynosi: "+ result);
    }
}
