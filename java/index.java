import java.util.Arrays;

class Solution {
    public int minimumSum(int num) {

        int[] numArr = new int[4];
        int idx = 0;

        while (num > 0) {
            numArr[idx++] = num % 10;
            num /= 10;
        }

        Arrays.sort(numArr);

        int num1 = numArr[0] * 10 + numArr[2];
        int num2 = numArr[1] * 10 + numArr[3];

        return num1 + num2;

    }

}