import java.util.*;

class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i<intStrs.length; i++){
            char[] arrChar = intStrs[i].toCharArray();
            String str = "";
            for(int j=s; j<s+l; j++){
              str += Character.toString(arrChar[j]);
            }
            if( k < Integer.parseInt(str) ) {
                result.add(Integer.parseInt(str));
            }
            
        }

        return result;
    }
}
