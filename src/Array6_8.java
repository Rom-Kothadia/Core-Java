public class Array6_8 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = {5,6,8,7};
        int c[] = {2,5,6,8};
        int d[] = {1,0,1,5};
        // Two dimensional array
        int F[][] = {{1,2,3,4},{5,6,8,7},{2,5,6,8},{1,0,1,5}};
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(F[i][j]+" ");
            }
            System.out.println();
        }
    }
}
