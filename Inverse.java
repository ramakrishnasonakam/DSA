import java.lang.Math;
class Inverse{
    public static void checkLength(int x) {
        int count = 0;
        while(x>0) {
            x = x%10;
            count++;
        }//end of while block
        System.out.println(count);
    }// end of checkLength
    public static void digitInverse(int x) {
        int value = 1;
        int sum = 0;
        int rem = 0;
        int count = 0;
        /*
        Since the digits can't be greater than the length of the integer itself 
        */
        while (x>0){
            x = x/10;
            count++;
        }
        while (x>0) {
            rem = x%10;
            if (rem<(count+1)) {
            sum = sum + (value * ((int) Math.pow(10, rem-1)));
            x = x/10;
            value++;
            }// end of if condition
        }// end of while loop
        System.out.println(sum);
    }// end of digitInverse
     public static void main(String[] args) {
        int x = 416523;
        checkLength(x);    
    }
}// end of Inverse
