package arrraysinjava.mergetwosortedarrays;

public class mergetwosortedarraysinjava {
    public static void main(String[] args) {
        int [] a ={10,15,18,34,57,66};
        int []b = {12, 17, 25 , 48, 55 , 64, 88};

        int [] c = new int[a.length+b.length];

        int i=0 , j=0, k=0;

        while (i<a.length && j<b.length) {
            if(a[i]<= b[j]){
                c[k]= a[i];
                i++;
            }else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
        if (i==a.length) {
            while (j<b.length) {
                c[k]=b[j];
                k++;
                j++;         
               }
        }
        if (j==b.length) {
            while (i<a.length) {
                c[k]=a[i];
                k++;
                i++;
            }
        }
         for (int ele : c) {
            System.out.print( ele+" ");
         }
    }
}
