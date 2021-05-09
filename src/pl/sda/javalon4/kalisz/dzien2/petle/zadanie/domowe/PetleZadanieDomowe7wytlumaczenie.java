package pl.sda.javalon4.kalisz.dzien2.petle.zadanie.domowe;

import java.util.Scanner;

public class PetleZadanieDomowe7wytlumaczenie {


    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Wprowadz liczbe");
        int n= scanner.nextInt();
        System.out.println();
        if(n<1) {
            System.out.println("nie przyjmuje liczbe mniejszych niz 1");
            return; // zwracamy informacje ze sie skonczyl program
        }

        int pierwsza= scanner.nextInt();
        int max=pierwsza;
        int min=pierwsza;
        int suma=pierwsza;



        for(int i=0; i<n-1;i++){// ile petli=
            int kolejna =scanner.nextInt();
            suma=suma+kolejna;

            if(kolejna<min){
                min=kolejna;
            }else if(kolejna>max){
                max=kolejna;
            }


        }
        float srednia=(float)suma/(float)n;
        System.out.println("Srednia: "+ srednia);
        System.out.println("Max : "+ max);
        System.out.println("Min: "+ min);

    }
}
