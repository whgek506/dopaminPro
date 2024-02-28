class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        for(int i=0; i<index_list.length; i++) {
            char result = my_string.charAt(index_list[i]);
            answer += result;
        } 
        
        
        return answer;
    }
}