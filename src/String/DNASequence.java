package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DNASequence {
    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        if(s.length() < 10) {
            return res;
        }

        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i <= s.length() - 10; i++) {
            String sub = s.substring(i, i+10);
            if(map.containsKey(sub)) {
                map.put(sub, map.get(sub) + 1);
            } else {
                map.put(sub, 1);
            }

            if(map.get(sub) == 2) {
                res.add(sub);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(findRepeatedDnaSequences(s).toString());
    }


}
