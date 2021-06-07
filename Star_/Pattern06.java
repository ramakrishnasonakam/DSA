public class Pattern06 {
    public static void main(String[] args) {
        int n=7;
        int stars = n-1;
        int spaces = 1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<stars; j++){
                System.out.print("*\t");
            }//left *

            for (int j=1; j<=spaces; j++){
                System.out.print("\t");
            }//middle "\t"

            for (int j=1; j<stars; j++){
                System.out.print("*\t");
            }
            
            if (i<=stars){
                stars = stars - 1;
                spaces = spaces + 2;
            }

            if (i>stars){
                stars = stars + 1;
                spaces = spaces - 2;
            }

            System.out.println("\n");



        }// n-times loop
    }// end of void main
}// end of class