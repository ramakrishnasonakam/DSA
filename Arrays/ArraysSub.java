/*
arr1 = [9,9,9]
arr2 = [9]
res = [9,9,0]
*/



import java.util.Scanner;
public class ArraysSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array 1: ");
        int n1 = sc.nextInt(); // 3
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of array 2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int [n2];
        for (int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }
        int i = arr1.length - 1; // 2 [235]
        int j = arr2.length - 1; // 1 [79]
        int k = i; // 3
        int[] res = new int[k+1]; // assigning size of the larger array
        int borrow = 0;
        int sub = 0;
        /*
        Size of arr1 > Size of arr2
        Operation arr1 - arr2 [235 - 79]
        */
        while (i>=0 && j>=0){
            sub = arr1[i] - arr2[j] - borrow;
            if (sub < 0) {
                sub += 10;
                borrow = 1;
            }
            res[k] = sub;
            i--;
            j--;
            k--;
        }

        while(i>=0){
            sub = arr1[i] - borrow;
            if (sub < 0){
                sub += 10;
                borrow = 1;
            }
            res[k] = sub;
            i--;
            k--;
        }

        while(j>=0){
            sub = arr2[j] - borrow;
            if (sub < 0){
                sub += 10;
                borrow = 1;

            }
            res[k] = sub;
            j--;
            k--;
        }
        System.out.println("The answer is: ");
        int l = 0;
        boolean zero = true;
        while (l < res.length){
            int num = res[l++];
            if (num > 0) {
                zero = false;
            }
            if (!zero) System.out.println(num);
        }


    }// end of void main
}//end of class
