import java.util.*;

class pythagorasTriplets {
    public static void triplets(int a, int b, int c){
        if ((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a)) {
            System.out.printf("Pythagorean Triplets");
        }// end of if-block
        else {
            System.out.println("Not a pythagorean triplet");
        }
                
   }// end of triplets
            
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        triplets(a, b, c);
    
    }// end of void main

}// end of class
        
    