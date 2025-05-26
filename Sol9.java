public class Sol9 {

    public static void main(String[] args) {

        int nums[] = { 1, 3, 4, 2, 2 };

        int duplicateNumber = binarySearch(nums);

        System.out.println(duplicateNumber);

    }

    public static int binarySearch(int nums[]) {

        int left = 1;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            int count = 0;

            for (int i : nums) {
                if (i <= mid) {
                    count++;
                }
            }

            if (count > mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
