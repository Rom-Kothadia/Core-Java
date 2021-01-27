import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        int a = 1221, r, s = 0;
        int t=a;
        while (a > 0) {
            r = a % 10;
            a = a / 10;
            s = 10 * s + r;
        }
        if (s == t)
            System.out.println(t+" is palindrome number");
        else
            System.out.println(t+" is not a palindrome number");
    }
}

