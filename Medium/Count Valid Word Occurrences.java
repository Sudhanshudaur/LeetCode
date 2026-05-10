import java.util.*;
import java.util.regex.*;
class Solution {
    public int[] countWordOccurrences(String[] chunks, String[] queries) {
        
        StringBuilder sb = new StringBuilder();

        for(String str : chunks){
            sb.append(str);
        }

        String s = sb.toString();

        HashMap<String, Integer> map = new HashMap<>();

        Pattern p = Pattern.compile("[a-z]+(?:-[a-z]+)*");
        Matcher m = p.matcher(s);

        while (m.find()){
            String w = m.group();
            map.put(w, map.getOrDefault(w, 0)+1);
        }
        
        int[] ans = new int[queries.length];
        for (int i=0; i<queries.length; i++){
            ans[i] = map.getOrDefault(queries[i], 0);
            }
        
        return ans;
    }
}
