import java.util.*;
public class Pattern04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<i;j++){
                System.out.print(" ");
            }// end of 1st for loop
            for (int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }// end of for loop

    }//end of void main
}//end of class