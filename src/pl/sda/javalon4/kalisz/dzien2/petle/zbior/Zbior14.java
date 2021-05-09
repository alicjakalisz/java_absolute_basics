package pl.sda.javalon4.kalisz.dzien2.petle.zbior;

import java.util.Scanner;

public class Zbior14 {

    public static void main(String[] args) {
// wczytaj ilosc liczb i potem wypisz tyle poczatkowych liczb pierwszych ile wczytano;
        Scanner scanner = new Scanner(System.in);
        int n = 0; // ilosc liczb przed petle
        int number = 0;
        int i = 0;

        System.out.println("Wpisz ilosc liczb: ");
        n = scanner.nextInt();
        while (i < n) {
            System.out.println("Wpisz liczbe: ");
            number = scanner.nextInt();
            if (isPrimo(number)) {
                System.out.println(number + " is prime");
            } else {
                System.out.println(number + " is not prime");
            }
            i++;
        }

    }
    // 4  --> 2 and 3, 7 --> 2, 3, 4, 5, 6
    public static boolean isPrimo(int liczba) {
        for (int i = 2; i < liczba-1; i++) { // we are checking if the number is dividable only by 1 and itself so if they are dividible by other digits then it is not prime
            if ((liczba % i == 0)) {
                return false;
            }
        }
        return true;
    }
}

