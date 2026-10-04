package conditionss;

import java.util.Scanner;

public class greatestofthreedigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int a = sc.nextInt();

         System.out.print("Enter the 2nd number : ");
        int b = sc.nextInt();

         System.out.print("Enter the 3rd number : ");
        int c = sc.nextInt();


        if (a>b) {
            if (a>c) {
                System.out.println("1st number is the greatest amongst three number");
            } else{
                System.out.println("3rd number is the greatest amongst three number");
            }
        } else{
                if (b>c) {
                    System.out.println("2nd number is the greatest amongst three number");
                }
                else{
                    System.out.println("3rd number is the greatest amongst three number");
                }
        }
        sc.close();
    }
}
