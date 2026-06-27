package TCSNQT;

import java.util.*;

public class Scores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        String[] parts = s.split(",");

        HashMap<Integer, Integer> map = new LinkedHashMap<>();

        //count freq
        for (String str : parts) {
            int num = Integer.parseInt(str.trim());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        for (int i = 0; i < k && i < list.size(); i++) {
            System.out.print(list.get(i).getKey() + " ");
        }
    }
}