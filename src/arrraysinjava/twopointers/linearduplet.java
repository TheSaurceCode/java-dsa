package arrraysinjava.twopointers;

public class linearduplet {
    public static void main(String[] args) {
        int [] arr ={10,20,30,40,50,60,90,85,45,62,87,95};
        int n = arr.length;
        int key = 1279;

        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]+arr[j] == key){
                    System.out.println("key found and keys are :" + arr[i] + " and "+ arr[j]);
                    flag=true;
                }
            }
        }

        if (!flag) {
            System.out.println("key not found");
        }
    }
}
