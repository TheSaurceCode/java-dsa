package multidimentionalarrays2Darrys;

import java.util.Scanner;

public class findingthelargestelement {
    public static void main(String[] args) {
        int [][] arr= new int[3][2];

        Scanner sc= new Scanner(System.in);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i <3; i++) {
            for (int j = 0; j <2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <2; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("Largest Number is :"+ max);

        sc.close();
    }
}
