class Prime {
    static boolean isPrime(int x){
        for (int i=2; i<=x/2;i++){
            if (x % i == 0) {
                return false;
            
            }// end of if block
        }// end of for loop
            return true;
    }//end of isPrime
    public static void rangePrime(int x, int y) {
        for (int i=x; i<=y; i++) {
            if (isPrime(i)){
                System.out.println(i);
                }// end of if block
            // else {
            //     continue;
            //}//end of else block
        }// end of rangePrime
    }// end of rangePrime
    public static void main(String[] args) {
        int x = 2;
        int y = 10;
        rangePrime(x, y);
    }// end of void main
}//end of Prime