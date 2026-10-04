package looops;

import java.util.Scanner;

public class arithmeticprogressionM1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number :");
        int a = sc.nextInt();
        System.out.print("Enter the nth term");
        int n = sc.nextInt();
        System.out.print("Enter the difference :");
        int d = sc.nextInt();

        for (int i = a; i<d*n ; i+=d) {
            System.out.println(i);
        }
        sc.close();
    }
}


/// deekh bhai kya hai na yaha pe ki formula jo hai ap ka wo hai a+n-1*d
/// soo deekh kya hia ki ako 1st pakad liya 
/// itterations chalani kaabh tak hai n-1*d 