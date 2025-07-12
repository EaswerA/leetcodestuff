class Solution {
    public boolean isThree(int n) {
        int count = 0;
        for(int a=1;a<=n;a++)
        {
            if(n%a==0)
            {
                count++;
            }
        }
        if(count==3){
            return true;
        }
        else{
            return false;
        }
    }
}