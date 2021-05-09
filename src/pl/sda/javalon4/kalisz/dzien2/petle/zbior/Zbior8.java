package pl.sda.javalon4.kalisz.dzien2.petle.zbior;

import java.util.Scanner;

public class Zbior8 {
    // Input amounts from the user until he gives 5 values<0, 5 values<0 and then count max and min
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i=0;
        int j=0;
        int number=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;


        while (i <= 5 && j <= 5) {
            System.out.println("Give number");
            number=scanner.nextInt();
            if(number>0){
                i=i+1;
                if(number>max){
                    max=number;
                }
            }
            else{
                j=j+1;
                if(number< min){
                    min=number;
                }
            }
        }
        System.out.println("Min: "+ min+ " and max: "+ max);

    }


}
