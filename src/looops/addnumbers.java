package looops;

import java.util.Scanner;

public class addnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        int a = 0;
        while (n!=0) {
            int b = n%10;
            a += b;
            n/=10;
        }
        System.out.print(a);
        sc.close();
    }
}
