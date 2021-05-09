package pl.sda.javalon4.kalisz.dzien2.petle.zbior;

import java.util.Scanner;

public class Zbior6 {
// user is inputting until he gives 5 numbres bigger than 0 and then print the max and min of those numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int number = 0;
        int i = 0;

        while (i < 5) {
            System.out.println("Give number");
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Wpisz numer wiekszy od 0");
            } else if (number > max) {
                max = number;
            } else {
                if (number < min) {
                    min = number;
                }

            }

            i++;
        }
        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);

    }
}
