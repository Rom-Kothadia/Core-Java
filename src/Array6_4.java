public class Array6_4 {
    public static void main(String[] args) {
        int a[] = new int[3];
        for(int i=0;i<a.length;i++) {
            a[i] = i + 1;
        }
         for(int i : a)
            System.out.println(i);
    }
}
