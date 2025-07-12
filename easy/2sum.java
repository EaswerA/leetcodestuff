import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numtoind = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numtoind.containsKey(target - nums[i])) {
                return new int[] { numtoind.get(target - nums[i]), i };
            }
            numtoind.put(nums[i], i);
        }
        return new int[] {};
    }
}
