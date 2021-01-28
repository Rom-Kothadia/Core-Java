public class Array6_11 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int b[] = {5, 6, 8, 7};
        int c[] = {2, 5, 6, 8};
        int d[] = {1, 0, 1, 5};
        // Two dimensional array
        int F[][] = {{1, 2, 3, 4}, {5, 6, 8, 7}, {2, 5, 6, 8}, {1, 0, 1, 5}};
        for (int i[] : F) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
