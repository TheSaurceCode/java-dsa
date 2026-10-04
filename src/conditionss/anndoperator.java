package conditionss;

import java.util.Scanner;

public class anndoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = sc.nextInt();

        if (99<a && a<1000) {
            System.out.println("Entered number is a three digit number");
        }
        else{
            System.out.println("Entered number is not a three digit number");
        }
        sc.close();
    }
}
