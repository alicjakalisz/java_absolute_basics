package pl.sda.javalon4.kalisz.dzien2.petle.zadanie.domowe;

import java.util.Scanner;

public class PetleZadaniaDomowe17 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);


        // zasieg od -200 do -1000 i dekremental

     /*   for(int i=-200; i>=-1000; i--){
            System.out.println(i);
        }*/

       for(int i=1000;i<=100000;i++){
            System.out.print(i + ",");
            if(i%1000==0){
                System.out.println(" ");
            }
        }

    }
}
