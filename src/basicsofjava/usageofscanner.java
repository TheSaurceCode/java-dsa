package basicsofjava;

import java.util.Scanner;

public class usageofscanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x ;
        x= sc.nextInt();

        System.out.println(x);

        sc.close();
    }
}
