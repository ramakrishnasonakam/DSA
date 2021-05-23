import java.util.Scanner;
class Main {
     static boolean isPrime(int a) {
        if (a<=1) {
            return false;
        } // end of if
        for (int i=2; i<a; i++) {
            if (a % i == 0) {
                return false;
            }// end of if block
        }// end of for block
        return true;
    
    }//end of isPrime
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the integer: ");
        a = sc.nextInt();
        if (isPrime(a)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }


    }// end of void main
}// end of class Main
