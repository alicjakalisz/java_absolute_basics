package pl.sda.javalon4.kalisz.dzien2.petle.zbior;

import java.util.Scanner;
// wpisz 5 liczba i oblicz srednia
public class Zbior9 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int i=0;
        int sum=0;
        float average=0;
        int number=0;

        while(i<5){
            System.out.println("Give number");
            number=scanner.nextInt();
            sum=sum+number;
            i++;
        }
        average=(float)sum/(float)i;
        System.out.println("The average is: " + average);
    }
}
