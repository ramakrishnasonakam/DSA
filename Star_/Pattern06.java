public class Pattern06 {
    public static void main(String[] args) {
        int n=9;
        int stars = (n+1)/2;
        
        for (int i=1; i<=(n+1)/2; i++){
            for (int j=i;j<=stars; j++){
                System.out.print("*\t");
                
            }//end of printing left *

            for (int j=1; j<2*i; j++){
                System.out.print("\t");
            }//end of printing middle "\t"

            for (int j=i; j<=stars; j++){
                System.out.print("*\t");
            }//end of printing right *

            System.out.println("\n");
        }// end of n-times loop

        for (int i=1; i<stars; i++){
            for (int j=1;j<=(i+1);j++){
                System.out.print("*\t");
            }
            
            for (int j=1;j<=n-2*i;j++){  
                System.out.print("\t");
            }

            for (int j=1;j<=(i+1);j++){
                System.out.print("*\t");
            }

            System.out.println("\n");
        }    
    }// end of void main
}// end of class
