package conditionss;

import java.util.Scanner;

public class profitorloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost price :");
        int cp = sc.nextInt();

        System.out.print("Enter the selling price:");
        int sp = sc.nextInt();

        if (cp>sp) {
            System.out.println("Loss of :" + -(sp-cp) + " Rs");
        } else if (cp<sp) {
            System.out.println("Profit of :"+(sp-cp) + " Rs");
        } else if (cp == sp) {
            System.out.println("No Profit No Loss");
        }

        sc.close();
    }
}
