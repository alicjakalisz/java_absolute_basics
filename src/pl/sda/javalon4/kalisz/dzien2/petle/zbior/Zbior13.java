package pl.sda.javalon4.kalisz.dzien2.petle.zbior;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Zbior13 {

    // read 5 numbers and print them out removing duplicates

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int i=0;
        Set<Integer> set= new HashSet<>();
        int n=5; // ilosc numerow
        int number=0;
        while(i<n){
            System.out.println("Wpisz numer");
            number=scanner.nextInt();
            set.add(number);
            i++;

        }
        System.out.println("The list wihtout duplicates is : " + set);
    }
}
