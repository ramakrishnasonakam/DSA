import java.util.Scanner;
class Fib {
    public static void fibSeries(int x) {
        int n1 = 0;
        int n2 = 1;
        for (int i=0; i<x; i++){
            System.out.println(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3; 
            
        }// end of for block
    }// end of fibSeries
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int x = sc.nextInt();
        fibSeries(x);
    }
}// end of Main
