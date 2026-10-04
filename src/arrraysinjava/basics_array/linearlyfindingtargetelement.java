package arrraysinjava.basics_array;

import java.util.Scanner;

public class linearlyfindingtargetelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the target Element :");
        int a = sc.nextInt();

        System.out.print("Enter the number of elements :");
        int n = sc.nextInt();

        int [] arr = new int [n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        boolean  flag = false ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== a) {
                System.out.println("your target element index is " + (i+1));
                flag = true;
                break;
            }
        }

        if (flag==false) {
            System.out.println("Elemnet not found");
        }

        sc.close();
    }
}
