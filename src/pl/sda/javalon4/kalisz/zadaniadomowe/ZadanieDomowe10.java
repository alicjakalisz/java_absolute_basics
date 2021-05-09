package pl.sda.javalon4.kalisz.zadaniadomowe;

public class ZadanieDomowe10 {

    public static void main(String[] args) {
      int a=8686;
      int b=186876;
      int c=767;
      int numbers[]={a,b,c};

        printNumbers(numbers);

    }


    public static void printNumbers(int array[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if(array[i]<min){
                min=array[i];

            }
            if(array[i]>max){
                max=array[i];
            }


        }
        System.out.println("Minimum number is " + min);
        System.out.println("Maximum number is " + max);

    }}



