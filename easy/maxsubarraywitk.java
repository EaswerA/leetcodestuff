class Solution{
    public int maximSum(int[] nums ,int k){
        int maxSum=0;
        int maxNum=0;
        for (int num : nums){
            if (num>maxNum){
                maxNum=num;
            }
        }
        while (k>0){
            maxScore+=maxNum;
            maxNum++;
            k--
        }
        return maxSum;
    }
}