import java.util.*;
class ArrayManipulation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /* 
        M -> cols  
        N -> rows   
        */
        int m = sc.nextInt();
        int n = sc.nextInt();
        long[] num = new long[n + 1];
        for (int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();

            num[a] += k;
            
            if (b+1 <= n){
                num[b] += k;
            }// end of if
        }// end of for

        long max = Long.MIN_VALUE;
        // long sum = 0;
        for (int i = 0; i < num.length; i++){
            if (num[i] > max){
                max = num[i];
            }

        }
        System.out.println(max);

    }
}// end of class