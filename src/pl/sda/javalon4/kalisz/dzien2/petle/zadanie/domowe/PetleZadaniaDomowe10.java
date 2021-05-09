package pl.sda.javalon4.kalisz.dzien2.petle.zadanie.domowe;

import java.util.Scanner;
// christmas tree made od *****
public class PetleZadaniaDomowe10 {
    public static void main(String args[]) {
        String a = "*";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Give number: ");
        int n= scanner.nextInt();
        for(int i=0; i<n; i++){
            System.out.println(a);
            int numberOfSpacesToApply = n - i - 1;
            a= a + "**";
        }

    }
}
