package arrraysinjava.basics_array;
import java.util.Scanner;
public class linearlyfindingthemaximumnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elemenets");
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> max) {
                max = arr[i];
                index= i;
            }
        }
        System.out.println("the Gratest number amongs all the three is : " + max +"And the index of the element is :"+ (index+1));
        sc.close();
    }
}
