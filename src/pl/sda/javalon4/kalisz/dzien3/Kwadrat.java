package pl.sda.javalon4.kalisz.dzien3;



    import java.util.Scanner;
    public class Kwadrat {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Wprowadź liczbę: ");
            int r = scanner.nextInt();
            System.out.println();
            for (int i = 0; i < r + 2; i++) {
                System.out.print("*");
            }
            System.out.println();
            for (int licznik1 = 0; licznik1 < r; licznik1++) {
                // lewy brzeg
                System.out.print("*");
                // spacje
                for (int licznik2 = 0; licznik2 < r; licznik2++) {
                    System.out.print(" ");
                }
                // prawy brzg
                System.out.print("*");
                System.out.println();
            }
            for (int i = 0; i < r + 2; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

