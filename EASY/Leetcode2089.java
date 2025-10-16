import java.util.*;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        Arrays.sort(nums);

        List<Integer> res = new ArrayList<>();

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                res.add(mid);
                int left = mid - 1;
                // search left side 
                while (left >= 0 && nums[left] == target) {
                    res.add(left);
                    left--;
                }

                // search right side
                int right = mid + 1;
                while (right < nums.length && nums[right] == target) {
                    res.add(right);
                    right++;
                }

                break;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        Collections.sort(res);
        return res;
    }
}
