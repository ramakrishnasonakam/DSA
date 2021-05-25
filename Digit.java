import java.util.Scanner;
class Digit {
    public static void printDigit(int x){
        int temp = x;
        int div = 1;
        if (x<10){
            // Sysste.;
        }// end of base case
        while(temp > 0) {
            temp = temp/10;
            div = div * 10;
        }// end of while block
        System.out.println(div);
        while(x > 0){
            div = div / 10;
            System.out.println(x/div); 
            x = x % div;
        }//end of while block
    }//end of printDigit
    public static void main(String[] args) {
        int x = 95123;
        printDigit(x); 
    }
    
}// end of Digit