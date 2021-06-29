class MatrixRotation{
    static void Rotation(int a[][], int N) {
        for (int i = 0; i < N/2; i++){
            for (int j = i; j < N - i - 1; j++){

                int temp = a[i][j];
                a[i][j] = a[N - 1 - j][i];
                a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j];
                a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i];
                a[j][N - 1 - i] = temp;

            }// end of j
        }// end of i
    }// end of void Rotation

    static void printMatrix(int a[][], int N) {
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                System.out.print(a[i][j] + " ");
                System.out.println();
            }
        }
    }//end of printMatrix

    public static void main(String[] args) {
        int a[][] = 
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int N = 3;
        Rotation(a, N);
        printMatrix(a, N);
    }

}// end of MatrixRotation