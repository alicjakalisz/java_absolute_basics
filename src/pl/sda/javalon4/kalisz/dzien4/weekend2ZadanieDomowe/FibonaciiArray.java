package pl.sda.javalon4.kalisz.dzien4.weekend2ZadanieDomowe;

import java.util.Arrays;
import java.util.Scanner;

public class FibonaciiArray {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj liczbe/ Insert number");
        int n=scanner.nextInt();
        int[]array= new int[n];

        //Calculate fibonacci
        for (int i = 0; i <array.length ; i++) {
            if(i==0){
                array[i]=0;

            }
            else if(i==1){
                array[i]=1;
            }
            else{
                array[i]=array[i-1]+array[i-2];
            }
        }

        //Second is loop asking for fibonacci numbers#
        int a=0;
        System.out.println("Ktora liczbe z ciagu wydrukowac?/Which number from the string to print?");
        a=scanner.nextInt();
        while(a>=0){
            if(a>=array.length){
                System.out.println("Teh liczby nie obliczono/This number has not been calculated");
                System.out.println("Ktora liczbe z ciagu wydrukowac?/Which number from the string to print?");
                a=scanner.nextInt();
            }
            else if(a>=0 && a<array.length){
                System.out.println(array[a]);
                System.out.println("Ktora liczbe z ciagu wydrukowac?/Which number from the string to print?");
                a=scanner.nextInt();
            }
            else{
                System.out.println("Koncze prace, dziekuje/I finish work, thank you");
            }

        }




    }
}
