package pl.sda.javalon4.kalisz.dzien2.petle.zadanie.domowe;

import java.util.Scanner;
// too small, too high game . computer gives random numbers frmo scope between 1-100 and user needs to guess the value of the number
public class PetleZadaniaDomowe9 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int random=(int)(Math.random()*101);
        System.out.println("Guess number: ");
        int number=scanner.nextInt();
        while(number!=random){
            if(number>random){
                System.out.println( "Your number is too high, please select another number");
            }
            else if(number<random){
                System.out.println("Your number is too low, please select another number");
            }
            number=scanner.nextInt();
        }
        System.out.println("Congratulations");
    }

}
