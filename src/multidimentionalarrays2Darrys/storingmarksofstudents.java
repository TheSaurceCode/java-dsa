package multidimentionalarrays2Darrys;

import java.util.Scanner;

public class storingmarksofstudents {
    public static void main(String[] args) {

        //make a note that i is no of rows and j is no of columns
        
        int [][] arr = new int[3][2];

        Scanner sc = new Scanner(System.in);


        for (int i = 0; i <3; i++) {
            for (int j = 0; j <2; j++) {
                arr[i][j] = sc.nextInt();
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
