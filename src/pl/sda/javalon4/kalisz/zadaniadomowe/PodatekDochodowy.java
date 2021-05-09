package pl.sda.javalon4.kalisz.zadaniadomowe;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PodatekDochodowy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Your base for taxation: ");
        float base=scanner.nextInt();
        System.out.println("Your tax to pay is: " + calculateTheTax(base));
    }

    public static float calculateTheTax(float base){
        float tax=0;
        if(base<=85528){
            tax=(base * 0.18f) - 556.02f;
        }else {
            tax=14839.02f + (0.32f * (base-85528));
        }
        return tax;
    }
}
