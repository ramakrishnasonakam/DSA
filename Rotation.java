import java.lang.Math;
class Rotation {
    /*Variable doc - 
    X - The number of digits in the number
    n - The given integer
    K - The given number of rotation(s)*/
    static int countDigit(int n) {
        int X = 0;
        while(n>0) {
            n = n/10;
            X++;
        }// end of while loop
        return X;
    }// end of countDigit
    
    public static void kRotation(int n, int K) {
        int X = countDigit(n);
        K = K % X;
        if (K<0) {
            K = X + K;
        }// end of if block
        int extNo = n / (int) Math.pow(10, K);
        n = n % (int) Math.pow(10, K);
        int size = countDigit(extNo);
        for (int i=1; i<=size; i++){
            n *= 10;
        }// end of for loop
        n = n + extNo;
        System.out.println(n);
    }//end of kRotation
        
    public static void main(String[] args) {
        int N = 12345;
        int K = -2; 
        kRotation(N, K);
    }// end of main
}//end of Rotation