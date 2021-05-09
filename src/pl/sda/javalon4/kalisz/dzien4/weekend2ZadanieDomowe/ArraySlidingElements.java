package pl.sda.javalon4.kalisz.dzien4.weekend2ZadanieDomowe;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySlidingElements {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int[]array=new int[10];
        System.out.print("Insert number: ");
        int n=scanner.nextInt();

        //Iterate until the user introduce a negative number
        while(n>=0){
            //Loop to do the slide of the array
            // It moves the item in position 0 to the position i+1
            //we use the index zero as the temporary value that we assign from the previous iteration.
            //[1,2,3,4]
            // i =0 array at the end of the loop will be [2,1,3,4]
            // i=1  at the end of the loop array is: [3,1,2,4]
            // i=1  at the end of the loop array is: [4,1,2,3]
            for (int i = 0; i <array.length-1 ; i++) { //od 0 do 9 =10
                int temp=array[i+1];
                array[i+1]=array[0];
                array[0]=temp;
            }
            //When the array has been slided to the right, then we just place in the position zero the value introduced by the user
            array[0]=n;
            //We paint the array
            System.out.println(Arrays.toString(array));
            //We ask the user to introduce again a value
            System.out.print("Insert number: ");
            n=scanner.nextInt();// the value will be check but while expression if >=0 and not it will get out of the loop
        }

        System.out.println("Program skonczony/ Programe finishes, negative number inserted");

    }
}
