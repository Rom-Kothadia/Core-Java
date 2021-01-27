import java.util.Random;

public class Array6_6 {
    public static void main(String[] args) {
        Random r = new Random();
        int a[] = new int[10];
        for (int i=0;i<a.length;i++){
            a[i]=r.nextInt(100);
        }
        for(int i : a)
            System.out.printf("%d,",i);
        System.out.println("\n"+a[2]);
    }
}
