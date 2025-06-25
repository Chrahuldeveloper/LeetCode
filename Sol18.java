import java.util.Arrays;

public class Sol18 {

    public static void main(String[] args) {

        int[] nums = { 3, 1, 2, 4 };
        int[] res = new int[nums.length];
        int front = 0;
        int back = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                res[front++] = num;
            } else {
                res[back--] = num;
            }
        }

        System.out.println(Arrays.toString(res));

    }

}
