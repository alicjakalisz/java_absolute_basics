package pl.sda.javalon4.kalisz.dzien2.petle.zadanie.domowe;

import java.util.Scanner;

/*#
   Ask user for a integer N that has to be greater than 1
   Then ask in a loop for N numbers, so for example if the user introudce N=4, then you have to ask the user to introudce 4 numbers.
   Then you need to store the min, max for giving the user the sum of them.
   Apart from that you need to give as output the average of all the numbers.
 */
public class PetleZadaniaDomowe7 {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N;
        do{
            System.out.print("Introduce N: ");
            N = scanner.nextInt();
        }while(N< 2);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int total = 0;
        for(int i=0; i< N; i++){
            int number = scanner.nextInt();
            total = total + number;
            if(number>max){
                max = number;
            }
            else if(number <min){
                min = number;
            }
        }
        float average = (float)total/(float)N;
        int sum = min + max;
        System.out.printf("The average is %.2f and sum of min and max is %d",average, sum);
    }
}
