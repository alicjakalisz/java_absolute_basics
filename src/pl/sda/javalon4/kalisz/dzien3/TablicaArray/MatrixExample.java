package pl.sda.javalon4.kalisz.dzien3.TablicaArray;

import java.util.Arrays;

public class MatrixExample {


    public static void main(String[] args) {
        //int matrix[][]={{1,2,3,4},{5,6,7,8}}  matrix.length=2
        int matrix2[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(matrix2.length);
        System.out.println(Arrays.toString(matrix2[0]));
        System.out.println(Arrays.toString(matrix2[1]));
        System.out.println(matrix2[1][2]);
        System.out.println(matrix2[0][3]);
        int matrix[][] = new int[5][5];
        System.out.println("Iterating the matrix with " + matrix2.length + " elements");
        for (int i = 0; i < matrix2.length; i++) {
            //This iterate the outside array or parent array
            System.out.println("Inner Loop: i="+i + ". Iterating now j for " + matrix2[i].length + " iterations");
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.println("The element in position i="+ i +" j="+j +" is "+ matrix2[i][j]);
            }
        }
    }

}
