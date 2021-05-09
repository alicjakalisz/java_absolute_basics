package pl.sda.javalon4.kalisz.dzien2.petle.zbior;

import java.util.Scanner;

public class Zbior1 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int number=0;
        int i=0;
        int sum=0;

        while(i<5){
            System.out.println("Give the number");
            number=scanner.nextInt();
            sum=sum+number;
            i++;
        }
        System.out.println("The sum of the numbers is: " + sum);


    }
}
