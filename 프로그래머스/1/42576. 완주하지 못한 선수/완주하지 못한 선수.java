import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
	    HashMap<String, Integer> hm = new HashMap<>();
	    for (String people : participant) hm.put(people, hm.getOrDefault(people, 0) + 1);
	        for (String people : completion) hm.put(people, hm.get(people) - 1);
	        for (String key : hm.keySet()) {
	            if (hm.get(key) != 0){
	            	answer += key + "";
                    System.out.println(answer);
	            }
	        }
	        return answer;
    }
}