public class Sol8 {
    public static void main(String[] args) {
        int nums[] = { 1,0,1,1,1 };
        int target = 0;

        boolean index = binarySearch(nums, target);

        System.out.println(index);

    }

    public static boolean binarySearch(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (nums[mid] == target)
                return true;

            if (nums[left] <= nums[mid]) {

                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }

        return false;

    }
}
