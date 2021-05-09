package pl.sda.javalon4.kalisz.dzien2;

import java.util.Scanner;

public class SilniaWhileloop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbe do 12");
        int n = scanner.nextInt();

        if (n > 12) {
            System.out.println("wpisz liczbe mniejsza od 13stu");
        } else {
            int i = 1;
            int silnia=1;
            while (i <= n) {
                silnia=silnia*i;

            i++;
            }System.out.println("Silnia to"+ silnia);
        }

    }}