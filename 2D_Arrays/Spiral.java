class SpiralArray {
    public static void main(String[] args){
        int[][] arr = 
        {
            { 1, 2, 3, 4, 5}, 
            {6, 7, 8, 9, 10}, 
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        }; //end of 2D array
        
        int minc = 0;
        int minr = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;

        while(true){

        /* down */
            if (minr > maxr){
                break;
            }

            for (int i = minr; i <= maxr; i++){
                System.out.println(arr[i][minc]);
            }
            minc++;

            if (minc > maxc){
                break;
            }

        /* right */
            for (int i = minc; i <= maxc; i++){
                System.out.println(arr[maxr][i]);
            }
            maxr--;

            if (minr > maxr){
                break;
            }

        /* up */
            for (int i = maxr; i >= minr; i--){
                System.out.println(arr[i][maxc]);
            }
            maxc--;

            if(minc > maxc){
                break;
            }

        /* left */
            for (int i = maxc; i >= minc; i--){
                System.out.println(arr[minr][i]);
            }
            minr++;

            if (minr > maxr){
                break;
            }

        }//end of process

    }// end of void main
}// end of class
