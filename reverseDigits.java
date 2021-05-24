import java.util.Scanner;
class reverseDigits {
    public static void digits(int x) {
        int rem = 0;
        while (x > 0) {
            rem = x % 10;
            x = x/10;
            System.out.println(rem);
        }//end of while loop
        
    }// end of digits
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        digits(x);
    }//end of main
}// end of printDigits