import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] present = new boolean[nums.length];
        for (int i= 0; i < nums.length; i++){
            present[nums[i]-1] = true;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i=0; i<present.length; i++){
            if(!present[i]){
                ans.add(i+1);
            }
        }
        return ans;
    }
}