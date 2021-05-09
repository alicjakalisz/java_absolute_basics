package pl.sda.javalon4.kalisz.dzien2.petle.zbior;

import java.util.Scanner;

public class Zbior7 {

    //Wczytuj tak dlugo az uzytkoniwk poda 5 liczb wiekszych od zera i 5 liczba mniejszych od zera(w sumie 10) i potem wypisz ich sume
    // take input frmo the user until he gives 5 values >0 and 5 values < 0 (together 10) and print out their sum

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int number = 0;
        int sumOfJ = 0;
        int sumOfI = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);


        while ((i < 5) || (j < 5)) {
            System.out.println("Give number: ");
            number = scanner.nextInt();
            if (number > 0 && i<5) {
                sumOfI = sumOfI + number;
                i = i + 1;
            } else if(number <0 && j<5){
                j = j + 1;
                sumOfJ = sumOfJ + number;
            }
        }
        sum = sumOfI + sumOfJ;
        System.out.println("The sum of sumi and sumJ is : " + sum);
    }
}

