import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> arr = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (arr.containsKey(nums[i])) {
                return true;
            }
            arr.put(nums[i], 1);
        }
        return false;
    }
}