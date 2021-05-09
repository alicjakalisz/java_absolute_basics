package pl.sda.javalon4.kalisz.dzien2.petle.zadanie.domowe;

import java.util.Scanner;
// pytaj uzytownika o liczbe z przedziau , dopoki uzytkownik bedzie podawal liczbe z poza przedzialu to powtarzaj petle
public class PetleZadaniaDomowe18 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number;

        //CODE TO GET THE UPPER AND LOWER LEVEL
        int od;
        int azdo;
        do {
            od=(int) (Math.random()*100);
            azdo=(int)(Math.random()*100);
        }while (azdo < od);
        System.out.println(" Od : " +od);
        System.out.println("Do: "+ azdo);
        //END OF CODE TO GET THE UPPER AND LOWER LEVEL

        //THIS CODE  ASK THE USER FOR A NUMBER BETWEEN THE SCOPE
        System.out.println("Podaj numer: ");
        number=scanner.nextInt();
        while(number<=od || number>azdo) {
            System.out.print("Please introduce againa numer that is within the scope: ");
            number=scanner.nextInt();
        }
        System.out.println("Number correct");
    }
}
