package pl.sda.javalon4.kalisz.dzien2;

import java.util.Scanner;

public class ZadanieForC {


    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        System.out.println("Wpisz ile chcesz liczb");
        int n=scanner.nextInt();

        if(n<0){

            System.out.println("Za mala liczba");
        }else{
            int dotychczasowyNajwiekszyx=0;
            for(int i=0; i<n; i++){
                System.out.println("Podaj kolejny number");
                int x=scanner.nextInt();
                if(dotychczasowyNajwiekszyx < x) {
                    dotychczasowyNajwiekszyx = x;
                }
                System.out.println("Najwieksza podana liczba: ");
                System.out.println(dotychczasowyNajwiekszyx);
            }
        }



    }
}
