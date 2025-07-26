class Solution{
    public int rob(int[] nums){
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int max1=robLinear(nums,0,nums.length-2);
        int max2=robLinear(nums,1,nums.length-1);
        return Math.max(max1,max2);
    }
    private int robLinear(int[] arr,start,end){
        int prev=0;
        int max=0;
        for(int i = start; i<=end;i++){
            int temp=Math.max(max,prev+arr[i]);
            prev=max;
            max=temp;
        }
        return max;
    }
}