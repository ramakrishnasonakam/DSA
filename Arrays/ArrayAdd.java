import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }//end of arr1 input

        for (int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }// end of arr2 input

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = Math.max(i, j) + 1;
        int[] res = new int[k+1];
        int carry = 0;
        int sum = 0;
        while (i>=0 && j>=0){
            sum = arr1[i] + arr2[j] + carry;
            res[k] = sum % 10;
            carry = sum / 10;
            i--;
            j--;
            k--;
        }
        while (i>=0){
            sum = arr1[i] + carry;
            res[k] = sum % 10;
            carry = sum / 10;
            i--;
            k--;
        }
        while (j>=0){
            sum = arr2[j] + carry;
            res[k] = sum % 10;
            carry = sum / 10;
            j--;
            k--;
        } 
        if(carry!=0){
            res[k] = carry;
        }
        System.out.println(res);
        

    }// end of void main
}//end of class