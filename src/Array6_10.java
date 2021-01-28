import java.util.Random;

public class Array6_10 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Random r = new Random();
        for (int i=0;i<nums.length;i++){
            nums[i] = r.nextInt(50);
        }
        for (int a : nums){
            System.out.println(a);
        }
    }
}
