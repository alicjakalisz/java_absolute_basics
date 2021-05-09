package pl.sda.javalon4.kalisz.dzien2.petle.zadanie.domowe;

import java.util.Scanner;
// palindrom
public class PetleZadaniaDomowe15 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Type down the word");
        String word= scanner.nextLine();

        while(!word.equals(word.toLowerCase())){
            System.out.print("Introduce in small letters to get the result: ");
            word=scanner.nextLine();
        }
        //AT THIS MOMENT THE WORD INTRODUCE BY THE USER IS IN LOWER CASE
        boolean IsPalindrome=IsPalindrome(word);
        System.out.println(IsPalindrome);


    }
    public static boolean IsPalindrome(String word){
        for(int i=0; i<word.length()/2; i++){

            if(word.charAt(i)==word.length()-1-i){
               return true;
            }
        }
        return false;
    }
}
