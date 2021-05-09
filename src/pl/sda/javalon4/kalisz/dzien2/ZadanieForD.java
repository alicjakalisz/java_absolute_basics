package pl.sda.javalon4.kalisz.dzien2;

import java.util.Scanner;

public class ZadanieForD {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Wpisz ile liczb do obliczenia sredniej");
        int n=scanner.nextInt();
        if(n<0){
            System.out.println(" za malo");
        }else{

                int sum=0;

            for(int i=0; i<n; i++){

                int x =scanner.nextInt();
                sum=sum+x;

            }
            System.out.println("Suma to" + sum);
            System.out.println("Srednia to" + (float)sum/n );
        }
// WRONGGGGGGGGGGGGGGGGGGGGGGGGGGGG


    }


}
