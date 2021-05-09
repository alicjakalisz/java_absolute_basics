package pl.sda.javalon4.kalisz.dzien2.petle.zadanie.domowe;

import org.w3c.dom.ls.LSOutput;

public class PetleZadanieDomowe1 {


    //a application that prints digits from 1-100


    public static void main(String[] args) {
        System.out.println("A:");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        System.out.println("B:");
        for (int b = 1000; b <= 1020; b++) {
            System.out.print(b);
            if (b < 1020) {
                System.out.print(", ");
            }

        }
        System.out.println("C:");
        for (int c = -30; c <= 1000; c++) {
            if (c % 5 == 0) {
                System.out.println(c);
            }
        }
        System.out.println("D:");
        for (int d = 1; d <= 100; d++) {
            if (d % 3 == 00) {
                System.out.println(d);
            }
        }
        System.out.println("A:");
        for (int e = 30; e <= 300; e++) {
            if (e % 3 == 00 && e % 5 == 0) {
                System.out.println(e);
            }
        }
        // f
        System.out.println("F:");
        for (int i = -300; i < 300; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
                if (i < 299) {
                    System.out.print(";");
                }
            }
        }
        System.out.println("");

        // g

        System.out.println("G:");
        for (int i = -100; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
                if (i < 99) {
                    System.out.print(";");
                }
            }
        }

        System.out.println();
        //h
        System.out.println("H:");
        char z = 'z';
        for (char a = 'a'; a <= z; a++) {
            System.out.print(a + " ");
        }
        System.out.println();

        // i
        System.out.println("I:");
        z = 'Z';
        for (char a = 'A'; a < z; a++) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("J:");
        // j
        char j = 'Z';
        for (int a = 'A'; a < j; a = a + 2) {
            System.out.print((char) a + " ");
        }

        System.out.println();
        System.out.println("K:");
        char x = 'z';
        for (int a = 'b'; a <= x; a = a + 2) {
            if (a % 5 == 0) {
                System.out.print((char) a + " ");
            }

        }

        System.out.println("I: ");
        for(int i=1; i<=100; i++){
            System.out.println("Hellow World "+ i);
        }


    }
}

