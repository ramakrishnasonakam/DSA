/*
Counting and returning the number of digits in
the given integer
*/

import java.util.Scanner;
class Digits {
    public static void countDigits(int x) {
        if (x == 0) {
            return;
        }// end of base case    
        int count = 0;
        while (x > 0){
            x = x / 10;
            count++;
        }
        System.out.println(count);
        // end of while
    }// end of countDigits
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        countDigits(x);
    }//end of void main
}// end of Digits
