package multidimentionalarrays2Darrys;

import java.util.Scanner;

public class basicsof2darray {
    public static void main(String[] args) {
        // 1D array is repesented as 
        // int [] arr = new int[n];


        //  where as 2D array is represnted as 
        // int [] [] arr = new int [n][n];



        // declaration of 2D arrays 
        // int [][] arr = new int[3][3];
        // int [][] ar = {{1,2},{2,3}};




        // here we are going to check how we can transverse through an array in a 2D array


        int[][] arr = new int [3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                arr[i][j]= sc.nextInt();
            }
        }

        for (int[] a : arr) {
           for (int b : a) {
            System.out.print(b+" ");
           }
           System.out.println();
        }
        sc.close();

    }
}
