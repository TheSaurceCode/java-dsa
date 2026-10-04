package conditionss;

import java.util.Scanner;

public class absolutenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get the absolute number :");
        int n= sc.nextInt();

        if (n<0) {
            System.out.println(-n);
        }
        else{
            System.out.println(n);
        }
        sc.close();
    }
}
