package arrraysinjava.arraysortings;

public class sortingtwosortedarrays {
    public static void main(String[] args) {
        
        int [] a = {10,22,34,46,58};
        int[] b = {12,28,54,68,78};

        int [] c = new int[a.length+b.length];


        int i = 0;
        int j =0;
        int k = 0;
        while(i<a.length && j<b.length){
            if (a[i]<=b[j]){
                c[k]= a[i];

                i++;
                
            }else{
                c[k]=b[j];
                j++;
            }
            k++;
        };


        for (int ele : c) {
            System.out.print(ele+" ");
        }
    }
}
