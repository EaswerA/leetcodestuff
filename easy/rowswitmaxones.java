class Solution {

    public static int[] maxOnesHelper(int[][] matrix)
    {
        int n = matrix.length;
        int m = matrix[0].length;
        int ans[] = new int[2];

        int maxRow= 0;
        int maxCount = 0;

        for(int i = 0;i<n;i++)
        {
            int count=0;
            for(int  j = 0;j<m;j++)
            {
                count += matrix[i][j];
            }

            if(count > maxCount){
                maxCount = count;
                maxRow = i;
            }
        }

        ans[0] = maxRow;
        ans[1] = maxCount;

        return ans;
    }

    public int[] rowAndMaximumOnes(int[][] mat) {
        return maxOnesHelper(mat);
    }
}
