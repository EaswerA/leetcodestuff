class Solution {
    public int longestPalindrome(String s) {
        if(s.length()<=1){
            return 1;
        }
        HashSet<Character> chars= new HashSet<>();
        int l=0;
        for(char c:s.toCharArray()){
            if(chars.contains(c)){
                chars.remove(c);
                l+=2;
            }
            else{
                chars.add(c);
            }
        }
        if(!chars.isEmpty()){
            l+=1;
        }
        return l;
    }
}
