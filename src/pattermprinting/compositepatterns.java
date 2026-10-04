package pattermprinting;

import java.util.Scanner;

public class compositepatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();


        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=n-i; j++) {
        //         System.out.print(" "+" ");
        //     }for (int k =1; k <=i; k++) {
        //         System.out.print((char)(k+64)+" ");
        //     }
        //     System.out.println();
        // }
        // sc.close();
                    //         A 
                    //       A B 
                    //     A B C 
                    //   A B C D 
                    // A B C D E 







        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=n-i; j++) {
        //         System.out.print(" "+" ");
        //     }for (int k =1; k <=i; k++) {
        //         System.out.print((char)(i+64)+" ");
        //     }
        //     System.out.println();
        // }
        // sc.close();
                        //           A 
                        //         B B 
                        //       C C C 
                        //     D D D D 
                        //   E E E E E 
                        // F F F F F F 









        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=n-i; j++) {
        //         System.out.print(" "+" ");
        //     }for (int k =1; k <=i; k++) {
        //         System.out.print(k +" ");
        //     }
        //     System.out.println();
        // }
        // sc.close();
                                //         1 
                                //       1 2 
                                //     1 2 3 
                                //   1 2 3 4 
                                // 1 2 3 4 5 











        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=n-i; j++) {
        //         System.out.print(" "+" ");
        //     }for (int k =1; k <=n; k++) {
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }
        // sc.close();
                            //           * * * * * * 
                            //         * * * * * * 
                            //       * * * * * * 
                            //     * * * * * * 
                            //   * * * * * * 
                            // * * * * * * 












        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=n-i; j++) {
        //         System.out.print(" "+" ");
        //     }for (int k =1; k <= 2*i-1; k++) {
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }
        // sc.close();
//           * 
//         * * * 
//       * * * * * 
//     * * * * * * * 
//   * * * * * * * * * 
// * * * * * * * * * * * 








        // /// another way of doing the star printing
        
        // int nbs =n-1;
        // int nbst = 1;
        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=nbs; j++) {
        //         System.out.print(" "+" ");
        //     }for (int k =1; k <= nbst; k++) {
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();

        //     nbs --;
        //     nbst+=2;
        // }
        // sc.close();


        //                   * 
        //                 * * * 
        //               * * * * * 
        //             * * * * * * * 
        //           * * * * * * * * * 









        // int nbs =n-1;
        // int nbst = 1;
        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=nbs; j++) {
        //         System.out.print(" "+" ");
        //     }for (int k =1; k <= nbst; k++) {
        //         if ((i+k)%2 ==0) {
        //             System.out.print("1"+" ");
        //         } else {
        //             System.out.print("0"+" ");
        //         }

        //     }
        //     System.out.println();

        //     nbs --;
        //     nbst+=2;
        // }
        // sc.close();

        //                           1 
        //                         0 1 0 
        //                       1 0 1 0 1 
        //                     0 1 0 1 0 1 0 
        //                   1 0 1 0 1 0 1 0 1 




        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=n-i; j++) {
        //         System.out.print(" "+" ");
        //     }for (int j =1; j <= i; j++) {
        //         System.out.print(j+" ");
        //     }for (int j =i-1; j>=1; j--) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        // sc.close();

        //                           1 
        //                         1 2 1 
        //                       1 2 3 2 1 
        //                     1 2 3 4 3 2 1 
        //                   1 2 3 4 5 4 3 2 1 
        //                 1 2 3 4 5 6 5 4 3 2 1 












        // int nbst = n;
        // int nbs =1;
        // for (int i = 1; i <=n; i++) {
        //     for (int j=nbst; j >=1; j--) {
        //        System.out.print("*"+" ");
        //     }
        //     for (int j = i+1; j <=nbs; j++) {
        //         System.out.print(" "+" ");
        //     }
        //     for (int j = i+1; j <=nbs; j++) {
        //         System.out.print(" "+" ");
        //     }
        //     for (int j=nbst; j >=1; j--) {
        //        System.out.print("*"+" ");
        //     }
        //     System.out.println();
        //     nbst--;
        //     nbs+=2;
        // }
        // sc.close();
    

                                    // * * * * * * * * * * * * 
                                    // * * * * *     * * * * * 
                                    // * * * *         * * * * 
                                    // * * *             * * * 
                                    // * *                 * * 
                                    // *                     * 




    

            







        // for (int i = 1; i <=2*n-1; i++) {
        //     System.out.print("*"+" ");
        // }
        // System.out.println();
        // n--;
        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=n-i+1; j++) {
        //         System.out.print("*"+" ");
        //     }
        //     for (int j = 1; j <=2*i-1; j++) {
        //         System.out.print(" "+" ");
        //     }
        //     for (int j = 1; j <=n-i+1; j++) {
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }
        // sc.close();

                                // * * * * * * * * * * * 
                                // * * * * *   * * * * * 
                                // * * * *       * * * * 
                                // * * *           * * * 
                                // * *               * * 
                                // *                   * 
       








    //     for (int i = 1; i <= 2*n-1 ; i++) {
    //         System.out.print(i + " ");
    //     }
    //     System.out.println();
    //     n--;
        
    //     for (int i =1; i <=n; i++) {
    //         int a =1;
    //         for (int j =1; j<=n-i+1; j++) {
    //             System.out.print(a++ +" ");
    //         }
    //         for (int j = 1; j<=2*i-1; j++) {
    //             System.out.print(" "+ " ");
    //             a++;
    //         }
    //         for (int j = 1; j<=n-i+1; j++) {
    //             System.out.print(a++ +" ");
                
    //         }

    //         System.out.println();
    //     }
    //    sc.close(); 
       
    //                             Enter the number : 6
    //                             1 2 3 4 5 6 7 8 9 10 11 
    //                             1 2 3 4 5   7 8 9 10 11 
    //                             1 2 3 4       8 9 10 11 
    //                             1 2 3           9 10 11 
    //                             1 2               10 11 
    //                             1                   11 





    int nbs = n-1;
    int nbst = 1;

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= nbs; j++) {
            System.out.print(" "+" ");
        }
        for (int j = 1; j <=nbst ; j++) {
            System.out.print("*"+" ");
        }
        System.out.println();
        nbs--;
        nbst+=2;
    }


    nbs=1;
    nbst= nbst-4;
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=nbs; j++) {
            System.out.print(" "+" ");
        }
        for (int j = 1; j <=nbst ; j++) {
            System.out.print("*"+" ");
        }
        System.out.println();
        nbs++;
        nbst-=2;
    }
    sc.close();
    }
}
