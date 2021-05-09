package pl.sda.javalon4.kalisz.dzien4;

import java.util.Arrays;

public class BoxArray {

    public static void main(String[] args) {

       char[][] matrix=createBox(5,3);

       char[][] example = {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'}};
        System.out.println(example.length);
        System.out.println(example[0].length);
       printMatrix(example);


        /*
        matrix=createBox(3,5);
        printMatrix(matrix);
        System.out.println();
        char[][] frame=createFrame(5,5);
        printMatrix(frame);

         */
    }

    public static void printMatrix (char[][] matrix){
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }



    public static char[][] createBox(int columns, int rows){
        char[][] matrix = new char[rows][columns]; // rows=3 columns=5[ [1,2,3,4,5], [1,2,3,4,5], [1,2,3,4,5]];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <columns ; j++) {
                matrix[i][j]='*'; // wpisywanie wartosci w pola arrayow

            }
        }
        return matrix;
    }
    public static char[][] createFrame(int columns, int rows){
        char[][] matrix = new char[rows][columns]; // rows=3 columns=5[ [1,2,3,4,5], [1,2,3,4,5], [1,2,3,4,5]];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if(i==0 || i==matrix.length-1){
                    matrix[i][j]='*';
                }
                else if(j==0 || j==matrix[i].length-1){
                    matrix[i][j]='*';
                }
                else{
                    matrix[i][j]=' ';
                }

            }
        }
        return matrix;
    }

}
