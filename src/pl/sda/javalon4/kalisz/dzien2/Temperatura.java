package pl.sda.javalon4.kalisz.dzien2;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // to w nawiasie wskazujemy z czego mamy pobierac dane (System.in pobiera z konsoli akurat)

        System.out.println("Prosze podac temperature");
        int temp = scanner.nextInt();

        if (temp >= 100) {

            System.out.println("Woda wrze");
        } else if (temp >= 0) {
            System.out.println("Woda jest w stanie cieklym");

        } else if (temp < 0) {
            System.out.println("Woda zamarza");
        }

    }
}