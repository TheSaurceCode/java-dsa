package conditionss;

import java.util.Scanner;

public class quadratss {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the x Axis  Co-ordinates : ");
        int x = sc.nextInt();
        System.out.print("Enter the y Axis Co-ordinates : ");
        int y = sc.nextInt();


        if (x>0) {
            if (y>0) {
                System.out.println("1st quadrant");
            }
            else if (y<0) {
                System.out.println("4th quadrant");
            }
        }
        else if (x<0) {
            if (y>0) {
                System.out.println("2nd quadrant");
            }
            else if (y<0) {
                System.out.println("3rd quadrant");
            }
        }
        else if (x==0 && y==0) {
            System.out.println("point is on the origin");
        }
        else if (x==0) {
             if (y>0) {
                System.out.println("positive y axis");
            }
            else if (y<0) {
                System.out.println("negative y axis");
            }
        }
        else if (y==0) {
             if (x>0) {
                System.out.println("positive x axi");
            }
            else if (x<0) {
                System.out.println("negative x axis");
            }
        }
        sc.close();
    }
}
