package arrraysinjava.sorting0sand1s;

public class twopointermethod {

    //one pass solution
    public static void main(String[] args) {
        int [] arr = {1,0,1,0,0,1,1,1,0,0,0,1,1,0,1,0,1,0};
        int i=0;
        int  j=arr.length-1;

        for (int ele : arr) {
            System.out.print(ele+" ");
        }

        while (i<=j) {
            if(arr[i]==0) i++;
            else if(arr[j]==1)j--;
            else if (arr[i]==1 && arr[j]==0) {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }

        System.out.println();

        for (int elem : arr) {
            System.out.print(elem+" ");
        }


    }
}
