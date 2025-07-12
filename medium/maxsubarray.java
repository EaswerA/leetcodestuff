class Solution{
    public int maxSubArray(int[] nums){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int start = 0;
        int mstart = 0;
        int mend = 0;

        for (int i = 0; i < nums.length; i++){
            sum+=nums[i];
            if (sum>max){
                max=sum;
                mstart=start;
                mend=i;
            }
            if (sum<0){
                sum=0;
                start=i+1;
            }
        }
        int[] maxsubarray = new int[mend-mstart+1];
        System.arraycopy(nums,mstart,maxsubarray,0,maxsubarray.length);
        return maxsubarray;
        return max;
    }
}