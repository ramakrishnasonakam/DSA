_ _ *
_ * * *
* * * * *
_ * * *
_ _ *


import java.util.Scanner;
public class Pattern05{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = n-1;
        int stars = 1;
        for (int i=1;i<=n;i++){
            for (int j=1; j<spaces; j++){
                System.out.print(" ");
            }//printing spaces
            for (int j=1; j<=stars; j++){
                System.out.print("* ");
            }
            if (spaces>i){
                spaces = spaces - 1;
                stars = stars + 2;

            }
            
            if (spaces<i){
                spaces = spaces + 1; 
                stars = stars - 2;
            }

            
            System.out.println();
        }// end of for loop
    }//end of void main
}// end of class
