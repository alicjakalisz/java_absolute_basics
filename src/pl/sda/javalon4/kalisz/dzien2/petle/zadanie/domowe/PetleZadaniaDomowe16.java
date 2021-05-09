package pl.sda.javalon4.kalisz.dzien2.petle.zadanie.domowe;

import java.util.Scanner;
// program ktory sumuje cyfry w stringu

public class PetleZadaniaDomowe16 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("napisz tekst");
        String text=scanner.nextLine();
        int sum=0;
        for(int i=0; i<text.length(); i++){

            char a=text.charAt(i); // tworzymy zmienna co nam pokazuje po indeksie znaki w stringu
            if(Character.isDigit(a)){ // kazdy z tych znakow jest sprawdzany czy jest cyfra Clasa Character, methoda isDigit
                int b=Integer.parseInt(String.valueOf(a));// jak true to tworzymy zmienna ktora nam trzyma wartosc A po konwersji do int
                sum=sum+b;
            }

        }System.out.println("Sum of digits is "+ sum);
    }
}
