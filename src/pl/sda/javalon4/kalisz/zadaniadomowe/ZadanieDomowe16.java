package pl.sda.javalon4.kalisz.zadaniadomowe;

import java.util.Random;
import java.util.Scanner;

public class ZadanieDomowe16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean keepLooping;
        double a = Math.random() * 1000;
        System.out.println("Random number is: " + a);


        do{
            keepLooping = false;
            System.out.println("is " + a + " > 100?");
            String respon = scanner.nextLine();
            if (!respon.toLowerCase().equals("yes") && !respon.toLowerCase().equals("no")) {
                System.out.println(" Write down yes or no");
                keepLooping=true;
            } else if (respon.toLowerCase().equals("yes")) {
                if (a > 100) {
                    System.out.println("yes " + a + " is bigger than 100");
                } else {
                    System.out.println("Do not lie to me. " + a + " is not greater than 100");
                    keepLooping = true;
                }
            } else {
                if (a <= 100) {
                    System.out.println("yes " + a + " is  not bigger than 100");
                } else {
                    System.out.println("Do not lie to me. " + a + " is not lower or equals to 100");
                    keepLooping = true;
                }
            }
        }while(keepLooping);

    }

}
