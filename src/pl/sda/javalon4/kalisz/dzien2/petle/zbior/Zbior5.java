package pl.sda.javalon4.kalisz.dzien2.petle.zbior;

import java.util.Scanner;

//pobierz od uzytkownika tak dlugo dopoki uzytkownik poda 5 liczb wiekszych od 0 i wypisz najwieksza z nich
public class Zbior5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int number=0;
        int i=0;
        while(i<5){
            System.out.println("Give number");
            number = scanner.nextInt();
            if(number>max){
                max=number;
            }
            i++;
        }

        System.out.println("Max number is: " + max);
    }
}
