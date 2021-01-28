public class Array6_12 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int b[] = {5, 6};
        int c[] = {2, 6, 8};
        int d[] = {1, 0, 1, 5};
        // Two dimensional array
        int F[][] = {{1, 2, 3, 4}, {5, 6}, {2, 5, 6}, {1, 0, 1, 5}};
        int k[][] = new int[4][];
        k[0] = new int[4];
        k[1] = new int[2];
        k[2] = new int[3];
        k[3] = new int[4];

        for (int i[] : F) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
