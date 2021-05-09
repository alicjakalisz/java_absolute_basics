package pl.sda.javalon4.kalisz.dzien2.petle.zadanie.domowe;

import java.util.Scanner;

public class PetleZadaniaDomowe12 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the number for testing: ");
        int number=scanner.nextInt();

        while(number<=0){
            System.out.println("put positive number");
            number=scanner.nextInt();
        }
        boolean isPrimo=isPrime(number);
        System.out.println(isPrimo);

    }
    public static boolean isPrime (int number){
        for(int i=2; i<number-1; i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }




}
