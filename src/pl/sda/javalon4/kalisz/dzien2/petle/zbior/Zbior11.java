package pl.sda.javalon4.kalisz.dzien2.petle.zbior;

import java.util.Scanner;

public class Zbior11 {

    // inout numbers untils the sum of them is 0
    public static void main(String[] args) {

        int sum=0;
        int number=0;
        Scanner scanner=new Scanner(System.in);

        //Error, the condition is while the sum is different than zero.
        //This is a do while, because the first time sum is zero, you need to capture the input from user one first time
        do{
            System.out.println("Give number: ");
            number=scanner.nextInt();
            sum=sum+number;
        }while(sum!=0);
        System.out.println("Sum is now: "+ sum);
    }
}
