import java.util.HashMap;
class Solution {
    public int firstUniqChar(String s) {
        if(s.length() == 0){
            return -1;
        }
        HashMap<Character, Integer> charind = new HashMap();
        for(Character c : s.toCharArray()){
            if(charind.containsKey(c)){
                charind.put(c, charind.get(c)+1);
            }else{
                charind.put(c, 1);
            }
        }
        int ind = -1;
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(charind.get(arr[i]) == 1){
                ind = i;
                break;
            }
        }

        return ind;
    }
}