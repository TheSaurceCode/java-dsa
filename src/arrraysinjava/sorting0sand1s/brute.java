package arrraysinjava.sorting0sand1s;

// import java.util.Arrays;

public class brute {
    public static void main(String[] args) {
        int [] arr = {0,1,0,0,1,0,1,1,0,0};

        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        //techinque-1 to sort array containing 0 and 1 ;
       
        // Arrays.sort(arr);

        // for (int i : arr) {
        //     System.out.print(i+" ");
        // }

        int noofzeros = 0 ;
        for(int i =0 ; i <arr.length; i++){
            if(arr[i]==0){
                noofzeros++;
            }
        }
        for(int j = 0 ; j<arr.length;j++){
            if(j<noofzeros){
                arr[j]=0;
            }else{
                arr[j]=1;
            }
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
