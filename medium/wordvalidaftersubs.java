class Solution {
    public boolean isValid(String s) {
        int i = 0;
        char[] chararr = s.toCharArray();
        for(int j=0;j<s.length();j++){
            chararr[i]=chararr[j];
            i++;
            if(i>=3 && chararr[i-3]=='a' && chararr[i-2]=='b' && chararr[i-1]=='c'){
                i-=3;
            }
        }
        return i==0;
    }
}
