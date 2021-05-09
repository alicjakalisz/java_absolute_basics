package pl.sda.javalon4.kalisz.dzien2.petle.zbior;

import java.util.Scanner;

public class Zbior10 {
// inout numbers untils the sum of them is 10
    public static void main(String[] args) {

        int sum=0;
        int number=0;
        Scanner scanner=new Scanner(System.in);

        while(sum==10){
            System.out.println("Give number: ");
            number=scanner.nextInt();
            sum=sum+number;
        }
        System.out.println("Sum is now: "+ sum);
    }
}
