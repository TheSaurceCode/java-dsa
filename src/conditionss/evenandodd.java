package conditionss;

import java.util.Scanner;

public class evenandodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check weather the number is even or odd :");
        int n = sc.nextInt();

        if (n%2==0) {
            System.out.println("number " + n + " is an even number");
        }

     if (n%2==1) {
            System.out.println("number" + n +" is an odd number");
        }

        sc.close();
    }
}
