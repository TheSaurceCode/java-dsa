package arrraysinjava.twopointers;

public class reversesortedarrayusingwhile {

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int n = arr.length;

        int i = 0;
        int j = n-1;

        reverse(arr, i, j);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
