package conditionss;

import java.util.Scanner;

public class orroperator {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Enter the number: ");
     int n= sc.nextInt();

     if (n%5==0 || n%3==0) {
        System.out.println("number is divisible by 3 or 5");
     }else{
        System.out.println("number is not divisible by 3 or 5");
     }
     sc.close();
    }
}
