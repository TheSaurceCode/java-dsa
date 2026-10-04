package looops;

import java.util.Scanner;

public class factorsss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int x=0;
        for (int i =2; i <n; i++) {
            if (n%i == 0) {
                System.out.println(n + " is a composite number");
                x = 1;
                break;
            }
        }
        if (x==0) {
                System.out.println("number is a prime");
            }
        if ( n == 1){
                System.out.println("Neither Prime Nor Composite");
            }
        sc.close();
    }
}
