class Solution {
    public int findMin(int[] nums) {
        return DC(0, nums.length - 1, nums);
    }
    int DC(int l, int r, int[] nums) {
        if (l == r)
            return nums[l];

        if (nums[l] < nums[r])
            return nums[l];

        int m = (l + r) >> 1;
        return Math.min(DC(l, m, nums), DC(m + 1, r, nums));
    }
}
