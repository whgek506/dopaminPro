class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean result = false;
        boolean good = true;
        
        if(x1) {
            if(!x2) answer = true; 
            else answer = true;
        }else if(!x1) {
            if(x2) answer = true;
            else answer = false;
        }
        
        if(x3) {
            if(x4) result = true;
            else result = true;
        }else if(!x3) {
            if(!x4) result = false;
            else result = true;
        }
        
        if(answer) {
            if(result)  good=true;
            else good=false;
        }else if(!answer) {
            if(result) good=false;
            else good=false;
        }
        
        return good;
    }
}